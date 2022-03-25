package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;
import mantenimientos.GestionSesion;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		panel.setBounds(250, 214, 543, 280);
		panel.setBackground(SystemColor.window);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbliconpass = new JLabel("");
		lbliconpass.setIcon(new ImageIcon("C:\\Users\\Marcos Morillo\\Downloads\\imageedit_3_7733835392.png"));
		lbliconpass.setBounds(44, 94, 70, 69);
		panel.add(lbliconpass);
		
		JLabel lbliconuser = new JLabel("");
		lbliconuser.setIcon(new ImageIcon("C:\\Users\\Marcos Morillo\\Downloads\\imageedit_6_7411422029.png"));
		lbliconuser.setBounds(44, 26, 70, 57);
		panel.add(lbliconuser);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtUser.setBounds(111, 39, 359, 35);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		psdpass = new JPasswordField();
		psdpass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		psdpass.setBounds(111, 115, 359, 35);
		panel.add(psdpass);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingresar();
			}
		});
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBackground(new Color(60, 179, 113));
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnIngresar.setBounds(190, 189, 166, 57);
		panel.add(btnIngresar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(391, 148, 274, 55);
		contentPane.add(panel_1);
		
		JLabel lblInicio = new JLabel("Inicio de Sesi\u00F3n");
		panel_1.add(lblInicio);
		lblInicio.setForeground(Color.WHITE);
		lblInicio.setBackground(Color.DARK_GRAY);
		lblInicio.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
	}
	
	protected void Ingresar()
	{
		//Tomando los valores ingresados en la interfaz (text)
		String usuario = txtUser.getText();
		String contraseña = String.valueOf(psdpass.getPassword());
		GestionSesion Gestion = new GestionSesion();
		Usuario usux = new Usuario();
		
		//Guardando los valores 
		usux.setUserName(usuario);
		usux.setPassword(contraseña);
		
		//Verificando si los valores estan ya en la base de datos
		Usuario usu = Gestion.obtenerUsuario(usux);
		if(usu != null)
		{
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			this.dispose();
			FrmAOpcion opcion = new FrmAOpcion();
			opcion.setVisible(true);
		}
		else
		{
			JOptionPane.showMessageDialog(contentPane, "“Debe ingresar su usuario"
					+ "y contraseña, si no está registrado debe solicitar un registro”", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}