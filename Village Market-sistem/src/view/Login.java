package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;
import model.DAO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;
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
	private JButton btnOk;
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
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowActivated(WindowEvent e) {
					status();
				}
			});
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
		
		btnOk = new JButton("\u2714 OK");
		btnOk.setBorderPainted(false);
		btnOk.setBounds(342, 293, 76, 23);
		contentPane.add(btnOk);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(415, 142, 120, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
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
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(415, 210, 120, 20);
		contentPane.add(txtSenha);
		
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
		
		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/icones/dboff.png")));
		lblStatus.setBounds(427, 365, 48, 48);
		contentPane.add(lblStatus);
		
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
	}// fim do construtor
	
	DAO dao = new DAO();
	private JLabel lblStatus;
	
	/**
	 * Método usado para verificar o status do servidor
	 */
	
	private void status() {
		try {
			Connection con = dao.conectar();
			
			if ( con == null ) {
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/icones/dboff.png")));
			} else {
				lblStatus.setIcon(new ImageIcon(Login.class.getResource("/icones/dbon.png")));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Método usado para autentificar um usuário
	 */
	
	private void logar() {
		String capturaSenha = new String(txtSenha.getPassword());
		if (txtLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o login");
			txtLogin.requestFocus();
		} else if (txtSenha.getPassword().length == 0) {
			txtSenha.requestFocus();
		} else {
			String read = "select * from usuarios where login=? and senha=md5(5)";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(read);
				pst.setString(1, txtLogin.getText());
				pst.setString(2, capturaSenha);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					String perfil = rs.getString(5);
					Principal principal = new Principal();
					if (perfil.equals("admin")) {
						principal.setVisible(true);
						con.close();
						this.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Login e/ou senha invalido(s)");
						txtLogin.setText(null);
					} catch (Exception e) {
					System.out.println(e);
				}
			}		
	
}// fim do codigo











