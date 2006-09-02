package org.interpss.editor.ui.run;

import java.util.StringTokenizer;
import java.util.Vector;

import org.interpss.editor.data.proj.AclfCaseData;
import org.interpss.editor.form.GFormContainer;
import org.interpss.editor.form.GNetForm;
import org.interpss.editor.jgraph.ui.edit.IFormDataPanel;
import org.interpss.editor.jgraph.ui.form.IGNetForm;
import org.interpss.editor.runAct.RunActUtilFunc;
import org.interpss.editor.ui.IOutputTextDialog;
import org.interpss.editor.ui.UISpringAppContext;

import com.interpss.common.exp.InvalidOperationException;
import com.interpss.common.msg.IpssMessage;
import com.interpss.common.msg.IpssMsgListener;
import com.interpss.common.msg.SimuMessage;
import com.interpss.common.ui.VerifyUtil;
import com.interpss.common.util.IpssLogger;
import com.interpss.common.util.Num2Str;
import com.interpss.core.aclfadj.FunctionLoad;
import com.interpss.core.aclfadj.PQBusLimit;
import com.interpss.core.aclfadj.PSXfrPControl;
import com.interpss.core.aclfadj.PVBusLimit;
import com.interpss.core.aclfadj.RemoteQBus;
import com.interpss.core.aclfadj.TapControl;
import com.interpss.core.algorithm.AclfMethod;
import com.interpss.core.net.Area;
import com.interpss.core.net.IRegulationDevice;
import com.interpss.simu.SimuContext;

public class NBAclfCasePanel extends javax.swing.JPanel implements IFormDataPanel, IpssMsgListener {
	private static final long serialVersionUID = 1;

    private GFormContainer _netContainer = null;
    private SimuContext _simuCtx = null;

    // holds the current case data being edited
    private AclfCaseData _caseData = null;
	
    /** Creates new form NBAclfCasePanel */
    public NBAclfCasePanel() {
        initComponents();

        DataVerifier verifier = new DataVerifier();
        this.accFactorTextField.setInputVerifier(verifier);
        this.errKVATextField.setInputVerifier(verifier);
        this.errPUTextField.setInputVerifier(verifier);
        this.maxItrTextField.setInputVerifier(verifier);
    }
    
    /**
     * Implementation of the onMsgEvent method.
  	* 
  	* @param msg the msg object
     */
     public void onMsgEvent(IpssMessage msg) {
    	 if (msg instanceof SimuMessage) {
      	  	if (msg.getType() == SimuMessage.TYPE_LFLAB_MSG) {
    			IpssLogger.getLogger().info(msg.getMsgString());
    			msgOutTextArea.append(msg.getMsgString() + "\n");
      	  	}
    	 }
     }

     public boolean onMsgEventStatus(IpssMessage msg) {
  	   throw new InvalidOperationException("Method not implemented");
     }
     
    public void init(Object netContainer, Object net) {
		IpssLogger.getLogger().info("NBAclfCasePanel init() called");
	    _netContainer = (GFormContainer)netContainer;
	    _simuCtx = (SimuContext)net;
    	_simuCtx.getLoadflowAlgorithm().setInitBusVoltage(false);
    	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().setActivateAllAdjust(false);
		msgOutTextArea.setText("");
    	initAdvanceControlPanel();
    }
    	
