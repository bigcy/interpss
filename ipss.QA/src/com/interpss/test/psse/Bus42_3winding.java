 /*
  * @(#)CR_UserTestCases.java   
  *
  * Copyright (C) 2008 www.interpss.org
  *
  * This program is free software; you can redistribute it and/or
  * modify it under the terms of the GNU LESSER GENERAL PUBLIC LICENSE
  * as published by the Free Software Foundation; either version 2.1
  * of the License, or (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * @Author Mike Zhou
  * @Version 1.0
  * @Date 02/15/2008
  * 
  *   Revision History
  *   ================
  *
  */

package com.interpss.test.psse;

import static org.junit.Assert.assertTrue;

import org.interpss.PluginObjectFactory;
import org.interpss.custom.IpssFileAdapter;
import org.junit.Test;

import com.interpss.core.CoreObjectFactory;
import com.interpss.core.aclf.AclfNetwork;
import com.interpss.core.algo.AclfMethod;
import com.interpss.core.algo.LoadflowAlgorithm;
import com.interpss.test.QATestSetup;

public class Bus42_3winding extends QATestSetup {
	@Test
	public void testCaseNoDC() throws Exception {
		AclfNetwork net = PluginObjectFactory
				.getFileAdapter(IpssFileAdapter.FileFormat.PSSE, IpssFileAdapter.Version.PSSE_30)
				.loadDebug("testData/psse/42bus_3winding_from_PSSE_V30_NoDC.raw")
				.getAclfNet();	

		LoadflowAlgorithm algo = CoreObjectFactory.createLoadflowAlgorithm(net);
		algo.setLfMethod(AclfMethod.NR);
	  	algo.loadflow();
  		//System.out.println(net.net2String());
	  	
  		assertTrue(net.isLfConverged());	
	}

	//@Test
	public void testCase1() throws Exception {
		AclfNetwork net = PluginObjectFactory
				.getFileAdapter(IpssFileAdapter.FileFormat.PSSE, IpssFileAdapter.Version.PSSE_30)
				.load("testData/psse/42bus_3winding_from_PSSE_V30.raw")
				.getAclfNet();	

//		LoadflowAlgorithm algo = CoreObjectFactory.createLoadflowAlgorithm(net);
//	  	algo.loadflow();
//  		//System.out.println(net.net2String());
//	  	
//  		assertTrue(net.isLfConverged());	
	}
}
