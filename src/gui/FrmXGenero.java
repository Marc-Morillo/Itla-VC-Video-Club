package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class FrmXGenero extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmXGenero frame = new FrmXGenero();
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
	public FrmXGenero() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marcos Morillo\\Desktop\\hhhh.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int width = 1000;
		int height = 700;
		setBounds(center.x - width / 2, center.y - height / 2, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}