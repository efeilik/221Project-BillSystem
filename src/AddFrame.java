import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldAddress;
	private JTextField textFieldKWH;
	private JTextField textFieldGasM3;
	private JTextField textFieldWaterM3;
	private JTextField textFieldFirmName;
	private JTextField textFieldFoundationYear;
	private JTextField textFieldEmpNum;
	private JTextField textFieldFirmNameAgri;
	private JTextField textFieldFoundationYearAgri;
	private JTextField textFieldAcreSize;
	private JTextField textFieldNameSurname;
	private MainFrame main;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFrame frame = new AddFrame(main);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the frame.
	 */
	public AddFrame(MainFrame inpMain) {
		main=inpMain;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelIndustry = new JPanel();
		panelIndustry.setBounds(10, 194, 299, 193);
		contentPane.add(panelIndustry);
		panelIndustry.setLayout(null);
		
		JLabel lblFirmName_1 = new JLabel("Firm Name:");
		lblFirmName_1.setBounds(10, 11, 118, 32);
		panelIndustry.add(lblFirmName_1);
		
		JLabel lblFoundationYear_1 = new JLabel("Foundation Year:");
		lblFoundationYear_1.setBounds(10, 82, 118, 32);
		panelIndustry.add(lblFoundationYear_1);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Count:");
		lblEmployeeNumber.setBounds(10, 150, 104, 32);
		panelIndustry.add(lblEmployeeNumber);
		
		textFieldFirmName = new JTextField();
		textFieldFirmName.setColumns(10);
		textFieldFirmName.setBounds(114, 17, 160, 20);
		panelIndustry.add(textFieldFirmName);
		
		textFieldFoundationYear = new JTextField();
		textFieldFoundationYear.setColumns(10);
		textFieldFoundationYear.setBounds(114, 88, 160, 20);
		panelIndustry.add(textFieldFoundationYear);
		
		textFieldEmpNum = new JTextField();
		textFieldEmpNum.setColumns(10);
		textFieldEmpNum.setBounds(114, 156, 160, 20);
		panelIndustry.add(textFieldEmpNum);
		panelIndustry.setVisible(false);
		
		JPanel panelPerson = new JPanel();
		panelPerson.setBounds(10, 194, 299, 193);
		contentPane.add(panelPerson);
		panelPerson.setLayout(null);
		
		panelPerson.setVisible(false);
		
		
		
		JLabel lblNameSurname = new JLabel("Name Surname:");
		lblNameSurname.setBounds(10, 11, 118, 32);
		panelPerson.add(lblNameSurname);
		
		JLabel lblPersonType = new JLabel("Person Type:");
		lblPersonType.setBounds(10, 88, 118, 32);
		panelPerson.add(lblPersonType);
		
		textFieldNameSurname = new JTextField();
		textFieldNameSurname.setColumns(10);
		textFieldNameSurname.setBounds(108, 17, 160, 20);
		panelPerson.add(textFieldNameSurname);
		
		JComboBox comboBoxPerson = new JComboBox();
		comboBoxPerson.setModel(new DefaultComboBoxModel(new String[] {"Student", "Employee"}));
		comboBoxPerson.setBounds(108, 93, 160, 22);
		panelPerson.add(comboBoxPerson);
		
		JPanel panelAgri = new JPanel();
		panelAgri.setBounds(10, 194, 299, 193);
		contentPane.add(panelAgri);
		panelAgri.setLayout(null);
		
		JLabel lblFirmName = new JLabel("Firm Name:");
		lblFirmName.setBounds(10, 11, 118, 32);
		panelAgri.add(lblFirmName);
		
		JLabel lblFoundationYear = new JLabel("Foundation Year:");
		lblFoundationYear.setBounds(10, 86, 118, 32);
		panelAgri.add(lblFoundationYear);
		
		JLabel lblAcreSize = new JLabel("Acre Size:");
		lblAcreSize.setBounds(10, 150, 118, 32);
		panelAgri.add(lblAcreSize);
		
		textFieldFirmNameAgri = new JTextField();
		textFieldFirmNameAgri.setColumns(10);
		textFieldFirmNameAgri.setBounds(114, 17, 160, 20);
		panelAgri.add(textFieldFirmNameAgri);
		
		textFieldFoundationYearAgri = new JTextField();
		textFieldFoundationYearAgri.setColumns(10);
		textFieldFoundationYearAgri.setBounds(114, 86, 160, 20);
		panelAgri.add(textFieldFoundationYearAgri);
		
		textFieldAcreSize = new JTextField();
		textFieldAcreSize.setColumns(10);
		textFieldAcreSize.setBounds(114, 156, 160, 20);
		panelAgri.add(textFieldAcreSize);
		panelAgri.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 540, 172);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Client ID:");
		lblNewLabel.setBounds(10, 11, 118, 32);
		panel.add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 68, 118, 32);
		panel.add(lblAddress);
		
		JLabel lblClientType = new JLabel("Client Type:");
		lblClientType.setBounds(10, 129, 118, 32);
		panel.add(lblClientType);
		
		JLabel lblElectricityKwh = new JLabel("Electricity KWH:");
		lblElectricityKwh.setBounds(250, 11, 118, 32);
		panel.add(lblElectricityKwh);
		
		JLabel lblGasM = new JLabel("Gas M3:");
		lblGasM.setBounds(250, 68, 118, 32);
		panel.add(lblGasM);
		
		JLabel lblWaterM = new JLabel("Water M3:");
		lblWaterM.setBounds(250, 129, 118, 32);
		panel.add(lblWaterM);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this segment is for getting client type and changing next panel related to type
				int indexOfinp = comboBoxType.getSelectedIndex();
				String inp=(String)comboBoxType.getItemAt(indexOfinp);
				if(inp.equalsIgnoreCase("Personal")) {
					panelPerson.setVisible(true);
					panelAgri.setVisible(false);
					panelIndustry.setVisible(false);
				}
				else if(inp.equalsIgnoreCase("Industry")){
					panelPerson.setVisible(false);
					panelAgri.setVisible(false);
					panelIndustry.setVisible(true);
				}
				else {
					panelPerson.setVisible(false);
					panelAgri.setVisible(true);
					panelIndustry.setVisible(false);
				}
			}
		});
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Personal", "Industry", "Agriculture"}));
		comboBoxType.setBounds(138, 134, 102, 22);
		panel.add(comboBoxType);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(80, 17, 160, 20);
		panel.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(80, 74, 160, 20);
		panel.add(textFieldAddress);
		
		textFieldKWH = new JTextField();
		textFieldKWH.setColumns(10);
		textFieldKWH.setBounds(359, 17, 160, 20);
		panel.add(textFieldKWH);
		
		textFieldGasM3 = new JTextField();
		textFieldGasM3.setColumns(10);
		textFieldGasM3.setBounds(359, 74, 160, 20);
		panel.add(textFieldGasM3);
		
		textFieldWaterM3 = new JTextField();
		textFieldWaterM3.setColumns(10);
		textFieldWaterM3.setBounds(359, 135, 160, 20);
		panel.add(textFieldWaterM3);
		
		JLabel labelInfo = new JLabel("");
		labelInfo.setBounds(319, 252, 231, 14);
		contentPane.add(labelInfo);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(382, 203, 89, 23);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//declaring client
				Client customer=null;
				
				//for all clients
				int clientID=Integer.parseInt(textFieldID.getText()) ;
				String address=textFieldAddress.getText();
				double usedKWH=Double.parseDouble(textFieldKWH.getText());
				double usedGas=Double.parseDouble(textFieldGasM3.getText());
				double usedWater=Double.parseDouble(textFieldWaterM3.getText());
				String userType=(String)comboBoxType.getItemAt(comboBoxType.getSelectedIndex()); //getting String at the selected index
				
				//for Personals
				if(userType.equalsIgnoreCase("Personal")) {
					String nameSurname=textFieldNameSurname.getText();
					String personType=(String)comboBoxPerson.getItemAt(comboBoxPerson.getSelectedIndex());
					customer=new Personal(clientID, address, nameSurname, personType);
				}
				//for Industry
				else if(userType.equalsIgnoreCase("Industry")){
					String firmNameInd=textFieldFirmName.getText();
					int workerNb=Integer.parseInt(textFieldEmpNum.getText());
					int foundationYearInd=Integer.parseInt(textFieldFoundationYear.getText());
					customer=new Industry(clientID,address,firmNameInd,foundationYearInd,workerNb);
				}
				//for Agriculture
				else if(userType.equalsIgnoreCase("Agriculture")){
					String firmNameAgri=textFieldFirmNameAgri.getText();
					int foundationYearAgri=Integer.parseInt(textFieldFoundationYearAgri.getText());
					double acreSize=Double.parseDouble(textFieldAcreSize.getText());
					customer=new Agriculture(clientID,address,firmNameAgri,foundationYearAgri,acreSize);
				}
				if(ClientSystem.addClient(customer)) {
					labelInfo.setText("Succesfully added.");
				}
				else
					labelInfo.setText("ERROR. CLIENT ID EXISTS.");
			}
		});
		
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//return to main frame
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(382, 327, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
