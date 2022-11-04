package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.toedter.calendar.JDateChooser;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Produto extends JFrame {

	private JPanel contentPane;
	private JTextField txtBarcode;
	private JTextField txtFabricante; 
	private JTextField txtProduto; 
	private JTextField txtEstoque; 
	private JTextField txtEstoqueMin; 
	private JTextField txtLocalizacao; 
	private JTextField txtCusto; 
    private JTextField txtLucro; 

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
		setBounds(100, 100, 845, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(101, 21, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtBarcode = new JTextField();
		txtBarcode.setColumns(10);
		txtBarcode.setBounds(101, 86, 126, 20);
		contentPane.add(txtBarcode);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(52, 24, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Produto.class.getResource("/icones/barcode.png")));
		lblNewLabel_1.setBounds(20, 65, 64, 64);
		contentPane.add(lblNewLabel_1);
		
		txtDescricao = new JTextPane();
		txtDescricao.setBounds(101, 206, 281, 72);
		contentPane.add(txtDescricao);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_3.setBounds(41, 232, 65, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fabricante");
		lblNewLabel_4.setBounds(41, 329, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		txtFabricante = new JTextField();
		txtFabricante.setBounds(105, 326, 119, 20);
		contentPane.add(txtFabricante);
		txtFabricante.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DataCad");
		lblNewLabel_6.setBounds(56, 402, 66, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarProduto();
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(Produto.class.getResource("/icones/create.png")));
		btnNewButton.setBounds(607, 424, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarProduto();
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(Produto.class.getResource("/icones/update.png")));
		btnNewButton_1.setBounds(681, 424, 64, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirProduto();
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(Produto.class.getResource("/icones/delete.png")));
		btnNewButton_2.setBounds(755, 424, 64, 64);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Produto");
		lblNewLabel_2.setBounds(52, 155, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtProduto = new JTextField();
		txtProduto.setColumns(10);
		txtProduto.setBounds(101, 152, 111, 20);
		contentPane.add(txtProduto);
		
		JLabel lblNewLabel_6_1 = new JLabel("DataVal");
		lblNewLabel_6_1.setBounds(298, 402, 46, 14);
		contentPane.add(lblNewLabel_6_1);
		
		txtEstoque = new JTextField();
		txtEstoque.setBounds(519, 24, 46, 20);
		contentPane.add(txtEstoque);
		txtEstoque.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Estoque");
		lblNewLabel_5.setBounds(463, 27, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Estoque minimo");
		lblNewLabel_5_1.setBounds(631, 27, 92, 14);
		contentPane.add(lblNewLabel_5_1);
		
		txtEstoqueMin = new JTextField();
		txtEstoqueMin.setColumns(10);
		txtEstoqueMin.setBounds(733, 24, 46, 20);
		contentPane.add(txtEstoqueMin);
		
		cboUnidade = new JComboBox();
		cboUnidade.setModel(new DefaultComboBoxModel(new String[] {"UN", "CX"}));
		cboUnidade.setBounds(519, 107, 46, 22);
		contentPane.add(cboUnidade);
		
		JLabel lblNewLabel_7 = new JLabel("Unidade");
		lblNewLabel_7.setBounds(463, 111, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Localiza\u00E7\u00E3o");
		lblNewLabel_8.setBounds(631, 111, 64, 14);
		contentPane.add(lblNewLabel_8);
		
		txtLocalizacao = new JTextField();
		txtLocalizacao.setBounds(705, 109, 102, 20);
		contentPane.add(txtLocalizacao);
		txtLocalizacao.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Custo");
		lblNewLabel_9.setBounds(463, 201, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		txtCusto = new JTextField();
		txtCusto.setBounds(519, 198, 86, 20);
		contentPane.add(txtCusto);
		txtCusto.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Lucro");
		lblNewLabel_10.setBounds(649, 201, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		txtLucro = new JTextField();
		txtLucro.setBounds(705, 198, 102, 20);
		contentPane.add(txtLucro);
		txtLucro.setColumns(10);
		
		dateEntrada = new JDateChooser();
		dateEntrada.setBounds(131, 396, 145, 20);
		contentPane.add(dateEntrada);
		
		dateValidade = new JDateChooser();
		dateValidade.setBounds(354, 396, 145, 20);
		contentPane.add(dateValidade);
		
		RestrictedTextField validarId = new RestrictedTextField(txtCodigo);
		validarId.setOnlyNums(true);
		validarId.setLimit(9);

		RestrictedTextField barcode = new RestrictedTextField(txtBarcode);
		barcode.setOnlyNums(true);
		barcode.setLimit(9);

		RestrictedTextField estoque = new RestrictedTextField(txtEstoque);
		estoque.setOnlyNums(true);

		RestrictedTextField estoquemin = new RestrictedTextField(txtEstoqueMin);
		estoquemin.setOnlyNums(true);
		
	} // fim do construtor
	
	
	DAO dao = new DAO();
	private JTextPane txtDescricao;
	private JComboBox cboUnidade;
	private JDateChooser dateEntrada;
	private JDateChooser dateValidade;
	private JTextField txtCodigo;
	
	private void pesquisarProdutoCodigo() {
		String read = "select * from produtos where codigo = ?";
		try {
			Connection con = dao.conectar();
			PreparedStatement pst = con.prepareStatement(read);
			pst.setString(1, txtCodigo.getText() + "%");
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				txtBarcode.setText(rs.getString(2));
				txtBarcode.setText(rs.getString(3));
				txtBarcode.setText(rs.getString(4));
				txtBarcode.setText(rs.getString(5));
				String setarDataCad = rs.getString(6);
				System.out.print(setarDataCad);
				Date dataVal = new SimpleDateFormat("yyyy-MM-dd").parse(setarDataCad);
				dateEntrada.setDate(dataVal);
				String setarDataVal = rs.getString(7);
				System.out.print(setarDataVal);
				Date dataValidade = new SimpleDateFormat("yyyy-MM-dd").parse(setarDataCad);
				dateValidade.setDate(dataValidade);
				txtEstoque.setText(rs.getString(8));
				txtEstoqueMin.setText(rs.getString(9));
				cboUnidade.setSelectedItem(rs.getString(10));
				txtLocalizacao.setText(rs.getString(11));
				txtCusto.setText(rs.getString(12));
				txtLucro.setText(rs.getString(13));
			} else {
				JOptionPane.showMessageDialog(null, "Produto não cadastrado");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void adicionarProduto() {
		if (txtBarcode.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o barcode");
			txtBarcode.requestFocus();
		} else if (txtProduto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o produto");
			txtProduto.requestFocus();
		} else if (txtDescricao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a descrição");
			txtDescricao.requestFocus();
		} else if (txtFabricante.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o fabricante");
			txtFabricante.requestFocus();
		} else if (dateEntrada.getDateFormatString().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a data de entrada");
			dateEntrada.requestFocus();
		} else if (dateValidade.getDateFormatString().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a validade");
			dateValidade.requestFocus();
		} else if (txtEstoque.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o estoque");
			txtEstoque.requestFocus();
		} else if (txtEstoqueMin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha estoque min");
			txtEstoqueMin.requestFocus();
		} else if (cboUnidade.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Selecione a unidade do produto");
			cboUnidade.requestFocus();
		} else if (txtLocalizacao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a localização");
			txtLocalizacao.requestFocus();
		} else if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o custo");
			txtCusto.requestFocus();
		} else if (txtLucro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o lucro");
			txtLucro.requestFocus();
		} else {
			String create = "insert into produtos(barcode,produto,descricao,fabricante,estoque,estoquemin,unidade,localizacao,custo,lucro,venda,idfor) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	 try {
		Connection con = dao.conectar();
		PreparedStatement pst = con.prepareStatement(create);
		
		pst.setString(1, txtBarcode.getText());
		pst.setString(2, txtProduto.getText());
		pst.setString(3, txtDescricao.getText());
		pst.setString(4, txtFabricante.getText());
		pst.setString(5, txtEstoque.getText());
		pst.setString(6, txtEstoqueMin.getText());
		pst.setString(7, cboUnidade.getSelectedItem().toString());
		pst.setString(8, txtLocalizacao.getText());
		pst.setString(9, txtCusto.getText());
		pst.setString(10, txtLucro.getText());

		
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
		con.close();
	} catch (SQLIntegrityConstraintViolationException ex) {
		JOptionPane.showMessageDialog(null, "Produto existente. \nEscolha outro");
		txtProduto.setText(null);
		txtProduto.requestFocus();
	} catch (Exception e) {
		System.out.println(e);
	}
		}
}	 
	
	private void alterarProduto() {
		if (txtBarcode.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o barcode");
			txtBarcode.requestFocus();
		}
		if (txtProduto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o produto");
			txtProduto.requestFocus();
		} else if (txtDescricao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a descrição");
			txtDescricao.requestFocus();
		} else if (txtFabricante.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o fabricante");
			txtFabricante.requestFocus();
		} else if (dateEntrada.getDateFormatString().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a data de entrada");
			dateEntrada.requestFocus();
		} else if (dateValidade.getDateFormatString().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a validade");
			dateValidade.requestFocus();
		} else if (txtEstoque.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o estoque");
			txtEstoque.requestFocus();
		} else if (txtEstoqueMin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha estoque min");
			txtEstoqueMin.requestFocus();
		} else if (cboUnidade.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Selecione a unidade do produto");
			cboUnidade.requestFocus();
		} else if (txtLocalizacao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a localização");
			txtLocalizacao.requestFocus();
		} else if (txtCusto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o custo");
			txtCusto.requestFocus();
		} else if (txtLucro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o lucro");
			txtLucro.requestFocus();
	} else {
		String update = "update produtos set barcode=?, descricao=?, fabricante=?, estoque=?, estoquemin=?, unidade=?, localizacao=?, custo=? ,lucro=?, venda=?, idfor=? where codigo=?";
		try {
				Connection con = dao.conectar();
				
				PreparedStatement pst = con.prepareStatement(update);


				pst.setString(1, txtBarcode.getText());
				pst.setString(2, txtProduto.getText());
				pst.setString(3, txtDescricao.getText());
				pst.setString(4, txtFabricante.getText());
				pst.setString(5, txtEstoque.getText());
				pst.setString(6, txtEstoqueMin.getText());
				pst.setString(7, cboUnidade.getSelectedItem().toString());
				pst.setString(8, txtLocalizacao.getText());
				pst.setString(9, txtCusto.getText());
				pst.setString(10, txtLucro.getText());

				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Dados alterados");
	
				con.close();
		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Dados incompletos");
			txtProduto.setText(null);
			txtProduto.requestFocus();
		}  catch (Exception e) {
			System.out.println(e);
		}
			
		}
	
	}
	
	private void excluirProduto() {
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do produto?");
		if (confirma == JOptionPane.YES_OPTION) {
			String delete = "delete from produtos where codigo=?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, txtCodigo.getText());
				pst.executeUpdate();
				limparCampos();
				JOptionPane.showMessageDialog(null, "Produto excluido com sucesso.");
				con.close();
			} catch (Exception e) {
				System.out.println();
			}
		}
		}
	
	private void limparCampos() {
		
	}
} // fim do codigo