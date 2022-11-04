package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCliente = new JButton("");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes clientes = new Clientes();
				clientes.setVisible(true);
			}
		});
		
		JButton btnLogin = new JButton("New button");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		btnLogin.setBounds(88, 208, 89, 32);
		contentPane.add(btnLogin);
		btnCliente.setBackground(Color.WHITE);
		btnCliente.setToolTipText("Clientes");
		btnCliente.setBorderPainted(false);
		btnCliente.setIcon(new ImageIcon(Principal.class.getResource("/icones/cliente (1).png")));
		btnCliente.setBounds(299, 22, 128, 128);
		contentPane.add(btnCliente);
		
		JButton btnSobre = new JButton("");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/informacoes (1).png")));
		btnSobre.setBackground(Color.WHITE);
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBorderPainted(false);
		btnSobre.setBounds(730, 22, 32, 32);
		contentPane.add(btnSobre);
		
		JButton btnRelatorios = new JButton("");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorio relatorio = new Relatorio();
				relatorio.setVisible(true);
			}
		});
		btnRelatorios.setBackground(Color.WHITE);
		btnRelatorios.setToolTipText("Rel\u00E1torios");
		btnRelatorios.setBorderPainted(false);
		btnRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/icones/relatorio-de-negocios.png")));
		btnRelatorios.setBounds(70, 291, 128, 128);
		contentPane.add(btnRelatorios);
		
		JButton btnFornecedores = new JButton("");
		btnFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor fornecedor = new Fornecedor();
				fornecedor.setVisible(true);
			}
		});
		btnFornecedores.setBackground(Color.WHITE);
		btnFornecedores.setToolTipText("Fornecedores");
		btnFornecedores.setBorderPainted(false);
		btnFornecedores.setIcon(new ImageIcon(Principal.class.getResource("/icones/fornecedor (2).png")));
		btnFornecedores.setBounds(517, 22, 128, 128);
		contentPane.add(btnFornecedores);
		
		JButton btnPedidos = new JButton("");
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido pedido = new Pedido();
				pedido.setVisible(true);
			}
		});
		btnPedidos.setBackground(Color.WHITE);
		btnPedidos.setToolTipText("Pedidos");
		btnPedidos.setBorderPainted(false);
		btnPedidos.setIcon(new ImageIcon(Principal.class.getResource("/icones/lista-de-controle.png")));
		btnPedidos.setBounds(517, 291, 128, 128);
		contentPane.add(btnPedidos);
		
		JButton btnProdutos = new JButton("");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				produto.setVisible(true);
			}
		});
		btnProdutos.setBackground(Color.WHITE);
		btnProdutos.setToolTipText("Produtos");
		btnProdutos.setBorderPainted(false);
		btnProdutos.setIcon(new ImageIcon(Principal.class.getResource("/icones/produtos (1).png")));
		btnProdutos.setBounds(299, 291, 128, 128);
		contentPane.add(btnProdutos);
		
		JButton btnUsuario = new JButton("");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true);
			}
		});
		btnUsuario.setBackground(Color.WHITE);
		btnUsuario.setToolTipText("Usu\u00E1rio");
		btnUsuario.setBorderPainted(false);
		btnUsuario.setIcon(new ImageIcon(Principal.class.getResource("/icones/user.png")));
		btnUsuario.setBounds(70, 22, 128, 128);
		contentPane.add(btnUsuario);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/icones/logocarrinho.png")));
		lblNewLabel.setBounds(281, 22, 471, 397);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setEnabled(false);
		textField.setBounds(0, 0, 889, 497);
		contentPane.add(textField);
		textField.setColumns(10);
	}// fim do construtor


	DAO dao = new DAO();
}// fim do codigo
