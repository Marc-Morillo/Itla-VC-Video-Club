package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FrmACliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtTarjeta;
	private JTextField txtCredito;
	private JTextField txtCedula;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmACliente frame = new FrmACliente();
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
	public FrmACliente() {
		setTitle("VC: Registrar Cliente");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marcos Morillo\\Desktop\\hhhh.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int width = 1000;
		int height = 700;
		setBounds(center.x - width / 2, center.y - height / 2, width, height);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Registrar Cliente");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblTitulo.setBounds(376, 51, 277, 45);
		contentPane.add(lblTitulo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(360, 51, 305, 45);
		contentPane.add(panel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNombre.setBounds(281, 166, 97, 45);
		contentPane.add(lblNombre);
		
		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblCedula.setBounds(281, 218, 88, 28);
		contentPane.add(lblCedula);
		
		JLabel lblTarjeta = new JLabel("No. tarjeta CR:");
		lblTarjeta.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblTarjeta.setBounds(213, 273, 165, 28);
		contentPane.add(lblTarjeta);
		
		JLabel lblCredito = new JLabel("L\u00EDmite de credito:");
		lblCredito.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblCredito.setBounds(189, 329, 189, 28);
		contentPane.add(lblCredito);
		
		JLabel lblNewLabel = new JLabel("Tipo de persona:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel.setBounds(189, 375, 180, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estado:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(281, 430, 88, 28);
		contentPane.add(lblNewLabel_1);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtTarjeta.setBounds(388, 277, 412, 28);
		contentPane.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		txtCredito = new JTextField();
		txtCredito.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtCredito.setColumns(10);
		txtCredito.setBounds(388, 333, 412, 28);
		contentPane.add(txtCredito);
		
		txtCedula = new JTextField();
		txtCedula.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtCedula.setColumns(10);
		txtCedula.setBounds(388, 222, 412, 28);
		contentPane.add(txtCedula);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtNombre.setColumns(10);
		txtNombre.setBounds(388, 178, 412, 28);
		contentPane.add(txtNombre);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(138, 133, 748, 380);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox cbxEstado = new JComboBox();
		cbxEstado.setBounds(252, 295, 412, 29);
		panel_1.add(cbxEstado);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setBounds(252, 244, 412, 29);
		panel_1.add(cbxTipo);
		cbxTipo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(220, 20, 60));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancelar.setBounds(213, 551, 236, 70);
		contentPane.add(btnCancelar);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(60, 179, 113));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(564, 551, 236, 70);
		contentPane.add(btnNewButton_1);
		
		JLabel lblicon = new JLabel("");
		lblicon.setIcon(new ImageIcon("C:\\Users\\Marcos Morillo\\Downloads\\imageedit_6_7411422029.png"));
		lblicon.setBounds(687, 34, 76, 81);
		contentPane.add(lblicon);
	}
}