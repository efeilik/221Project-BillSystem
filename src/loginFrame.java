import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginFrame extends JFrame {

	
	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private MainFrame mainPanel;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrame frame = new loginFrame();
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
	public loginFrame(MainFrame inp) {
		mainPanel=inp;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUserName = new JLabel("USERNAME:");
		lblUserName.setBounds(10, 53, 146, 30);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(10, 120, 146, 30);
		panel.add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setBounds(142, 58, 125, 20);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setColumns(10);
		textPassword.setBounds(142, 125, 125, 20);
		panel.add(textPassword);
		
		JLabel lblError = new JLabel("");
		lblError.setBounds(23, 28, 282, 14);
		panel.add(lblError);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textUsername.getText();
				char[] passwordAr=textPassword.getPassword();
				String password=new String(passwordAr);
				if(ClientSystem.checkLogin(username, password)) {
					MainFrame.loginFlag=true;
					mainPanel.setVisible(true);
					dispose();
				}
				else {
					lblError.setText("USERNAME or PASSWORD is wrong.");
				}
			}
		});
		btnLogin.setBounds(234, 187, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReturn = new JButton("BACK");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(true);
				textUsername.setText("");
				textPassword.setText("");
				dispose();
			}
		});
		btnReturn.setBounds(83, 187, 89, 23);
		panel.add(btnReturn);
		
		
	}

}
