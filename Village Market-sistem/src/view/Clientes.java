package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtMarketing;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtUf;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(48, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(87, 11, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(87, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(241, 83, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setBounds(426, 83, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(48, 150, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Marketing");
		lblNewLabel_5.setBounds(205, 150, 71, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CEP");
		lblNewLabel_6.setBounds(394, 150, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Endere\u00E7o");
		lblNewLabel_7.setBounds(544, 150, 64, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Numero");
		lblNewLabel_8.setBounds(87, 209, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Complemento");
		lblNewLabel_9.setBounds(268, 209, 86, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Bairro");
		lblNewLabel_10.setBounds(495, 209, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Cidade");
		lblNewLabel_11.setBounds(378, 280, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("UF");
		lblNewLabel_12.setBounds(205, 280, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(132, 80, 86, 20);
		contentPane.add(txtNome);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(298, 80, 86, 20);
		contentPane.add(txtTelefone);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(472, 80, 86, 20);
		contentPane.add(txtCpf);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(87, 147, 86, 20);
		contentPane.add(txtEmail);
		
		txtMarketing = new JTextField();
		txtMarketing.setColumns(10);
		txtMarketing.setBounds(268, 147, 86, 20);
		contentPane.add(txtMarketing);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		txtCep.setBounds(426, 147, 86, 20);
		contentPane.add(txtCep);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(603, 147, 86, 20);
		contentPane.add(txtEndereco);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(144, 206, 86, 20);
		contentPane.add(txtNumero);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(354, 206, 86, 20);
		contentPane.add(txtComplemento);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(544, 206, 86, 20);
		contentPane.add(txtBairro);
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		txtUf.setBounds(240, 277, 86, 20);
		contentPane.add(txtUf);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(426, 277, 86, 20);
		contentPane.add(txtCidade);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setIcon(new ImageIcon(Clientes.class.getResource("/icones/create.png")));
		btnAdicionar.setBounds(477, 352, 64, 64);
		contentPane.add(btnAdicionar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setBorderPainted(false);
		btnAlterar.setIcon(new ImageIcon(Clientes.class.getResource("/icones/update.png")));
		btnAlterar.setBounds(566, 352, 64, 64);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setBorderPainted(false);
		btnExcluir.setIcon(new ImageIcon(Clientes.class.getResource("/icones/delete.png")));
		btnExcluir.setBounds(652, 352, 64, 64);
		contentPane.add(btnExcluir);
	}// fim do construtor

	DAO dao = new DAO();
	
	
	
}// fim do codigo