	private void initAdvanceControlPanel() {
		Object[] list = RunActUtilFunc.getFunctionLoadList(_simuCtx.getAclfAdjNet(), 
				_simuCtx.getLoadflowAlgorithm().getTolerance(),
				_simuCtx.getMsgHub());
		if (list.length > 1) {
			funcLoadComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			funcLoadComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}
		funcLoadComboBox.setEnabled(list.length > 1);
		funcLoadButton.setEnabled(list.length > 1);

		list = RunActUtilFunc.getXfrTapControlList(_simuCtx.getAclfAdjNet(), 
				_simuCtx.getLoadflowAlgorithm().getTolerance()*_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().getVoltAdjToleranceFactor(),
				_simuCtx.getMsgHub());
		if (list.length > 1) {
			xfrTapControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			xfrTapControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}
		xfrTapControlComboBox.setEnabled(list.length > 1);
		xfrTapControlButton.setEnabled(list.length > 1);
		xfrTapControlXLabel.setEnabled(list.length > 1);
		xfrTapControlTextField.setEnabled(list.length > 1);

		list = RunActUtilFunc.getPSXfrPControlList(_simuCtx.getAclfAdjNet(), 
				_simuCtx.getLoadflowAlgorithm().getTolerance(),
				_simuCtx.getMsgHub());
		if (list.length > 1) {
			psXfrPControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			psXfrPControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}
		psXfrPControlComboBox.setEnabled(list.length > 1);
		psXfrPControlButton.setEnabled(list.length > 1);
		psXfrPControlXLabel.setEnabled(list.length > 1);
		psXfrPControlTextField.setEnabled(list.length > 1);

		list = RunActUtilFunc.getInterareaPControlList(_simuCtx.getAclfAdjNet(), _simuCtx.getMsgHub());
		if (list.length > 1) {
			interPControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			interPControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}
		interPControlComboBox.setEnabled(list.length > 1);
		interPControlButton.setEnabled(list.length > 1);
		interPControlXLabel.setEnabled(list.length > 1);
		interPControlTextField.setEnabled(list.length > 1);
		
		list = RunActUtilFunc.getRemoteQBusList(_simuCtx.getAclfAdjNet(), 
				_simuCtx.getLoadflowAlgorithm().getTolerance()*_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().getVoltAdjToleranceFactor(),
				_simuCtx.getMsgHub());
		if (list.length > 1) {
			remoteQBusComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			remoteQBusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}
		remoteQBusComboBox.setEnabled(list.length > 1);
		remoteQBusButton.setEnabled(list.length > 1);
		remoteQBusXLabel.setEnabled(list.length > 1);
		remoteQBusTextField.setEnabled(list.length > 1);
		
		list = RunActUtilFunc.getPQBusLimitList(_simuCtx.getAclfAdjNet(), _simuCtx.getMsgHub());
		if (list.length > 1) {
			pqBusLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			pqBusLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}
		pqBusLimitComboBox.setEnabled(list.length > 1);
		pqBusLimitButton.setEnabled(list.length > 1);
		
		list = RunActUtilFunc.getPVBusLimitList(_simuCtx.getAclfAdjNet(), _simuCtx.getMsgHub());
		if (list.length > 1) {
			pvBusLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel(list));
		}
		else {
			pvBusLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"No Adjustment Needed"}));
		}    	
		pvBusLimitComboBox.setEnabled(list.length > 1);
		pvBusLimitButton.setEnabled(list.length > 1);
    }

    public void setCaseData(AclfCaseData data) {
    	_caseData = data;
    }
    
	/**
	*	Set form data to the editor
	*
	* @return false if there is any problem
	*/
	public boolean setForm2Editor() {
		IpssLogger.getLogger().info("NBAclfCasePanel setForm2Editor() called");

        if (_netContainer != null && IGNetForm.AppType_Transmission.equals(_netContainer.getGNetForm().getAppType()))
            this.pqRadioButton.setSelected(true);
        else
        	this.nrRadioButton.setSelected(true);
        
        this.accFactorTextField.setText(Num2Str.toStr(_caseData.getAccFactor(), "#0.0#"));
        this.errPUTextField.setText(Num2Str.toStr(_caseData.getTolerance(), "#0.#####"));
        double baseKva = _netContainer != null? ((GNetForm)_netContainer.getGNetForm()).getBaseKVA() : 100000.0;
        this.errKVATextField.setText(Num2Str.toStr(_caseData.getTolerance()*baseKva, "#0.####"));
        this.maxItrTextField.setText(new Integer(_caseData.getMaxIteration()).toString());
        this.initVoltCheckBox.setSelected(_caseData.getInitBusVolt());
		this.lfSummaryCheckBox.setSelected(_caseData.getShowSummary());

		return true;
	}
    
	/**
	*	Save editor screen data to the form
	*
	* @param errMsg error messages during the saving process.
	* @return false if there is any problem
	*/
	public boolean saveEditor2Form(Vector errMsg) throws Exception {
		IpssLogger.getLogger().info("NBAclfCasePanel saveEditor2Form() called");
		boolean ok = true;

        if (this.nrRadioButton.isSelected())
        	_caseData.setMethod(AclfCaseData.Method_NR);
        else if (this.pqRadioButton.isSelected())
        	_caseData.setMethod(AclfCaseData.Method_PQ);
        else 
        	_caseData.setMethod("GS");

        if (!VerifyUtil.largeThan(this.errPUTextField, 0.0d)) {
            errMsg.add("Error tolerance <= 0.0");
            ok = false;
        }
        _caseData.setTolerance(VerifyUtil.getDouble(this.errPUTextField));

        if (!VerifyUtil.largeThan(this.maxItrTextField, 0)) {
            errMsg.add("Max iterations <= 0");
            ok = false;
        }
        _caseData.setMaxIteration(VerifyUtil.getInt(this.maxItrTextField));

        if (!VerifyUtil.largeThan(this.accFactorTextField, 0.0d)) {
            errMsg.add("GS acceleration factor <= 0.0");
            ok = false;
        }
        _caseData.setAccFactor(VerifyUtil.getDouble(this.accFactorTextField));

        _caseData.setInitBusVolt(this.initVoltCheckBox.isSelected());
        _caseData.setShowSummary(this.lfSummaryCheckBox.isSelected());

        return ok;
	}
    

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        methodButtonGroup = new javax.swing.ButtonGroup();
        runAclfTabbedPane = new javax.swing.JTabbedPane();
        mainPanel = new javax.swing.JPanel();
        methodPanel = new javax.swing.JPanel();
        nrRadioButton = new javax.swing.JRadioButton();
        pqRadioButton = new javax.swing.JRadioButton();
        gsRadioButton = new javax.swing.JRadioButton();
        paramPanel = new javax.swing.JPanel();
        toleranceLabel = new javax.swing.JLabel();
        errPUTextField = new javax.swing.JTextField();
        errPUUnitLabel = new javax.swing.JLabel();
        errKVATextField = new javax.swing.JTextField();
        errKVAUnitLabel = new javax.swing.JLabel();
        maxItrLabel = new javax.swing.JLabel();
        maxItrTextField = new javax.swing.JTextField();
        accFactorLabel = new javax.swing.JLabel();
        accFactorTextField = new javax.swing.JTextField();
        initVoltCheckBox = new javax.swing.JCheckBox();
        lfSummaryCheckBox = new javax.swing.JCheckBox();
        advancedPanel = new javax.swing.JPanel();
        misTitleLabel = new javax.swing.JLabel();
        mismatchLabel = new javax.swing.JLabel();
        stepRunPanel = new javax.swing.JPanel();
        nrStepButton = new javax.swing.JButton();
        pqPStepButton = new javax.swing.JButton();
        pqQStepButton = new javax.swing.JButton();
        gsStepButton = new javax.swing.JButton();
        detailsButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        controlPanel = new javax.swing.JPanel();
        pvBusLimitLabel = new javax.swing.JLabel();
        pvBusLimitComboBox = new javax.swing.JComboBox();
        pvBusLimitPanel = new javax.swing.JPanel();
        pvBusLimitButton = new javax.swing.JButton();
        pqBusLimitLabel = new javax.swing.JLabel();
        pqBusLimitComboBox = new javax.swing.JComboBox();
        pqBusLimitPanel = new javax.swing.JPanel();
        pqBusLimitButton = new javax.swing.JButton();
        remoteQBusLabel = new javax.swing.JLabel();
        remoteQBusComboBox = new javax.swing.JComboBox();
        remoteQBusPanel = new javax.swing.JPanel();
        remoteQBusButton = new javax.swing.JButton();
        remoteQBusXLabel = new javax.swing.JLabel();
        remoteQBusTextField = new javax.swing.JTextField();
        funcLoadLabel = new javax.swing.JLabel();
        funcLoadComboBox = new javax.swing.JComboBox();
        funcLoadPanel = new javax.swing.JPanel();
        funcLoadButton = new javax.swing.JButton();
        xfrTapControlLabel = new javax.swing.JLabel();
        xfrTapControlComboBox = new javax.swing.JComboBox();
        xfrTapControlPanel = new javax.swing.JPanel();
        xfrTapControlButton = new javax.swing.JButton();
        xfrTapControlXLabel = new javax.swing.JLabel();
        xfrTapControlTextField = new javax.swing.JTextField();
        psXfrPControlLabel = new javax.swing.JLabel();
        psXfrPControlComboBox = new javax.swing.JComboBox();
        psXfrPControlPanel = new javax.swing.JPanel();
        psXfrPControlButton = new javax.swing.JButton();
        psXfrPControlXLabel = new javax.swing.JLabel();
        psXfrPControlTextField = new javax.swing.JTextField();
        interPControlLabel = new javax.swing.JLabel();
        interPControlComboBox = new javax.swing.JComboBox();
        interPControlPanel = new javax.swing.JPanel();
        interPControlButton = new javax.swing.JButton();
        interPControlXLabel = new javax.swing.JLabel();
        interPControlTextField = new javax.swing.JTextField();
        msgScrollPane = new javax.swing.JScrollPane();
        msgOutTextArea = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        runAclfTabbedPane.setFont(new java.awt.Font("Dialog", 0, 12));
        runAclfTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelSelectionChanged(evt);
            }
        });

        mainPanel.setLayout(new java.awt.GridBagLayout());

        methodPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        methodPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loadflow Method", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10)));
        methodButtonGroup.add(nrRadioButton);
        nrRadioButton.setFont(new java.awt.Font("Dialog", 0, 12));
        nrRadioButton.setSelected(true);
        nrRadioButton.setText("NR");
        nrRadioButton.setName("nrRadioButton");
        methodPanel.add(nrRadioButton);

        methodButtonGroup.add(pqRadioButton);
        pqRadioButton.setFont(new java.awt.Font("Dialog", 0, 12));
        pqRadioButton.setText("PQ");
        pqRadioButton.setName("pqRadioButton");
        methodPanel.add(pqRadioButton);

        methodButtonGroup.add(gsRadioButton);
        gsRadioButton.setFont(new java.awt.Font("Dialog", 0, 12));
        gsRadioButton.setText("GS");
        gsRadioButton.setName("gsRadioButton");
        methodPanel.add(gsRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        mainPanel.add(methodPanel, gridBagConstraints);

        paramPanel.setLayout(new java.awt.GridBagLayout());

        paramPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        toleranceLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        toleranceLabel.setText("Error Tolerance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        paramPanel.add(toleranceLabel, gridBagConstraints);

        errPUTextField.setColumns(5);
        errPUTextField.setFont(new java.awt.Font("Dialog", 0, 12));
        errPUTextField.setText("0.0001");
        errPUTextField.setName("errPUTextField");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        paramPanel.add(errPUTextField, gridBagConstraints);

        errPUUnitLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        errPUUnitLabel.setText("(pu)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        paramPanel.add(errPUUnitLabel, gridBagConstraints);

        errKVATextField.setColumns(5);
        errKVATextField.setEditable(false);
        errKVATextField.setFont(new java.awt.Font("Dialog", 0, 12));
        errKVATextField.setText("0.1");
        errKVATextField.setName("errKVATextField");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        paramPanel.add(errKVATextField, gridBagConstraints);

        errKVAUnitLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        errKVAUnitLabel.setText("(KVA)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        paramPanel.add(errKVAUnitLabel, gridBagConstraints);

        maxItrLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        maxItrLabel.setText("Max Iterations");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 20);
        paramPanel.add(maxItrLabel, gridBagConstraints);

        maxItrTextField.setColumns(5);
        maxItrTextField.setFont(new java.awt.Font("Dialog", 0, 12));
        maxItrTextField.setText("20");
        maxItrTextField.setName("maxItrTextField");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        paramPanel.add(maxItrTextField, gridBagConstraints);

        accFactorLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        accFactorLabel.setText("GS Acc Factor");
        accFactorLabel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        paramPanel.add(accFactorLabel, gridBagConstraints);

        accFactorTextField.setColumns(5);
        accFactorTextField.setFont(new java.awt.Font("Dialog", 0, 12));
        accFactorTextField.setText("1.0");
        accFactorTextField.setEnabled(false);
        accFactorTextField.setName("accFactorTextField");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        paramPanel.add(accFactorTextField, gridBagConstraints);

        initVoltCheckBox.setFont(new java.awt.Font("Dialog", 0, 12));
        initVoltCheckBox.setSelected(true);
        initVoltCheckBox.setText("Initialize Bus Voltage");
        initVoltCheckBox.setName("initVoltCheckBox");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 5, 0);
        paramPanel.add(initVoltCheckBox, gridBagConstraints);

        lfSummaryCheckBox.setFont(new java.awt.Font("Dialog", 0, 12));
        lfSummaryCheckBox.setSelected(true);
        lfSummaryCheckBox.setText("Show Loadflow Summary");
        lfSummaryCheckBox.setName("lfSummaryCheckBox");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 5, 0);
        paramPanel.add(lfSummaryCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        mainPanel.add(paramPanel, gridBagConstraints);

        runAclfTabbedPane.addTab("Run Loadflow", mainPanel);

        advancedPanel.setLayout(new java.awt.GridBagLayout());

        misTitleLabel.setFont(new java.awt.Font("Dialog", 0, 12));
        misTitleLabel.setText("Power Mismatch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 5, 0);
        advancedPanel.add(misTitleLabel, gridBagConstraints);

        mismatchLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        mismatchLabel.setText("mismatch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        advancedPanel.add(mismatchLabel, gridBagConstraints);

        stepRunPanel.setLayout(new java.awt.GridBagLayout());

        nrStepButton.setFont(new java.awt.Font("Dialog", 0, 12));
        nrStepButton.setText("NR >");
        nrStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrStepButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 20);
        stepRunPanel.add(nrStepButton, gridBagConstraints);

        pqPStepButton.setFont(new java.awt.Font("Dialog", 0, 12));
        pqPStepButton.setText("PQ-P >");
        pqPStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqPStepButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        stepRunPanel.add(pqPStepButton, gridBagConstraints);

        pqQStepButton.setFont(new java.awt.Font("Dialog", 0, 12));
        pqQStepButton.setText("PQ-Q >");
        pqQStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqQStepButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        stepRunPanel.add(pqQStepButton, gridBagConstraints);

        gsStepButton.setFont(new java.awt.Font("Dialog", 0, 12));
        gsStepButton.setText("GS >");
        gsStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsStepButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        stepRunPanel.add(gsStepButton, gridBagConstraints);

        detailsButton.setFont(new java.awt.Font("Dialog", 0, 12));
        detailsButton.setText("Details ...");
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        stepRunPanel.add(detailsButton, gridBagConstraints);

        resetButton.setFont(new java.awt.Font("Dialog", 0, 12));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        stepRunPanel.add(resetButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        advancedPanel.add(stepRunPanel, gridBagConstraints);

        controlPanel.setLayout(new java.awt.GridBagLayout());

        pvBusLimitLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        pvBusLimitLabel.setText("PV Bus Limit Control");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(pvBusLimitLabel, gridBagConstraints);

        pvBusLimitComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        pvBusLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(pvBusLimitComboBox, gridBagConstraints);

        pvBusLimitPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        pvBusLimitButton.setFont(new java.awt.Font("Dialog", 0, 10));
        pvBusLimitButton.setText("Apply");
        pvBusLimitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvBusLimitButtonActionPerformed(evt);
            }
        });

        pvBusLimitPanel.add(pvBusLimitButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(pvBusLimitPanel, gridBagConstraints);

        pqBusLimitLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        pqBusLimitLabel.setText("PQ Bus Limit Control");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(pqBusLimitLabel, gridBagConstraints);

        pqBusLimitComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        pqBusLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(pqBusLimitComboBox, gridBagConstraints);

        pqBusLimitButton.setFont(new java.awt.Font("Dialog", 0, 10));
        pqBusLimitButton.setText("Apply");
        pqBusLimitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqBusLimitButtonActionPerformed(evt);
            }
        });

        pqBusLimitPanel.add(pqBusLimitButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(pqBusLimitPanel, gridBagConstraints);

        remoteQBusLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        remoteQBusLabel.setText("Remote Q Bus Adjustment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(remoteQBusLabel, gridBagConstraints);

        remoteQBusComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        remoteQBusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(remoteQBusComboBox, gridBagConstraints);

        remoteQBusButton.setFont(new java.awt.Font("Dialog", 0, 10));
        remoteQBusButton.setText("Apply");
        remoteQBusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remoteQBusButtonActionPerformed(evt);
            }
        });

        remoteQBusPanel.add(remoteQBusButton);

        remoteQBusXLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        remoteQBusXLabel.setText("x");
        remoteQBusPanel.add(remoteQBusXLabel);

        remoteQBusTextField.setFont(new java.awt.Font("Dialog", 0, 10));
        remoteQBusTextField.setText("1.00");
        remoteQBusPanel.add(remoteQBusTextField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(remoteQBusPanel, gridBagConstraints);

        funcLoadLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        funcLoadLabel.setText("Functional Load Adjustment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(funcLoadLabel, gridBagConstraints);

        funcLoadComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        funcLoadComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(funcLoadComboBox, gridBagConstraints);

        funcLoadButton.setFont(new java.awt.Font("Dialog", 0, 10));
        funcLoadButton.setText("Apply");
        funcLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcLoadButtonActionPerformed(evt);
            }
        });

        funcLoadPanel.add(funcLoadButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(funcLoadPanel, gridBagConstraints);

        xfrTapControlLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        xfrTapControlLabel.setText("Transformer Tap Adjustment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(xfrTapControlLabel, gridBagConstraints);

        xfrTapControlComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        xfrTapControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(xfrTapControlComboBox, gridBagConstraints);

        xfrTapControlButton.setFont(new java.awt.Font("Dialog", 0, 10));
        xfrTapControlButton.setText("Apply");
        xfrTapControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xfrTapControlButtonActionPerformed(evt);
            }
        });

        xfrTapControlPanel.add(xfrTapControlButton);

        xfrTapControlXLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        xfrTapControlXLabel.setText("x");
        xfrTapControlPanel.add(xfrTapControlXLabel);

        xfrTapControlTextField.setFont(new java.awt.Font("Dialog", 0, 10));
        xfrTapControlTextField.setText("1.00");
        xfrTapControlPanel.add(xfrTapControlTextField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(xfrTapControlPanel, gridBagConstraints);

        psXfrPControlLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        psXfrPControlLabel.setText("PS-Transformer Angle Adjustment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(psXfrPControlLabel, gridBagConstraints);

        psXfrPControlComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        psXfrPControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(psXfrPControlComboBox, gridBagConstraints);

        psXfrPControlButton.setFont(new java.awt.Font("Dialog", 0, 10));
        psXfrPControlButton.setText("Apply");
        psXfrPControlButton.setIconTextGap(5);
        psXfrPControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psXfrPControlButtonActionPerformed(evt);
            }
        });

        psXfrPControlPanel.add(psXfrPControlButton);

        psXfrPControlXLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        psXfrPControlXLabel.setText("x");
        psXfrPControlPanel.add(psXfrPControlXLabel);

        psXfrPControlTextField.setFont(new java.awt.Font("Dialog", 0, 10));
        psXfrPControlTextField.setText("1.00");
        psXfrPControlPanel.add(psXfrPControlTextField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(psXfrPControlPanel, gridBagConstraints);

        interPControlLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        interPControlLabel.setText("Interarea Power Exchange Control");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        controlPanel.add(interPControlLabel, gridBagConstraints);

        interPControlComboBox.setFont(new java.awt.Font("Dialog", 0, 10));
        interPControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 20);
        controlPanel.add(interPControlComboBox, gridBagConstraints);

        interPControlButton.setFont(new java.awt.Font("Dialog", 0, 10));
        interPControlButton.setText("Apply");
        interPControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interPControlButtonActionPerformed(evt);
            }
        });

        interPControlPanel.add(interPControlButton);

        interPControlXLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        interPControlXLabel.setText("x");
        interPControlPanel.add(interPControlXLabel);

        interPControlTextField.setFont(new java.awt.Font("Dialog", 0, 10));
        interPControlTextField.setText("1.00");
        interPControlPanel.add(interPControlTextField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        controlPanel.add(interPControlPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 20);
        advancedPanel.add(controlPanel, gridBagConstraints);

        msgScrollPane.setPreferredSize(new java.awt.Dimension(480, 60));
        msgOutTextArea.setColumns(50);
        msgOutTextArea.setEditable(false);
        msgOutTextArea.setFont(new java.awt.Font("Dialog", 0, 10));
        msgOutTextArea.setRows(4);
        msgOutTextArea.setText("Line-1\nLine-1\nLine-1\nLine-1\nLine-1");
        msgScrollPane.setViewportView(msgOutTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        advancedPanel.add(msgScrollPane, gridBagConstraints);

        runAclfTabbedPane.addTab("Loadflow Lab", advancedPanel);

        add(runAclfTabbedPane, new java.awt.GridBagConstraints());

    }// </editor-fold>//GEN-END:initComponents

    private void pqQStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqQStepButtonActionPerformed
    	IpssLogger.getLogger().info("PQ-Q Step run");
    	_simuCtx.getLoadflowAlgorithm().setLfMethod(AclfMethod.PQ_QSTEP_LITERAL);
    	_simuCtx.getLoadflowAlgorithm().loadflow(_simuCtx.getMsgHub());
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_pqQStepButtonActionPerformed

    private void panelSelectionChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelSelectionChanged
    	if ( runAclfTabbedPane.getSelectedIndex() == 0 )
        	IpssLogger.getLogger().info("Panel selection changed - Main Panel");
    	else if ( runAclfTabbedPane.getSelectedIndex() == 1 ) {
        	IpssLogger.getLogger().info("Panel selection changed - Advanced Panel");
            initAdvanceControlPanel();
        	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    	}	
    }//GEN-LAST:event_panelSelectionChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
    	IpssLogger.getLogger().info("Reset ...");
    	_simuCtx.getAclfAdjNet().initializeBusVoltage();
    	_simuCtx.getAclfAdjNet().activateAllAdjust(_simuCtx.getMsgHub());
		msgOutTextArea.setText("");
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_resetButtonActionPerformed

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
    	IpssLogger.getLogger().info("Details ...");
  		IOutputTextDialog dialog = UISpringAppContext.getOutputTextDialog("Loadflow Analysis Info");
  		dialog.display(_simuCtx.getAclfAdjNet());
    }//GEN-LAST:event_detailsButtonActionPerformed

    private void funcLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcLoadButtonActionPerformed
        String selected = (String)funcLoadComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All Function load adjustment");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doFuncLoadAdjust(_simuCtx.getMsgHub());
        }
        else {
        	String id = new StringTokenizer(selected).nextToken();
        	FunctionLoad load = _simuCtx.getAclfAdjNet().getFunctionLoad(id);
        	load.performAdjust(_simuCtx.getAclfAdjNet().getBaseKva(), _simuCtx.getMsgHub());
        	IpssLogger.getLogger().info("Apply Function load adjustment: " + id);
        }
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_funcLoadButtonActionPerformed

    private void xfrTapControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xfrTapControlButtonActionPerformed
        String selected = (String)xfrTapControlComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All Xfr Tap Controls");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doTapVControl(_simuCtx.getMsgHub());
        }
        else {
        	String id = new StringTokenizer(selected).nextToken();
        	TapControl xfr = _simuCtx.getAclfAdjNet().getTapControl(id);
        	xfr.performAdjust(_simuCtx.getAclfAdjNet().getBaseKva(), _simuCtx.getMsgHub());
        	IpssLogger.getLogger().info("Apply Xfr Tap Control: " + id);
        }
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_xfrTapControlButtonActionPerformed

    private void psXfrPControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psXfrPControlButtonActionPerformed
        String selected = (String)psXfrPControlComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All PS Xfr PControls");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doPSXfrPControl(_simuCtx.getMsgHub());
        }
        else {
        	String id = new StringTokenizer(selected).nextToken();
        	PSXfrPControl psXfr = _simuCtx.getAclfAdjNet().getPSXfrPControl(id);
        	psXfr.performAdjust(_simuCtx.getAclfAdjNet().getBaseKva(), _simuCtx.getMsgHub());
        	IpssLogger.getLogger().info("Apply PS Xfr PControl: " + id);
        }
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_psXfrPControlButtonActionPerformed

    private void interPControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interPControlButtonActionPerformed
        String selected = (String)interPControlComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All Interarea exchagnge controls");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doInterAreaPowerAdjust(_simuCtx.getMsgHub());
        }
        else {
        	String no = new StringTokenizer(selected).nextToken();
        	Area area = _simuCtx.getAclfAdjNet().getArea(new Integer(no).intValue());
			if (area.getRegDeviceList().size() > 0) {
				// there should be only one controller per area
				IRegulationDevice regDevice = (IRegulationDevice)area.getRegDeviceList().get(0);
				regDevice.performAdjusment(area, _simuCtx.getAclfAdjNet(), _simuCtx.getMsgHub());
			}
			IpssLogger.getLogger().info("Apply Interarea exchagnge controls: " + no);
        }
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_interPControlButtonActionPerformed

    private void remoteQBusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remoteQBusButtonActionPerformed
        String selected = (String)remoteQBusComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All Remote Q Bus adjustment");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doRemoteQVAdjust(_simuCtx.getMsgHub());
        }
        else {
        	String id = new StringTokenizer(selected).nextToken();
        	RemoteQBus reQ = _simuCtx.getAclfAdjNet().getRemoteQBus(id);
        	reQ.performAdjust(_simuCtx.getAclfAdjNet().getBaseKva(), _simuCtx.getMsgHub());
        	IpssLogger.getLogger().info("Apply Remote Q Bus adjustment: " + id);
        }
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_remoteQBusButtonActionPerformed

    private void pqBusLimitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqBusLimitButtonActionPerformed
        String selected = (String)pqBusLimitComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All PQ Bus Limit");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doPQBusLimitAdjust(AclfMethod.PQ_LITERAL, _simuCtx.getMsgHub());
        }
        else {
        	String id = new StringTokenizer(selected).nextToken();
        	PQBusLimit pq = _simuCtx.getAclfAdjNet().getPQBusLimit(id);
        	pq.performAdjust(_simuCtx.getAclfAdjNet().getBaseKva(), _simuCtx.getMsgHub());
        	IpssLogger.getLogger().info("Apply PQ Bus Limit: " + id);
        }
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_pqBusLimitButtonActionPerformed

    private void pvBusLimitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvBusLimitButtonActionPerformed
        String selected = (String)pvBusLimitComboBox.getSelectedItem();
        if (selected.equals(RunActUtilFunc.AllControlDevices)) {
        	IpssLogger.getLogger().info("Apply All PV Bus Limit");
        	_simuCtx.getLoadflowAlgorithm().getAdjAlgorithm().doPVBusLimitAdjust(AclfMethod.PQ_LITERAL, _simuCtx.getMsgHub());
        }
        else {
        	String id = new StringTokenizer(selected).nextToken();
        	PVBusLimit pv = _simuCtx.getAclfAdjNet().getPVBusLimit(id);
        	pv.performAdjust(_simuCtx.getAclfAdjNet().getBaseKva(), _simuCtx.getMsgHub());
        	IpssLogger.getLogger().info("Apply PV Bus Limit: " + id);
        }
        initAdvanceControlPanel();
        mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_pvBusLimitButtonActionPerformed

    private void gsStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsStepButtonActionPerformed
    	IpssLogger.getLogger().info("GS Step run");
    	_simuCtx.getLoadflowAlgorithm().setLfMethod(AclfMethod.GS_STEP_LITERAL);
    	_simuCtx.getLoadflowAlgorithm().loadflow(_simuCtx.getMsgHub());
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_gsStepButtonActionPerformed

    private void nrStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrStepButtonActionPerformed
    	IpssLogger.getLogger().info("NR Step run");
    	_simuCtx.getLoadflowAlgorithm().setLfMethod(AclfMethod.NR_STEP_LITERAL);
    	_simuCtx.getLoadflowAlgorithm().loadflow(_simuCtx.getMsgHub());
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_nrStepButtonActionPerformed

    private void pqPStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqPStepButtonActionPerformed
    	IpssLogger.getLogger().info("PQ-P Step run");
    	_simuCtx.getLoadflowAlgorithm().setLfMethod(AclfMethod.PQ_PSTEP_LITERAL);
    	_simuCtx.getLoadflowAlgorithm().loadflow(_simuCtx.getMsgHub());
        initAdvanceControlPanel();
    	mismatchLabel.setText(_simuCtx.getAclfAdjNet().maxMismatch(AclfMethod.NR_LITERAL).toString());
    }//GEN-LAST:event_pqPStepButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accFactorLabel;
    private javax.swing.JTextField accFactorTextField;
    private javax.swing.JPanel advancedPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton detailsButton;
    private javax.swing.JTextField errKVATextField;
    private javax.swing.JLabel errKVAUnitLabel;
    private javax.swing.JTextField errPUTextField;
    private javax.swing.JLabel errPUUnitLabel;
    private javax.swing.JButton funcLoadButton;
    private javax.swing.JComboBox funcLoadComboBox;
    private javax.swing.JLabel funcLoadLabel;
    private javax.swing.JPanel funcLoadPanel;
    private javax.swing.JRadioButton gsRadioButton;
    private javax.swing.JButton gsStepButton;
    private javax.swing.JCheckBox initVoltCheckBox;
    private javax.swing.JButton interPControlButton;
    private javax.swing.JComboBox interPControlComboBox;
    private javax.swing.JLabel interPControlLabel;
    private javax.swing.JPanel interPControlPanel;
    private javax.swing.JTextField interPControlTextField;
    private javax.swing.JLabel interPControlXLabel;
    private javax.swing.JCheckBox lfSummaryCheckBox;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel maxItrLabel;
    private javax.swing.JTextField maxItrTextField;
    private javax.swing.ButtonGroup methodButtonGroup;
    private javax.swing.JPanel methodPanel;
    private javax.swing.JLabel misTitleLabel;
    private javax.swing.JLabel mismatchLabel;
    private javax.swing.JTextArea msgOutTextArea;
    private javax.swing.JScrollPane msgScrollPane;
    private javax.swing.JRadioButton nrRadioButton;
    private javax.swing.JButton nrStepButton;
    private javax.swing.JPanel paramPanel;
    private javax.swing.JButton pqBusLimitButton;
    private javax.swing.JComboBox pqBusLimitComboBox;
    private javax.swing.JLabel pqBusLimitLabel;
    private javax.swing.JPanel pqBusLimitPanel;
    private javax.swing.JButton pqPStepButton;
    private javax.swing.JButton pqQStepButton;
    private javax.swing.JRadioButton pqRadioButton;
    private javax.swing.JButton psXfrPControlButton;
    private javax.swing.JComboBox psXfrPControlComboBox;
    private javax.swing.JLabel psXfrPControlLabel;
    private javax.swing.JPanel psXfrPControlPanel;
    private javax.swing.JTextField psXfrPControlTextField;
    private javax.swing.JLabel psXfrPControlXLabel;
    private javax.swing.JButton pvBusLimitButton;
    private javax.swing.JComboBox pvBusLimitComboBox;
    private javax.swing.JLabel pvBusLimitLabel;
    private javax.swing.JPanel pvBusLimitPanel;
    private javax.swing.JButton remoteQBusButton;
    private javax.swing.JComboBox remoteQBusComboBox;
    private javax.swing.JLabel remoteQBusLabel;
    private javax.swing.JPanel remoteQBusPanel;
    private javax.swing.JTextField remoteQBusTextField;
    private javax.swing.JLabel remoteQBusXLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JTabbedPane runAclfTabbedPane;
    private javax.swing.JPanel stepRunPanel;
    private javax.swing.JLabel toleranceLabel;
    private javax.swing.JButton xfrTapControlButton;
    private javax.swing.JComboBox xfrTapControlComboBox;
    private javax.swing.JLabel xfrTapControlLabel;
    private javax.swing.JPanel xfrTapControlPanel;
    private javax.swing.JTextField xfrTapControlTextField;
    private javax.swing.JLabel xfrTapControlXLabel;
    // End of variables declaration//GEN-END:variables
    
	class DataVerifier extends javax.swing.InputVerifier {
		public boolean verify(javax.swing.JComponent input) {
			if (input == null)
				return false;
			try {
       			if (input == maxItrTextField )
 	       			return VerifyUtil.getInt((javax.swing.JTextField)input) > 0;
       			else if (input == accFactorTextField )
 	       			return VerifyUtil.getDouble((javax.swing.JTextField)input) > 0.0;
       			else if (input == errPUTextField) {
 	       			if (VerifyUtil.getDouble((javax.swing.JTextField)input) > 0.0) {
                     double err = VerifyUtil.getDouble(errPUTextField);
                     errKVATextField.setEditable(true);
                     errKVATextField.setText(Num2Str.toStr(err*((GNetForm)_netContainer.getGNetForm()).getBaseKVA(), "#0.####"));
                     errKVATextField.setEditable(false);
                     return true;
                  }
                  return false;
               }  
			} catch (Exception e) {
				return false;
			}		
			return true;
		}
	}
}
