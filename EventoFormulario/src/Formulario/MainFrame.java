package Formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("Formulario concatenar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnContatenar = new JButton("Concatenar");
		btnContatenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText(txtNombre.getText()+ " "+txtApellido.getText());
				//JOptionPane.showMessageDialog(null, lblMensaje.getText());
			}
		});
		btnContatenar.setBounds(165, 116, 89, 23);
		contentPane.add(btnContatenar);
		
		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setBounds(58, 70, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(58, 45, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(147, 42, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(147, 67, 86, 20);
		contentPane.add(txtApellido);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(80, 182, 253, 14);
		contentPane.add(lblMensaje);
	}
}
