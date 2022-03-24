package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField psdpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
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
	public FrmLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marcos Morillo\\Desktop\\hhhh.png"));
		setTitle("VC: Login");
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
		panel.setBounds(249, 151, 543, 354);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbliconpass = new JLabel("");
		lbliconpass.setIcon(new ImageIcon("C:\\Users\\Marcos Morillo\\Downloads\\imageedit_3_7733835392.png"));
		lbliconpass.setBounds(44, 151, 70, 69);
		panel.add(lbliconpass);
		
		JLabel lbliconuser = new JLabel("");
		lbliconuser.setIcon(new ImageIcon("C:\\Users\\Marcos Morillo\\Downloads\\imageedit_6_7411422029.png"));
		lbliconuser.setBounds(44, 57, 70, 57);
		panel.add(lbliconuser);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtUser.setBounds(111, 67, 359, 35);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		psdpass = new JPasswordField();
		psdpass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		psdpass.setBounds(111, 167, 359, 35);
		panel.add(psdpass);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBackground(new Color(60, 179, 113));
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnIngresar.setBounds(197, 251, 166, 57);
		panel.add(btnIngresar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(381, 85, 274, 55);
		contentPane.add(panel_1);
		
		JLabel lblInicio = new JLabel("Inicio de Sesi\u00F3n");
		panel_1.add(lblInicio);
		lblInicio.setForeground(Color.WHITE);
		lblInicio.setBackground(Color.DARK_GRAY);
		lblInicio.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
	}
}