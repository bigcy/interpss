 /*
  * @(#)NBGroundInputPanel.java   
  *
  * Copyright (C) 2006 www.interpss.org
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
  * @Date 09/15/2006
  * 
  *   Revision History
  *   ================
  *
  */

package org.interpss.editor.ui.edit.common;

import java.util.Vector;

import org.interpss.editor.data.common.GroundData;
import org.interpss.editor.jgraph.ui.edit.IFormDataPanel;

import com.interpss.common.datatype.ScGroundType;
import com.interpss.common.ui.SwingInputVerifyUtil;
import com.interpss.common.util.IpssLogger;
import com.interpss.common.util.Number2String;


public class NBGroundInputPanel extends javax.swing.JPanel implements IFormDataPanel {
	private static final long serialVersionUID = 1;

	private GroundData  _form = null;

	public void initPanel() {
		DataVerifier verifier = new DataVerifier();
    	this.gRField.setInputVerifier(verifier);
    	this.gXField.setInputVerifier(verifier);
	}

	public void init(Object netContainer, Object form) {
		IpssLogger.getLogger().info("NBGroundInputPanel init() called");
		_form = (GroundData)form;
	}
	
    public boolean setForm2Editor() {
		IpssLogger.getLogger().info("NBGroundInputPanel setForm2Editor() called");
        this.gXField.setEnabled(false);
        this.gRField.setEnabled(false);
		if (_form.getCode().equals(ScGroundType.GType_ZGrounded)) {
    		this.zGRadioButton.setSelected(true);
        	this.gXField.setEnabled(true);
        	this.gRField.setEnabled(true);
			this.gXField.setText(Number2String.toStr(_form.getX(), "#0.0###"));
			this.gRField.setText(Number2String.toStr(_form.getR(), "#0.0###"));
		}
		else if (_form.getCode().equals(ScGroundType.GType_Ungrounded))
    		this.unGRadioButton.setSelected(true);
    	else
    		this.solidGRadioButton.setSelected(true);
    	return true;
	}
    
    public boolean saveEditor2Form(Vector errMsg) throws Exception {
		IpssLogger.getLogger().info("NBGroundInputPanel saveEditor2Form() called");
		boolean ok = true;

		if (this.zGRadioButton.isSelected()) {
			_form.setCode(ScGroundType.GType_ZGrounded);

			if (!SwingInputVerifyUtil.largeEqualThan(this.gXField, 0.0d)) {
				errMsg.add("Grounding X < 0.0");
				ok = false;
			}
    		_form.setX(SwingInputVerifyUtil.getDouble(this.gXField));

			if (!SwingInputVerifyUtil.largeEqualThan(this.gRField, 0.0d)) {
				errMsg.add("Grounding R < 0.0");
				ok = false;
			}
    		_form.setR(SwingInputVerifyUtil.getDouble(this.gRField));
		}
		else if (this.solidGRadioButton.isSelected()) {
			_form.setCode(ScGroundType.GType_SolidGrounded);
		}	
		else
			_form.setCode(ScGroundType.GType_Ungrounded);

		return ok;
    }
    
	// The following code is controlled by NetBean IDE
	// ===============================================
    
    /** Creates new form NBGroundInputPanel */
    public NBGroundInputPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        groundButtonGroup = new javax.swing.ButtonGroup();
        gTypePanel = new javax.swing.JPanel();
        solidGRadioButton = new javax.swing.JRadioButton();
        zGRadioButton = new javax.swing.JRadioButton();
        unGRadioButton = new javax.swing.JRadioButton();
        groundXLabel = new javax.swing.JLabel();
        gXField = new javax.swing.JTextField();
        groundRLabel = new javax.swing.JLabel();
        gRField = new javax.swing.JTextField();
        gUnitLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        gTypePanel.setBorder(new javax.swing.border.TitledBorder(null, "Grounding", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));
        groundButtonGroup.add(solidGRadioButton);
        solidGRadioButton.setFont(new java.awt.Font("Dialog", 0, 12));
        solidGRadioButton.setText("SolidGrounded");
        solidGRadioButton.setName("solidGRadioButton");
        solidGRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solidTypeActionHandler(evt);
            }
        });

        gTypePanel.add(solidGRadioButton);

        groundButtonGroup.add(zGRadioButton);
        zGRadioButton.setFont(new java.awt.Font("Dialog", 0, 12));
        zGRadioButton.setText("Z-Grounded");
        zGRadioButton.setName("zGRadioButton");
        zGRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zTypeActionHandler(evt);
            }
        });

        gTypePanel.add(zGRadioButton);

        groundButtonGroup.add(unGRadioButton);
        unGRadioButton.setFont(new java.awt.Font("Dialog", 0, 12));
        unGRadioButton.setSelected(true);
        unGRadioButton.setText("Ungrounded");
        unGRadioButton.setName("unGRadioButton");
        unGRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unGTypeActionHandler(evt);
            }
        });

        gTypePanel.add(unGRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        add(gTypePanel, gridBagConstraints);

        groundXLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        groundXLabel.setText("     GroundX  ");
        groundXLabel.setPreferredSize(new java.awt.Dimension(70, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(groundXLabel, gridBagConstraints);

        gXField.setColumns(8);
        gXField.setText("0.0");
        gXField.setEnabled(false);
        gXField.setName("gXTextField");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(gXField, gridBagConstraints);

        groundRLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        groundRLabel.setText("          GroundR  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        add(groundRLabel, gridBagConstraints);

        gRField.setColumns(8);
        gRField.setText("0.0");
        gRField.setEnabled(false);
        gRField.setName("gRTextField");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        add(gRField, gridBagConstraints);

        gUnitLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        gUnitLabel.setText("  (Ohms)    ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        add(gUnitLabel, gridBagConstraints);

    }
    // </editor-fold>//GEN-END:initComponents

    private void unGTypeActionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unGTypeActionHandler
        gXField.setEnabled(false);
        gRField.setEnabled(false);
		this.gXField.setText("0.0");
		this.gRField.setText("0.0");
    }//GEN-LAST:event_unGTypeActionHandler

    private void zTypeActionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zTypeActionHandler
        gXField.setEnabled(true);
        gRField.setEnabled(true);
		this.gXField.setText(Number2String.toStr(_form.getR(), "#0.0###"));
		this.gRField.setText(Number2String.toStr(_form.getX(), "#0.0###"));
    }//GEN-LAST:event_zTypeActionHandler

    private void solidTypeActionHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solidTypeActionHandler
        gXField.setEnabled(false);
        gRField.setEnabled(false);
		this.gXField.setText("0.0");
		this.gRField.setText("0.0");
    }//GEN-LAST:event_solidTypeActionHandler
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gRField;
    private javax.swing.JPanel gTypePanel;
    private javax.swing.JLabel gUnitLabel;
    private javax.swing.JTextField gXField;
    private javax.swing.ButtonGroup groundButtonGroup;
    private javax.swing.JLabel groundRLabel;
    private javax.swing.JLabel groundXLabel;
    private javax.swing.JRadioButton solidGRadioButton;
    private javax.swing.JRadioButton unGRadioButton;
    private javax.swing.JRadioButton zGRadioButton;
    // End of variables declaration//GEN-END:variables

	class DataVerifier extends javax.swing.InputVerifier {
    	public boolean verify(javax.swing.JComponent input) {
			if (input == null)
				return false;
       		try {
       			if (input == gRField || input == gXField) 
 	       			return SwingInputVerifyUtil.getDouble((javax.swing.JTextField)input) >= 0.0;
 	       	} catch (Exception e) {
 	    		return false;
 	       	}		
			return true;
        }
    }
}
