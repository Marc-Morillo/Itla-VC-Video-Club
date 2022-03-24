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
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.ImageIcon;

public class FrmAEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtComision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAEmpleado frame = new FrmAEmpleado();
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
	public FrmAEmpleado() {
		setResizable(false);
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(331, 51, 344, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 0, 340, 45);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(138, 133, 748, 380);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(168, 37, 97, 44);
		lblNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		panel_1.add(lblNombre);
		
		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setBounds(181, 92, 99, 28);
		lblCedula.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		panel_1.add(lblCedula);
		
		JLabel lblTanda = new JLabel("Tanda laboral:");
		lblTanda.setBounds(108, 151, 157, 21);
		lblTanda.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		panel_1.add(lblTanda);
		
		JLabel lblComision = new JLabel("Porciento comisi\u00F3n:");
		lblComision.setBounds(71, 201, 194, 28);
		lblComision.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		panel_1.add(lblComision);
		
		JLabel lblFecha = new JLabel("Fecha ingreso:");
		lblFecha.setBounds(108, 254, 157, 41);
		lblFecha.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		panel_1.add(lblFecha);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(177, 318, 88, 21);
		lblEstado.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		panel_1.add(lblEstado);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(267, 45, 326, 28);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(267, 92, 326, 28);
		panel_1.add(txtCedula);
		
		txtComision = new JTextField();
		txtComision.setColumns(10);
		txtComision.setBounds(267, 201, 326, 28);
		panel_1.add(txtComision);
		
		JComboBox cbxTanda = new JComboBox();
		cbxTanda.setBounds(267, 145, 326, 28);
		panel_1.add(cbxTanda);
		
		JComboBox txtEstado = new JComboBox();
		txtEstado.setBounds(267, 318, 326, 28);
		panel_1.add(txtEstado);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(220, 20, 60));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancelar.setBounds(213, 551, 236, 70);
		contentPane.add(btnCancelar);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(590, 551, 236, 70);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Marcos Morillo\\Downloads\\imageedit_6_7411422029.png"));
		lblNewLabel_1.setBounds(685, 34, 70, 80);
		contentPane.add(lblNewLabel_1);
	}
}