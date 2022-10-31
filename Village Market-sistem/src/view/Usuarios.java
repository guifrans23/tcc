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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtUsuario;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JLabel lblNewLabel;
	private JComboBox cboPerfil;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Usuarios.class.getResource("/icones/imagem-do-usuario-com-fundo-preto.png")));
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtId = new JTextField();
		txtId.setBounds(92, 26, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(283, 26, 86, 20);
		contentPane.add(txtUsuario);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(92, 101, 86, 20);
		contentPane.add(txtLogin);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(283, 101, 86, 20);
		contentPane.add(txtSenha);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(58, 29, 29, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(232, 104, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmail = new JLabel("Usu\u00E1rio");
		lblEmail.setBounds(232, 29, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNomeComplto = new JLabel("Login");
		lblNomeComplto.setBounds(44, 104, 38, 14);
		contentPane.add(lblNomeComplto);
		
		lblNewLabel = new JLabel("Perfil");
		lblNewLabel.setBounds(41, 194, 46, 14);
		contentPane.add(lblNewLabel);
		
		cboPerfil = new JComboBox();
		cboPerfil.setModel(new DefaultComboBoxModel(new String[] {"admin", "user"}));
		cboPerfil.setBounds(92, 190, 86, 22);
		contentPane.add(cboPerfil);
		
		btnAlterar = new JButton("");
		btnAlterar.setBorderPainted(false);
		btnAlterar.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/update.png")));
		btnAlterar.setBounds(259, 269, 64, 64);
		contentPane.add(btnAlterar);
		
		btnAdicionar = new JButton("");
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/create.png")));
		btnAdicionar.setBounds(183, 269, 64, 64);
		contentPane.add(btnAdicionar);
		
		btnRemover = new JButton("");
		btnRemover.setBorderPainted(false);
		btnRemover.setIcon(new ImageIcon(Usuarios.class.getResource("/icones/delete.png")));
		btnRemover.setBounds(333, 269, 64, 64);
		contentPane.add(btnRemover);
	}// fim do construtor 
	
	DAO dao = new DAO();
	private JButton btnAlterar;
	private JButton btnAdicionar;
	private JButton btnRemover;
	
	private void pesquisarUsuario() {
		if (txtLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Digite o login do usuário");
			txtLogin.requestFocus();
		} else {
			String read = "select * from usuarios where login = ?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(read);
				pst.setString(1, txtLogin.getText());
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					txtId.setText(rs.getString(1));
					txtUsuario.setText(rs.getString(2));
					txtLogin.setText(rs.getString(3));
					cboPerfil.setSelectedItem(rs.getString(5));
					txtSenha.setText(rs.getString(4));
					txtUsuario.setEditable(true);
					cboPerfil.setEnabled(true);
					txtSenha.setEditable(true);
					btnAlterar.setEnabled(true);
					btnRemover.setEnabled(true);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário inexistente");
					txtLogin.setEditable(true);
					txtUsuario.setEditable(true);
					cboPerfil.setEnabled(true);
					txtSenha.setEditable(true);
					txtUsuario.requestFocus();
					btnAdicionar.setEnabled(true);
					
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void adicionarUsuario() {
		String capturaSenha = new String(txtSenha.getPassword());
		if (txtUsuario.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o usuario");
			txtUsuario.requestFocus();
		} else if (txtLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o login");
			txtLogin.requestFocus();
		} else if (cboPerfil.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Selecione o perfil do usuário");
			cboPerfil.requestFocus();
		} else if (txtSenha.getPassword().length == 0) {
			JOptionPane.showMessageDialog(null, "Preencha senha");
			txtSenha.requestFocus();
		} else {
			String create = "insert into usuarios(usuario,login,senha,perfil)\" + \"values(?,?,md5(?),?)";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(create);
				pst.setString(1, txtUsuario.getText());
				pst.setString(2, txtLogin.getText());
				pst.setString(3, txtSenha.getText());
				pst.setString(4, cboPerfil.getSelectedItem().toString());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
				limparCampos();
				con.close();
			} catch (SQLIntegrityConstraintViolationException ex) {
				JOptionPane.showMessageDialog(null, "Login em uso.\nEscolha outro login.");
				txtLogin.setText(null);
				txtLogin.requestFocus();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void alterarUsuario() {
		String capturaSenha = new String(txtSenha.getPassword());
		if (txtUsuario.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o usuario");
			txtUsuario.requestFocus();
		} else if (txtLogin.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o login");
			txtLogin.requestFocus();
		} else if (cboPerfil.getSelectedItem().equals("")) {
			JOptionPane.showMessageDialog(null, "Selecione o perfil do usuário");
			cboPerfil.requestFocus();
		} else if (txtSenha.getPassword().length == 0) {
			JOptionPane.showMessageDialog(null, "Preencha senha");
			txtSenha.requestFocus();
	} else {
		String update = "update usuarios set usuario=?, login=? ,senha=md5(?), perfil=? where idusu=?";
		Connection con = dao.conectar();
		PreparedStatement pst =con.prepareStatement(update);
		pst.setString(1, txtUsuario.getText());
		pst.setString(2, txtLogin.getText());
		pst.setString(3, capturaSenha);
		pst.setString(4, cboPerfil.getSelectedItem().toString());
		pst.setString(5, txtId.getText());
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "Dados so usuário alterados com sucesso");
		limparCampos();
		con.close();
	} catch (SQLIntegrityConstraintViolationException ex) {
		JOptionPane.showMessageDialog(null, "Login em uso.\nEscolha outro login.");
		txtLogin.setText(null);
		txtLogin.requestFocus();
	} catch (Exception e) {
		System.out.println(e);
	}
	}
	
	private void excluirUsuario() {
		int confirma = JOptionPane.showConfirmDialog(null, "Confirmar a exclusão do usuário?", "Atenção!",JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {
			String delete = "delete from usuarios where idusu=?";
			try {
				Connection con = dao.conectar();
				PreparedStatement pst = con.prepareStatement(delete);
				pst.setString(1, txtId.getText());
				pst.executeUpdate();
				limparCampos();
				JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso");
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void limparCampos() {
		txtId.setText(null);
		txtUsuario.setText(null);
		txtLogin.setText(null);
		txtSenha.setText(null);
		cboPerfil.setSelectedItem("");
		btnAdicionar.setEnabled(false);
		btnAlterar.setEnabled(false);
		btnRemover.setEnabled(false);
		txtUsuario.setEditable(false);
		txtLogin.setEditable(true);
		cboPerfil.setEnabled(false);
		txtSenha.setEditable(false);
		txtLogin.requestFocus();
		
	}
	
}// fim do codigo
