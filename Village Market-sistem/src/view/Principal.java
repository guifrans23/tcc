package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

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
		setBounds(100, 100, 905, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCliente = new JButton("");
		btnCliente.setBackground(Color.WHITE);
		btnCliente.setToolTipText("Clientes");
		btnCliente.setBorderPainted(false);
		btnCliente.setIcon(new ImageIcon(Principal.class.getResource("/icones/cliente (1).png")));
		btnCliente.setBounds(299, 22, 128, 128);
		contentPane.add(btnCliente);
		
		JButton btnPagamentos = new JButton("");
		btnPagamentos.setBackground(Color.WHITE);
		btnPagamentos.setToolTipText("Pagamentos");
		btnPagamentos.setBorderPainted(false);
		btnPagamentos.setIcon(new ImageIcon(Principal.class.getResource("/icones/forma-de-pagamento.png")));
		btnPagamentos.setBounds(736, 22, 128, 128);
		contentPane.add(btnPagamentos);
		
		JButton btnSobre = new JButton("");
		btnSobre.setBackground(Color.WHITE);
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBorderPainted(false);
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/informacoes.png")));
		btnSobre.setBounds(736, 291, 128, 128);
		contentPane.add(btnSobre);
		
		JButton btnRelatorios = new JButton("");
		btnRelatorios.setBackground(Color.WHITE);
		btnRelatorios.setToolTipText("Rel\u00E1torios");
		btnRelatorios.setBorderPainted(false);
		btnRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/icones/relatorio-de-negocios.png")));
		btnRelatorios.setBounds(70, 291, 128, 128);
		contentPane.add(btnRelatorios);
		
		JButton btnFornecedores = new JButton("");
		btnFornecedores.setBackground(Color.WHITE);
		btnFornecedores.setToolTipText("Fornecedores");
		btnFornecedores.setBorderPainted(false);
		btnFornecedores.setIcon(new ImageIcon(Principal.class.getResource("/icones/fornecedor (2).png")));
		btnFornecedores.setBounds(517, 22, 128, 128);
		contentPane.add(btnFornecedores);
		
		JButton btnPedidos = new JButton("");
		btnPedidos.setBackground(Color.WHITE);
		btnPedidos.setToolTipText("Pedidos");
		btnPedidos.setBorderPainted(false);
		btnPedidos.setIcon(new ImageIcon(Principal.class.getResource("/icones/lista-de-controle.png")));
		btnPedidos.setBounds(517, 291, 128, 128);
		contentPane.add(btnPedidos);
		
		JButton btnProdutos = new JButton("");
		btnProdutos.setBackground(Color.WHITE);
		btnProdutos.setToolTipText("Produtos");
		btnProdutos.setBorderPainted(false);
		btnProdutos.setIcon(new ImageIcon(Principal.class.getResource("/icones/produtos (1).png")));
		btnProdutos.setBounds(299, 291, 128, 128);
		contentPane.add(btnProdutos);
		
		JButton btnUsuario = new JButton("");
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


}// fim do codigo
