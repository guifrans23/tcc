package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DAO;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtCnpj;
	private JTextField txtRazao;
	private JTextField txtSite;
	private JTextField txtCep;
	private JTextField txtIe;
	private JTextField txtIm;
	private JTextField txtFantasia;
	private JTextField txtFone;
	private JTextField txtContato;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	private JTextField txtUf;
	private JTextField txtBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor frame = new Fornecedor();
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
	public Fornecedor() {
		setTitle("Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(88, 24, 24, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(133, 94, 108, 20);
		contentPane.add(txtCnpj);
		txtCnpj.setColumns(10);
		
		txtRazao = new JTextField();
		txtRazao.setBounds(88, 157, 86, 20);
		contentPane.add(txtRazao);
		txtRazao.setColumns(10);
		
		txtSite = new JTextField();
		txtSite.setBounds(498, 157, 86, 20);
		contentPane.add(txtSite);
		txtSite.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setBounds(101, 300, 155, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		txtIe = new JTextField();
		txtIe.setBounds(334, 94, 86, 20);
		contentPane.add(txtIe);
		txtIe.setColumns(10);
		
		txtIm = new JTextField();
		txtIm.setBounds(498, 94, 86, 20);
		contentPane.add(txtIm);
		txtIm.setColumns(10);
		
		txtFantasia = new JTextField();
		txtFantasia.setBounds(304, 157, 86, 20);
		contentPane.add(txtFantasia);
		txtFantasia.setColumns(10);
		
		txtFone = new JTextField();
		txtFone.setBounds(118, 224, 86, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(56, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CNPJ");
		lblNewLabel_1.setBounds(88, 97, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IE");
		lblNewLabel_2.setBounds(288, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IM");
		lblNewLabel_3.setBounds(449, 97, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raz\u00E3o Social");
		lblNewLabel_4.setBounds(10, 160, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fantasia");
		lblNewLabel_5.setBounds(231, 160, 59, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Site");
		lblNewLabel_6.setBounds(449, 160, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fone");
		lblNewLabel_7.setBounds(73, 227, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		txtContato = new JTextField();
		txtContato.setColumns(10);
		txtContato.setBounds(304, 224, 86, 20);
		contentPane.add(txtContato);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(471, 224, 161, 20);
		contentPane.add(txtEmail);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(400, 300, 161, 20);
		contentPane.add(txtEndereco);
		
		JLabel lblNewLabel_8 = new JLabel("Contato");
		lblNewLabel_8.setBounds(248, 227, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Email");
		lblNewLabel_9.setBounds(427, 227, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CEP");
		lblNewLabel_10.setBounds(45, 303, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Endere\u00E7o");
		lblNewLabel_11.setBounds(331, 303, 59, 14);
		contentPane.add(lblNewLabel_11);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(167, 380, 51, 20);
		contentPane.add(txtNumero);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(420, 380, 141, 20);
		contentPane.add(txtComplemento);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(304, 459, 86, 20);
		contentPane.add(txtCidade);
		
		JLabel lblNewLabel_12 = new JLabel("Numero");
		lblNewLabel_12.setBounds(111, 383, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Complemento");
		lblNewLabel_13.setBounds(319, 383, 91, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Bairro");
		lblNewLabel_14.setBounds(45, 462, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		txtUf = new JTextField();
		txtUf.setColumns(10);
		txtUf.setBounds(462, 459, 86, 20);
		contentPane.add(txtUf);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(101, 459, 86, 20);
		contentPane.add(txtBairro);
		
		JLabel lblNewLabel_15 = new JLabel("UF");
		lblNewLabel_15.setBounds(427, 462, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Cidade");
		lblNewLabel_16.setBounds(244, 462, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Observa\u00E7\u00E3o");
		lblNewLabel_17.setBounds(45, 544, 74, 14);
		contentPane.add(lblNewLabel_17);
		
		JTextPane txtObs = new JTextPane();
		txtObs.setBounds(118, 516, 216, 72);
		contentPane.add(txtObs);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarFornecedor();
			}
		});
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setIcon(new ImageIcon(Fornecedor.class.getResource("/icones/create.png")));
		btnAdicionar.setBounds(458, 535, 64, 64);
		contentPane.add(btnAdicionar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarFornecedor();
			}
		});
		btnAlterar.setBorderPainted(false);
		btnAlterar.setIcon(new ImageIcon(Fornecedor.class.getResource("/icones/update.png")));
		btnAlterar.setBounds(532, 535, 64, 64);
		contentPane.add(btnAlterar);
		
		JButton btnRemover = new JButton("");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirFornecedor();
			}
		});
		btnRemover.setBorderPainted(false);
		btnRemover.setIcon(new ImageIcon(Fornecedor.class.getResource("/icones/delete.png")));
		btnRemover.setBounds(606, 535, 64, 64);
		contentPane.add(btnRemover);
	
	}// fim do construtor
	
	DAO dao = new DAO();
	
	private void adicionarFornecedor() {
		if (txtId.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o id");
			txtId.requestFocus();
		} else if (txtCnpj.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o CNPJ");
			txtCnpj.requestFocus();
		} else if (txtIe.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o IE");
			txtIe.requestFocus();
		} else if (txtIm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o IM");
			txtIm.requestFocus();
		} else if (txtRazao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a Razão social");
			txtRazao.requestFocus();
		} else if (txtFantasia.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a fantasia");
			txtFantasia.requestFocus();
		} else if (txtSite.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o site");
			txtSite.requestFocus();
		} else if (txtFone.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o telefone");
			txtFone.requestFocus();
		} else if (txtContato.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Contato");
			txtContato.requestFocus();
		} else if (txtEmail.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Email");
			txtEmail.requestFocus();
		} else if (txtCep.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o CEP");
			txtCep.requestFocus();
		} else if (txtEndereco.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Endereço");
			txtEndereco.requestFocus();
		} else if (txtNumero.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o número");
			txtNumero.requestFocus();
		} else if (txtComplemento.getText().isEmpty()) {
		} else if (txtBairro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Bairro");
			txtBairro.requestFocus();
		} else if (txtCidade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a Cidade");
			txtCidade.requestFocus();
		} else if (txtUf.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a UF");
			txtUf.requestFocus();
		} else {
			String create = "insert into fornecedores(cnpj,razao,fantasia,fone,cep,endereco,numero,bairro,cidade,uf) values(?,?,?,?,?,?,?,?,?,?)";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(create);
				
				pst.setString(1, txtId.getText());
				pst.setString(2, txtCnpj.getText());
				pst.setString(3, txtRazao.getText());
				pst.setString(4, txtFantasia.getText());
				pst.setString(5, txtFone.getText());
				pst.setString(6, txtCep.getText());
				pst.setString(7, txtEndereco.getText());
				pst.setString(8, txtNumero.getText());
				pst.setString(9, txtBairro.getText());
				pst.setString(10, txtCidade.getText());
				pst.setString(11, txtUf.getText());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
				con.close();
			} catch (SQLIntegrityConstraintViolationException ex) {
				JOptionPane.showMessageDialog(null, "Fornecedor existente.");
				txtCnpj.setText(null);
				txtCnpj.requestFocus();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void alterarFornecedor() {
		if (txtId.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o id");
			txtId.requestFocus();
		} else if (txtCnpj.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o CNPJ");
			txtCnpj.requestFocus();
		} else if (txtIe.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o IE");
			txtIe.requestFocus();
		} else if (txtIm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o IM");
			txtIm.requestFocus();
		} else if (txtRazao.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a Razão social");
			txtRazao.requestFocus();
		} else if (txtFantasia.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a fantasia");
			txtFantasia.requestFocus();
		} else if (txtSite.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o site");
			txtSite.requestFocus();
		} else if (txtFone.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o telefone");
			txtFone.requestFocus();
		} else if (txtContato.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Contato");
			txtContato.requestFocus();
		} else if (txtEmail.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Email");
			txtEmail.requestFocus();
		} else if (txtCep.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o CEP");
			txtCep.requestFocus();
		} else if (txtEndereco.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Endereço");
			txtEndereco.requestFocus();
		} else if (txtNumero.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o número");
			txtNumero.requestFocus();
		} else if (txtComplemento.getText().isEmpty()) {
		} else if (txtBairro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira o Bairro");
			txtBairro.requestFocus();
		} else if (txtCidade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a Cidade");
			txtCidade.requestFocus();
		} else if (txtUf.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Insira a UF");
			txtUf.requestFocus();
		} else {
			String update = "update fornecedores set cep=?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(update);
				
				pst.setString(1, txtId.getText());
				pst.setString(2, txtCnpj.getText());
				pst.setString(3, txtRazao.getText());
				pst.setString(4, txtFantasia.getText());
				pst.setString(5, txtFone.getText());
				pst.setString(6, txtCep.getText());
				pst.setString(7, txtEndereco.getText());
				pst.setString(8, txtNumero.getText());
				pst.setString(9, txtBairro.getText());
				pst.setString(10, txtCidade.getText());
				pst.setString(11, txtUf.getText());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Dados Alterados");
				limparCampos();
				con.close();
			} catch (SQLIntegrityConstraintViolationException ex) {
				JOptionPane.showMessageDialog(null, "CEP inexistente");
				txtCep.setText(null);
				txtCep.requestFocus();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void excluirFornecedor() {
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do fornecedor?");
		if (confirma == JOptionPane.YES_OPTION) {
			String delete = "delete from fornecedores where idfor=?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, txtId.getText());
				pst.executeUpdate();
				limparCampos();
				JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso.");
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void limparCampos() {
		
	}
}// fim do codigo
