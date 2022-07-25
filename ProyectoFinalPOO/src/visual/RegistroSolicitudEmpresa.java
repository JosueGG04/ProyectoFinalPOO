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
		setBounds(100, 100, 567, 396);
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
			panel_1.setBorder(new TitledBorder(null, "Cantidad a Contratar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 36, 521, 115);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblUniversitarios = new JLabel("Universitarios:");
			lblUniversitarios.setBounds(10, 26, 112, 14);
			panel_1.add(lblUniversitarios);
			
			JSpinner spnCantUni = new JSpinner();
			spnCantUni.setBounds(126, 23, 385, 20);
			panel_1.add(spnCantUni);
			
			JLabel lblTcnicos = new JLabel("T\u00E9cnicos");
			lblTcnicos.setBounds(10, 54, 112, 14);
			panel_1.add(lblTcnicos);
			
			JSpinner spnCantTec = new JSpinner();
			spnCantTec.setBounds(126, 51, 385, 20);
			panel_1.add(spnCantTec);
			
			JLabel lblObreros = new JLabel("Obreros:");
			lblObreros.setBounds(10, 82, 112, 14);
			panel_1.add(lblObreros);
			
			JSpinner spnCantObreros = new JSpinner();
			spnCantObreros.setBounds(126, 79, 385, 20);
			panel_1.add(spnCantObreros);
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
