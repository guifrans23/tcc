package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class Produto extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdProd;
	private JTextField txtNomeProd;
	private JTextField txtQuantidade;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto();
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
	public Produto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Produto.class.getResource("/icones/produtos (2).png")));
		setTitle("Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdProd = new JTextField();
		txtIdProd.setBounds(84, 27, 86, 20);
		contentPane.add(txtIdProd);
		txtIdProd.setColumns(10);
		
		txtNomeProd = new JTextField();
		txtNomeProd.setColumns(10);
		txtNomeProd.setBounds(292, 27, 86, 20);
		contentPane.add(txtNomeProd);
		
		JLabel lblNewLabel = new JLabel("IdProduto");
		lblNewLabel.setBounds(10, 30, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Produto");
		lblNewLabel_1.setBounds(201, 30, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPaneDesc = new JTextPane();
		textPaneDesc.setBounds(159, 91, 281, 98);
		contentPane.add(textPaneDesc);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria");
		lblNewLabel_2.setBounds(437, 30, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_3.setBounds(84, 91, 65, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantidade");
		lblNewLabel_4.setBounds(10, 242, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(84, 239, 151, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(84, 299, 64, 64);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fotos:");
		lblNewLabel_5.setBounds(10, 299, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(188, 299, 64, 64);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(295, 299, 64, 64);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBounds(402, 299, 64, 64);
		contentPane.add(textField_6);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(402, 239, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Pre\u00E7o");
		lblNewLabel_6.setBounds(346, 242, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(Produto.class.getResource("/icones/create.png")));
		btnNewButton.setBounds(240, 391, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(Produto.class.getResource("/icones/update.png")));
		btnNewButton_1.setBounds(328, 391, 64, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(Produto.class.getResource("/icones/delete.png")));
		btnNewButton_2.setBounds(417, 391, 64, 64);
		contentPane.add(btnNewButton_2);
		
		JComboBox cboCategoia = new JComboBox();
		cboCategoia.setModel(new DefaultComboBoxModel(new String[] {"Fruta", "Verduras", "Frios", "Carnes"}));
		cboCategoia.setBounds(496, 26, 94, 22);
		contentPane.add(cboCategoia);
	}
}
