package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdPedido;
	private JTextField txtIdUsu;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pedido.class.getResource("/icones/pedido-processado.png")));
		setTitle("Pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdPedido = new JTextField();
		txtIdPedido.setBounds(102, 36, 33, 20);
		contentPane.add(txtIdPedido);
		txtIdPedido.setColumns(10);
		
		txtIdUsu = new JTextField();
		txtIdUsu.setColumns(10);
		txtIdUsu.setBounds(102, 92, 33, 20);
		contentPane.add(txtIdUsu);
		
		lblNewLabel = new JLabel("IdPedido");
		lblNewLabel.setBounds(31, 39, 61, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("IdUsuario");
		lblNewLabel_1.setBounds(31, 95, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Status");
		lblNewLabel_2.setBounds(31, 150, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtStatus = new JTextField();
		txtStatus.setColumns(10);
		txtStatus.setBounds(102, 147, 33, 20);
		contentPane.add(txtStatus);
	}

}
