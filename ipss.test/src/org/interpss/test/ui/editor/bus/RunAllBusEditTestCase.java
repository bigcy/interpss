package org.interpss.test.ui.editor.bus;

import java.util.logging.Level;

import junit.framework.TestCase;

import org.interpss.test.ui.editor.bus.aclf.TestAclfAdjBusEditorCase;
import org.interpss.test.ui.editor.bus.aclf.TestAclfBusEditorCase;
import org.interpss.test.ui.editor.bus.acsc.TestAcscBusEditorCase;
import org.interpss.test.ui.editor.bus.dist.TestDistBusEditorCase;
import org.interpss.test.ui.editor.bus.dist.TestGeneratorBusEditorCase;
import org.interpss.test.ui.editor.bus.dist.TestIndMotorBusEditorCase;
import org.interpss.test.ui.editor.bus.dist.TestMixedLoadBusEditorCase;
import org.interpss.test.ui.editor.bus.dist.TestSynMotorBusEditorCase;
import org.interpss.test.ui.editor.bus.dist.TestUtilityBusEditorCase;
import org.interpss.test.ui.editor.bus.dstab.TestDStabBusEditorCase;

import com.interpss.common.util.IpssLogger;

public class RunAllBusEditTestCase extends TestCase {
	public static void main(String args[]) {
 		IpssLogger.getLogger().setLevel(Level.WARNING);		
		runAll();
	}
	
	public static void runAll() {
		System.out.println("Run All ui.edit.bus test cases");
		System.out.println("==============================");
		junit.textui.TestRunner.run(TestBusBaseInfoEditorCase.class);
		junit.textui.TestRunner.run(TestAclfBusEditorCase.class);
		junit.textui.TestRunner.run(TestAclfAdjBusEditorCase.class);
		junit.textui.TestRunner.run(TestAcscBusEditorCase.class);
		junit.textui.TestRunner.run(TestDStabBusEditorCase.class);

		System.out.println("Run All ui.edit.bus.dist test cases");
		System.out.println("===================================");
		junit.textui.TestRunner.run(TestDistBusEditorCase.class);
		junit.textui.TestRunner.run(TestUtilityBusEditorCase.class);
		junit.textui.TestRunner.run(TestGeneratorBusEditorCase.class);
		junit.textui.TestRunner.run(TestSynMotorBusEditorCase.class);
		junit.textui.TestRunner.run(TestIndMotorBusEditorCase.class);
		junit.textui.TestRunner.run(TestMixedLoadBusEditorCase.class);
	}
}