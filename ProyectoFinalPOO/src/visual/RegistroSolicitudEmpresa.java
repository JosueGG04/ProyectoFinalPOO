package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;

public class RegistroSolicitudEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIDSolicitud;
	private JTextField txtEmpresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroSolicitudEmpresa dialog = new RegistroSolicitudEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroSolicitudEmpresa() {
		setBounds(100, 100, 567, 457);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("IDSolicitud:");
			lblNewLabel.setBounds(10, 11, 70, 14);
			panel.add(lblNewLabel);
			
			txtIDSolicitud = new JTextField();
			txtIDSolicitud.setBounds(77, 8, 185, 20);
			panel.add(txtIDSolicitud);
			txtIDSolicitud.setColumns(10);
			{
				JLabel lblEmpresa = new JLabel("Empresa:");
				lblEmpresa.setBounds(279, 11, 70, 14);
				panel.add(lblEmpresa);
			}
			{
				txtEmpresa = new JTextField();
				txtEmpresa.setColumns(10);
				txtEmpresa.setBounds(346, 8, 185, 20);
				panel.add(txtEmpresa);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(10, 36, 521, 91);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Univesitario");
			rdbtnNewRadioButton.setBounds(147, 24, 109, 23);
			panel_1.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnTrabajador = new JRadioButton("Obrero");
			rdbtnTrabajador.setBounds(271, 24, 109, 23);
			panel_1.add(rdbtnTrabajador);
			
			JRadioButton rdbtnTecnico = new JRadioButton("Tecnico");
			rdbtnTecnico.setBounds(395, 24, 109, 23);
			panel_1.add(rdbtnTecnico);
			
			JLabel lblTipoDeTrabajador = new JLabel("Tipo de trabajador:");
			lblTipoDeTrabajador.setBounds(15, 25, 117, 20);
			panel_1.add(lblTipoDeTrabajador);
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(157, 56, 159, 20);
			panel_1.add(spinner);
			
			JLabel lblCantidadDeTrabajadores = new JLabel("Cantidad de trabajadores:");
			lblCantidadDeTrabajadores.setBounds(15, 56, 147, 20);
			panel_1.add(lblCantidadDeTrabajadores);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Especificaciones de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_2.setBounds(10, 138, 521, 226);
			panel.add(panel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
