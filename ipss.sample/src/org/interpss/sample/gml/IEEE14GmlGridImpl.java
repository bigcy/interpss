package org.interpss.sample.gml;

import java.util.List;

import org.graphdrawing.gml.GraphType;
import org.graphdrawing.gml.GraphmlType;
import org.gridgain.grid.Grid;
import org.interpss.PluginSpringAppContext;
import org.interpss.custom.IpssFileAdapter;
import org.interpss.gridgain.GridRunner;
import org.interpss.gridgain.msg.RemoteMessageTable;
import org.interpss.gridgain.util.GridUtil;
import org.interpss.sample.grid.impl.GridHelper;
import org.interpss.sample.grid.impl.multi.CustomMultiLocalTask;

import com.interpss.common.SpringAppContext;
import com.interpss.common.datatype.Constants;
import com.interpss.core.aclf.netAdj.AclfAdjNetwork;
import com.interpss.simu.SimuContext;
import com.interpss.simu.SimuCtxType;
import com.interpss.simu.SimuObjectFactory;
import com.interpss.simu.multicase.aclf.AclfMultiStudyCase;
import com.interpss.simu.multicase.aclf.AclfStudyCase;
import com.interpss.simu.multicase.modify.Modification;

public class IEEE14GmlGridImpl {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// InterPSS core simulation engine configuration
		SpringAppContext.setAppContext(Constants.SpringConfigPath_Plugin);

    	// Build the base case network
		IpssFileAdapter adapter = PluginSpringAppContext.getCustomFileAdapter("ieee");
		SimuContext simuCtx = adapter.load("testData/ieee14.ieee");
		AclfAdjNetwork adjNet = simuCtx.getAclfAdjNet();
		
		AclfMultiStudyCase mCaseContainer = SimuObjectFactory.createAclfMultiStudyCase(SimuCtxType.ACLF_ADJ_NETWORK);
		// save the base case Network model
		mCaseContainer.setBaseNetModelString(adjNet.serialize());
		mCaseContainer.setRemoteJobCreation(true);
		
		// load the Gml file
		GraphmlType gml = GmlHelper.load("testData/gml/sample_001.gml");
		
		// retrieve all Graph objects, there may be more than one graphs
		List<GraphType> glist = GmlHelper.getGraphObjects(gml);
		
		int caseNo = 0;		
		for (GraphType graph : glist) {
			// for each Gml graph, create a grid computing study case
			String caseId = graph.getId() != null? graph.getId() : ("CaseId_");
			AclfStudyCase studyCase = SimuObjectFactory.createAclfStudyCase(caseId+(++caseNo), 
					graph.getDesc(), caseNo, mCaseContainer);
			// use the modification object to send the graph object to remote node
			Modification mod = SimuObjectFactory.createModification();
			mod.setAny(GmlHelper.toXmlString(graph));
			studyCase.setModification(mod);			
		}
		
		// perform multi-case grid computing. The case will distributed to slave grid nodes
		// in random fashion. The actual work is done by the MyAclfMultiJobTask class, which
		// has to be implemented by the implementor
		Grid grid = GridHelper.initGridEnv();
		if (grid != null) {
			long timeout = 0;
			RemoteMessageTable[] resultAry = new GridRunner(grid)
					.executeMultiJob(CustomMultiLocalTask.class, mCaseContainer, timeout);
		}
		
		GridUtil.stopDefaultGrid();		
	}
}
