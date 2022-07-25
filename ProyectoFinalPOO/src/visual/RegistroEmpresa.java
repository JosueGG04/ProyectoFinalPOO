package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistroEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIDEmpresa;
	private JTextField txtNombre;
	private JTextField txtDirector;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroEmpresa dialog = new RegistroEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroEmpresa() {
		setBounds(100, 100, 556, 326);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblIDEmpresa = new JLabel("IDEmpresa:");
			lblIDEmpresa.setBounds(10, 11, 79, 14);
			panel.add(lblIDEmpresa);
			{
				txtIDEmpresa = new JTextField();
				txtIDEmpresa.setBounds(75, 8, 170, 20);
				panel.add(txtIDEmpresa);
				txtIDEmpresa.setColumns(10);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.setBounds(350, 8, 170, 20);
				panel.add(txtNombre);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(285, 11, 79, 14);
				panel.add(lblNombre);
			}
			{
				JLabel lblDirector = new JLabel("Director:");
				lblDirector.setBounds(10, 44, 79, 14);
				panel.add(lblDirector);
			}
			{
				txtDirector = new JTextField();
				txtDirector.setColumns(10);
				txtDirector.setBounds(75, 41, 170, 20);
				panel.add(txtDirector);
			}
			{
				JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
				lblTelefono.setBounds(285, 42, 79, 14);
				panel.add(lblTelefono);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.setBounds(350, 39, 170, 20);
				panel.add(txtTelefono);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnAgregar = new JButton("Agregar");
				btnAgregar.setActionCommand("OK");
				buttonPane.add(btnAgregar);
				getRootPane().setDefaultButton(btnAgregar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
