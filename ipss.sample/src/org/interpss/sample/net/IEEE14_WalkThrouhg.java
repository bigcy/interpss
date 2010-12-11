 /*
  * @(#)IEEE14_WalkThrouhg.java   
  *
  * Copyright (C) 2006-2010 www.interpss.org
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
  * @Date 12/10/2010
  * 
  *   Revision History
  *   ================
  *
  */
package org.interpss.sample.net;

import java.util.logging.Level;

import org.interpss.IpssPlugin;
import org.interpss.PluginObjectFactory;
import org.interpss.custom.IpssFileAdapter;

import com.interpss.core.CoreObjectFactory;
import com.interpss.core.aclf.AclfNetwork;
import com.interpss.core.algorithm.ActivePowerPathWalkAlgorithm;
import com.interpss.core.algorithm.ActivePowerPathWalkEnum;
import com.interpss.core.common.visitor.IAclfNetBVisitor;
import com.interpss.core.common.visitor.IBranchBVisitor;
import com.interpss.core.common.visitor.IBusBVisitor;
import com.interpss.core.net.Branch;
import com.interpss.core.net.Bus;

public class IEEE14_WalkThrouhg {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// InterPSS plugin initialization
		IpssPlugin.init(Level.WARNING);

    	/*
    	 * step-1 input the base case 
    	 */
		AclfNetwork net = PluginObjectFactory
				.getFileAdapter(IpssFileAdapter.FileFormat.IEEECDF)
				.load("testData/ieee14.ieee")
				.getAclfNet();
    		
		/*
		 * step-2 Define LF algorithm and run Loadflow
		 */
	  	IAclfNetBVisitor algo = CoreObjectFactory.createLfAlgoVisitor();;
	  	net.accept(algo);

	  	/*
	  	 * Step-3 define the walk through algorithm. The algorithm is nothing other then 
	  	 *        print out bus and branch id
	  	 */
  		ActivePowerPathWalkAlgorithm walkAlgo = CoreObjectFactory.createActivePowerPathWalkAlgorithm();
  		walkAlgo.setBusVisitor(new IBusBVisitor() {
			@Override
			public boolean visit(Bus bus) {
				System.out.println("\nBus: " + bus.getId() + " visited");
				return true;
			}
  		});
  		walkAlgo.setBranchVisitor(new IBranchBVisitor() {
			@Override
			public boolean visit(Branch branch) {
				System.out.println("Branch: " + branch.getId() + " visited");
				return true;
			}
  		});
  		
  		/*
  		 * Step-4 Walk through the network from source to load along the active power flow direction
  		 */
		System.out.println("Source to Load direction");
  		walkAlgo.setDirection(ActivePowerPathWalkEnum.SOURCE_TO_LOAD);
  		net.accept(walkAlgo);
  		
  		/*
  		 * Step-5 Walk through the network from load to source along the reverse active power flow direction 
  		 */
		System.out.println("\nLoad to Source direction");
  		walkAlgo.setDirection(ActivePowerPathWalkEnum.LOAD_TO_SOURCE);
  		net.accept(walkAlgo);
	}
}