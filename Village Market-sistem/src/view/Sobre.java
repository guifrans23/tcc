package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Sobre.class.getResource("/icones/github (2).png")));
		lblNewLabel.setBounds(441, 0, 64, 64);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnOSupermercadoVillage = new JTextPane();
		txtpnOSupermercadoVillage.setEditable(false);
		txtpnOSupermercadoVillage.setBackground(SystemColor.menu);
		txtpnOSupermercadoVillage.setText("O supermercado Village Marker possui produtos voltados para a classe A, onde a grande maioria \u00E9 de marca importada, tem tamb\u00E9m muita variedade de produtos de origem org\u00E2nica. Faz tamb\u00E9m muito Merchandising de produtos importados, pois s\u00E3o os que mais encontramos no interior das lojas e das suas marcas pr\u00F3prias, que s\u00E3o Qualit\u00E1 e Taeq. Possui uma arruma\u00E7\u00E3o de produtos impec\u00E1veis, divididos por marcas e g\u00EAneros, sempre identificados por placas que ficam acima das g\u00F4ndolas. Em suas cores, percebemos maior destaque no verde, pois uma das maiores caracter\u00EDsticas do Village Marker \u00E9 a preocupa\u00E7\u00E3o s\u00F3cio ambiental.");
		txtpnOSupermercadoVillage.setBounds(10, 74, 321, 234);
		contentPane.add(txtpnOSupermercadoVillage);
		
		JLabel lblNewLabel_2 = new JLabel("Sobre N\u00F3s");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(130, 11, 85, 14);
		contentPane.add(lblNewLabel_2);
	}
}
