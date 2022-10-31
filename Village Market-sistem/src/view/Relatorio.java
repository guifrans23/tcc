package view;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import model.DAO;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Relatorio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio frame = new Relatorio();
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
	public Relatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRelClientes = new JButton("Relatorio Clientes");
		btnRelClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorioClientes();
			}
		});
		btnRelClientes.setToolTipText("Relatorio Clientes");
		btnRelClientes.setBounds(64, 31, 142, 23);
		contentPane.add(btnRelClientes);
		
		JButton btnRelFornecedores = new JButton("Relatorio Fornecedores");
		btnRelFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorioFornecedores();
			}
		});
		btnRelFornecedores.setToolTipText("Relatorio Clientes");
		btnRelFornecedores.setBounds(64, 85, 170, 23);
		contentPane.add(btnRelFornecedores);
		
		JButton btnRelRepositorio = new JButton("Relatorio Reposi\u00E7\u00E3o de estoque");
		btnRelRepositorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorioReposicao();
			}
		});
		btnRelRepositorio.setToolTipText("Relatorio Reposi\u00E7\u00E3o de estoque");
		btnRelRepositorio.setBounds(64, 230, 221, 23);
		contentPane.add(btnRelRepositorio);
		
		JButton btnRelVencidos = new JButton("Relatorio Produtos vencidos");
		btnRelVencidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorioVencidos();
			}
		});
		btnRelVencidos.setToolTipText("Relatorio Clientes");
		btnRelVencidos.setBounds(64, 179, 209, 23);
		contentPane.add(btnRelVencidos);
		
		JButton btnRelMarketing = new JButton("Relatorio email marketing");
		btnRelMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorioMarketing();
			}
		});
		btnRelMarketing.setToolTipText("Relatorio email marketing");
		btnRelMarketing.setBounds(64, 277, 231, 23);
		contentPane.add(btnRelMarketing);
		
		JButton btnRelInventario = new JButton("Relatorio Invent\u00E1rio");
		btnRelInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				relatorioInventario();
			}
		});
		btnRelInventario.setToolTipText("Relatorio email marketing");
		btnRelInventario.setBounds(64, 134, 184, 23);
		contentPane.add(btnRelInventario);
	}// fim do construtor
	
	DAO dao = new DAO();
	
	private void relatorioClientes() {
		// criar objeto para construir a pagina pdf
				Document document = new Document();
				// gerar o documento pdf
				try {
					PdfWriter.getInstance(document, new FileOutputStream("clientes.pdf"));
					document.open();
					// gerar conteudo do documento
					Date data = new Date();
					DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
					document.add(new Paragraph(new Paragraph(formatador.format(data))));
					document.add(new Paragraph(" "));
					document.add(new Paragraph("Clientes cadastrados"));
					document.add(new Paragraph(" "));
					// ... demais conteudos (imagem, tabela, grafico, etc)
					PdfPTable tabela = new PdfPTable(4);
					PdfPCell col1 = new PdfPCell(new Paragraph("Nome"));
					PdfPCell col2 = new PdfPCell(new Paragraph("Fone"));
					PdfPCell col3 = new PdfPCell(new Paragraph("CPF"));
					PdfPCell col4 = new PdfPCell(new Paragraph("E-mail"));
					tabela.addCell(col1);
					tabela.addCell(col2);
					tabela.addCell(col3);
					tabela.addCell(col4);
					// Acessar o banco de dados

					document.add(tabela);
	} catch (Exception e) {
		System.out.println();
	} finally { // executa o codigo independente do resultado OK ou Não
		document.close();
	}
				try {
					Desktop.getDesktop().open(new File("clientes.pdf"));
				} catch (Exception e) {
					System.out.println(e);
				}
	}
	
	private void relatorioFornecedores() {

		// criar objeto para construir a pagina pdf
		Document document = new Document();
		// gerar o documento pdf
		try {
			PdfWriter.getInstance(document, new FileOutputStream("fornecedores.pdf"));
			document.open();
			// gerar conteudo do documento
			Date data = new Date();
			DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			document.add(new Paragraph(new Paragraph(formatador.format(data))));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Fornecedores cadastrados"));
			document.add(new Paragraph(" "));
			// ... demais conteudos (imagem, tabela, grafico, etc)
			PdfPTable tabela = new PdfPTable(4);
			PdfPCell col1 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell col2 = new PdfPCell(new Paragraph("Fone"));
			PdfPCell col3 = new PdfPCell(new Paragraph("CPF"));
			PdfPCell col4 = new PdfPCell(new Paragraph("E-mail"));
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			tabela.addCell(col4);
			// Acessar o banco de dados

			document.add(tabela);
		} catch (Exception e) {
			System.out.println();
		} finally { // executa o codigo independente do resultado OK ou Não
			document.close();
		}

		// abrir o documento que foi gerado no leitor padrao de pdf dp sistema (PC)
		try {
			Desktop.getDesktop().open(new File("fornecedores.pdf"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void relatorioVencidos() {

		// criar objeto para construir a pagina pdf
		Document document = new Document();
		// gerar o documento pdf
		try {
			PdfWriter.getInstance(document, new FileOutputStream("vencidos.pdf"));
			document.open();
			// gerar conteudo do documento
			Date data = new Date();
			DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			document.add(new Paragraph(new Paragraph(formatador.format(data))));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Produtos vencidos"));
			document.add(new Paragraph(" "));
			// ... demais conteudos (imagem, tabela, grafico, etc)
			PdfPTable tabela = new PdfPTable(4);
			PdfPCell col1 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell col2 = new PdfPCell(new Paragraph("Fone"));
			PdfPCell col3 = new PdfPCell(new Paragraph("CPF"));
			PdfPCell col4 = new PdfPCell(new Paragraph("E-mail"));
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			tabela.addCell(col4);
			// Acessar o banco de dados

			document.add(tabela);
		} catch (Exception e) {
			System.out.println();
		} finally { // executa o codigo independente do resultado OK ou Não
			document.close();
		}

		// abrir o documento que foi gerado no leitor padrao de pdf dp sistema (PC)
		try {
			Desktop.getDesktop().open(new File("vencidos.pdf"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void relatorioInventario() {

		// criar objeto para construir a pagina pdf
		Document document = new Document();
		// gerar o documento pdf
		try {
			PdfWriter.getInstance(document, new FileOutputStream("inventario.pdf"));
			document.open();
			// gerar conteudo do documento
			Date data = new Date();
			DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			document.add(new Paragraph(new Paragraph(formatador.format(data))));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Inventario"));
			document.add(new Paragraph(" "));
			// ... demais conteudos (imagem, tabela, grafico, etc)
			PdfPTable tabela = new PdfPTable(4);
			PdfPCell col1 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell col2 = new PdfPCell(new Paragraph("Fone"));
			PdfPCell col3 = new PdfPCell(new Paragraph("CPF"));
			PdfPCell col4 = new PdfPCell(new Paragraph("E-mail"));
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			tabela.addCell(col4);
			// Acessar o banco de dados

			document.add(tabela);
		} catch (Exception e) {
			System.out.println();
		} finally { // executa o codigo independente do resultado OK ou Não
			document.close();
		}

		// abrir o documento que foi gerado no leitor padrao de pdf dp sistema (PC)
		try {
			Desktop.getDesktop().open(new File("inventario.pdf"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void relatorioMarketing() {

		// criar objeto para construir a pagina pdf
		Document document = new Document();
		// gerar o documento pdf
		try {
			PdfWriter.getInstance(document, new FileOutputStream("marketing.pdf"));
			document.open();
			// gerar conteudo do documento
			Date data = new Date();
			DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			document.add(new Paragraph(new Paragraph(formatador.format(data))));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Marketing"));
			document.add(new Paragraph(" "));
			// ... demais conteudos (imagem, tabela, grafico, etc)
			PdfPTable tabela = new PdfPTable(4);
			PdfPCell col1 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell col2 = new PdfPCell(new Paragraph("Fone"));
			PdfPCell col3 = new PdfPCell(new Paragraph("CPF"));
			PdfPCell col4 = new PdfPCell(new Paragraph("E-mail"));
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			tabela.addCell(col4);
			// Acessar o banco de dados

			document.add(tabela);
		} catch (Exception e) {
			System.out.println();
		} finally { // executa o codigo independente do resultado OK ou Não
			document.close();
		}

		// abrir o documento que foi gerado no leitor padrao de pdf dp sistema (PC)
		try {
			Desktop.getDesktop().open(new File("marketing.pdf"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void relatorioReposicao() {

		// criar objeto para construir a pagina pdf
		Document document = new Document();
		// gerar o documento pdf
		try {
			PdfWriter.getInstance(document, new FileOutputStream("reposicao.pdf"));
			document.open();
			// gerar conteudo do documento
			Date data = new Date();
			DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			document.add(new Paragraph(new Paragraph(formatador.format(data))));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Reposicao"));
			document.add(new Paragraph(" "));
			// ... demais conteudos (imagem, tabela, grafico, etc)
			PdfPTable tabela = new PdfPTable(4);
			PdfPCell col1 = new PdfPCell(new Paragraph("Nome"));
			PdfPCell col2 = new PdfPCell(new Paragraph("Fone"));
			PdfPCell col3 = new PdfPCell(new Paragraph("CPF"));
			PdfPCell col4 = new PdfPCell(new Paragraph("E-mail"));
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			tabela.addCell(col4);
			// Acessar o banco de dados

			document.add(tabela);
		} catch (Exception e) {
			System.out.println();
		} finally { // executa o codigo independente do resultado OK ou Não
			document.close();
		}

		// abrir o documento que foi gerado no leitor padrao de pdf dp sistema (PC)
		try {
			Desktop.getDesktop().open(new File("reposicao.pdf"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}// fim do codigo
