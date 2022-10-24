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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuLogin;
	private JTextField txtSenhaLogin;
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
	private JTextField textField_8;
	private JButton btnNewButton;
	private JButton btnCancelar;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_9;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/icones/do-utilizador.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_9 = new JLabel("Village Market");
		lblNewLabel_9.setBounds(70, 343, 109, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("10.26.49.131");
		lblNewLabel_8.setBounds(70, 390, 109, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Login.class.getResource("/icones/logocarrinho.png")));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 28, 287, 272);
		contentPane.add(lblNewLabel_7);
		
		btnCancelar = new JButton("\u274C Cancelar");
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBounds(442, 293, 120, 23);
		contentPane.add(btnCancelar);
		
		btnNewButton = new JButton("\u2714 OK");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(342, 293, 76, 23);
		contentPane.add(btnNewButton);
		
		txtUsuLogin = new JTextField();
		txtUsuLogin.setBounds(415, 142, 120, 20);
		contentPane.add(txtUsuLogin);
		txtUsuLogin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(359, 145, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.GRAY);
		textField_7.setColumns(10);
		textField_7.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		textField_7.setBounds(353, 130, 205, 41);
		contentPane.add(textField_7);
		
		txtSenhaLogin = new JTextField();
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBounds(415, 210, 120, 20);
		contentPane.add(txtSenhaLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		lblSenha.setBounds(359, 213, 46, 14);
		contentPane.add(lblSenha);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setForeground(Color.GRAY);
		textField_6.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBounds(353, 200, 205, 41);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Bem Vindo ao Village Market");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(342, 39, 242, 34);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("I.P:");
		lblNewLabel_5.setBounds(41, 390, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("Terminal:");
		lblNewLabel_4.setBounds(41, 365, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("Loja:");
		lblNewLabel_3.setBounds(41, 343, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Status");
		lblNewLabel_2.setBounds(437, 343, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/icones/dboff.png")));
		lblNewLabel_1.setBounds(427, 365, 48, 48);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaption);
		textField_2.setEnabled(false);
		textField_2.setBounds(345, 340, 217, 73);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaption);
		textField_3.setEnabled(false);
		textField_3.setBounds(21, 340, 276, 73);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setBackground(SystemColor.inactiveCaption);
		textField_4.setBounds(330, 11, 244, 97);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setBackground(SystemColor.inactiveCaption);
		textField_5.setBounds(330, 119, 244, 147);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setBackground(SystemColor.inactiveCaption);
		textField_8.setBounds(330, 277, 244, 55);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setBounds(0, 0, 584, 413);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
	}
}
