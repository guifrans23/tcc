package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField textField_3;
	private JTextField txtNomeCompleto;
	private JTextField txtCpf;
	private JTextField txtIdentificacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(92, 26, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(269, 26, 86, 20);
		contentPane.add(txtNome);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(442, 26, 86, 20);
		contentPane.add(txtSenha);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 101, 86, 20);
		contentPane.add(textField_3);
		
		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setColumns(10);
		txtNomeCompleto.setBounds(306, 101, 86, 20);
		contentPane.add(txtNomeCompleto);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(497, 101, 86, 20);
		contentPane.add(txtCpf);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(58, 29, 29, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(231, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(402, 29, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(58, 104, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNomeComplto = new JLabel("Nome Completo");
		lblNomeComplto.setBounds(207, 104, 102, 14);
		contentPane.add(lblNomeComplto);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(459, 104, 46, 14);
		contentPane.add(lblCpf);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBackground(Color.GREEN);
		txtIdentificacao.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdentificacao.setBounds(0, 216, 605, 41);
		contentPane.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(89, 182, 89, 23);
		contentPane.add(btnNewButton);
	}
}
