package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.Color;

public class RegistroEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNomDirector;
	private JTextField txtTelDirector;
	private JTextField txtCorreoDirector;
	private JTextField txtRNC;
	private JTextField txtCorreoEmpresa;
	private JTextField txtNombre;
	private JTextField txtTelEmpresa;

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
		setBounds(100, 100, 669, 314);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_Empresa = new JPanel();
			panel_Empresa.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_Empresa.setBounds(10, 11, 623, 117);
			panel.add(panel_Empresa);
			panel_Empresa.setLayout(null);
			{
				JLabel lblRNC = new JLabel("RNC:");
				lblRNC.setBounds(10, 29, 79, 14);
				panel_Empresa.add(lblRNC);
			}
			{
				JLabel lblCorreoEmpresa = new JLabel("Correo de la empresa:");
				lblCorreoEmpresa.setBounds(10, 90, 129, 14);
				panel_Empresa.add(lblCorreoEmpresa);
			}
			{
				txtRNC = new JTextField();
				txtRNC.setColumns(10);
				txtRNC.setBounds(135, 26, 170, 20);
				panel_Empresa.add(txtRNC);
			}
			{
				txtCorreoEmpresa = new JTextField();
				txtCorreoEmpresa.setColumns(10);
				txtCorreoEmpresa.setBounds(135, 87, 476, 20);
				panel_Empresa.add(txtCorreoEmpresa);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setBounds(315, 29, 79, 14);
				panel_Empresa.add(lblNombre);
			}
			{
				JLabel lblTelEmpresa = new JLabel("Tel\u00E9fono de la empresa:");
				lblTelEmpresa.setBounds(315, 62, 129, 14);
				panel_Empresa.add(lblTelEmpresa);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setColumns(10);
				txtNombre.setBounds(441, 26, 170, 20);
				panel_Empresa.add(txtNombre);
			}
			{
				txtTelEmpresa = new JTextField();
				txtTelEmpresa.setColumns(10);
				txtTelEmpresa.setBounds(441, 59, 170, 20);
				panel_Empresa.add(txtTelEmpresa);
			}
			{
				JLabel lblArea = new JLabel("\u00C1rea:");
				lblArea.setBounds(10, 62, 46, 14);
				panel_Empresa.add(lblArea);
			}
			
			JComboBox cmbArea = new JComboBox();
			cmbArea.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Industrial", "Comercial", "Servicios"}));
			cmbArea.setEditable(true);
			cmbArea.setBounds(135, 57, 170, 20);
			panel_Empresa.add(cmbArea);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "Informaci\u00F3n del Director", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBounds(10, 139, 623, 87);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JLabel lbl = new JLabel("Director:");
				lbl.setBounds(10, 31, 79, 14);
				panel_1.add(lbl);
				
				JLabel lblCorreoDelDirector = new JLabel("Correo del Director:");
				lblCorreoDelDirector.setBounds(10, 59, 115, 14);
				panel_1.add(lblCorreoDelDirector);
				
				txtNomDirector = new JTextField();
				txtNomDirector.setBounds(135, 28, 170, 20);
				panel_1.add(txtNomDirector);
				txtNomDirector.setColumns(10);
				
				txtCorreoDirector = new JTextField();
				txtCorreoDirector.setBounds(135, 56, 476, 20);
				panel_1.add(txtCorreoDirector);
				txtCorreoDirector.setColumns(10);
				
				JLabel lblTelfonoDelDirector = new JLabel("Tel\u00E9fono del Director:");
				lblTelfonoDelDirector.setBounds(315, 31, 129, 14);
				panel_1.add(lblTelfonoDelDirector);
				
				txtTelDirector = new JTextField();
				txtTelDirector.setBounds(441, 28, 170, 20);
				panel_1.add(txtTelDirector);
				txtTelDirector.setColumns(10);
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
