package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JToggleButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(415, 142, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(359, 145, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.GRAY);
		textField_7.setColumns(10);
		textField_7.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		textField_7.setBounds(353, 130, 205, 41);
		contentPane.add(textField_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(415, 210, 120, 20);
		contentPane.add(textField_1);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		lblSenha.setBounds(359, 213, 46, 14);
		contentPane.add(lblSenha);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.GRAY);
		textField_6.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBounds(353, 200, 205, 41);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Bem Vindo ao Village Market");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(334, 39, 250, 34);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("I.P:");
		lblNewLabel_5.setBounds(20, 390, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("Terminal:");
		lblNewLabel_4.setBounds(20, 365, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("Loja:");
		lblNewLabel_3.setBounds(20, 343, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Status");
		lblNewLabel_2.setBounds(313, 343, 36, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/icones/dboff.png")));
		lblNewLabel_1.setBounds(302, 365, 48, 48);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 343, 63, 70);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(0, 340, 276, 73);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(326, 11, 248, 97);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.inactiveCaption);
		textField_5.setBounds(330, 119, 244, 147);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(new ImageIcon(Login.class.getResource("/icones/logocarrinho.png")));
		lblNewLabel_7.setBounds(0, 11, 306, 305);
		contentPane.add(lblNewLabel_7);
	}

}
