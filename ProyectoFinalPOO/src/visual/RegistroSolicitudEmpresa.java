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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegistroSolicitudEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIDSolicitud;
	private JTextField txtEmpresa;
	private JTextField textField;

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
		setBounds(100, 100, 600, 400);
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
			
			JPanel panel_InfoSolicitud = new JPanel();
			panel_InfoSolicitud.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_InfoSolicitud.setBounds(10, 36, 554, 91);
			panel.add(panel_InfoSolicitud);
			panel_InfoSolicitud.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Univesitario");
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setBounds(154, 26, 109, 23);
			panel_InfoSolicitud.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnTrabajador = new JRadioButton("Obrero");
			rdbtnTrabajador.setBounds(285, 26, 109, 23);
			panel_InfoSolicitud.add(rdbtnTrabajador);
			
			JRadioButton rdbtnTecnico = new JRadioButton("Tecnico");
			rdbtnTecnico.setBounds(416, 26, 109, 23);
			panel_InfoSolicitud.add(rdbtnTecnico);
			
			JLabel lblTipoDeTrabajador = new JLabel("Tipo de trabajador:");
			lblTipoDeTrabajador.setBounds(15, 29, 117, 20);
			panel_InfoSolicitud.add(lblTipoDeTrabajador);
			
			JSpinner spnCantTrabajadores = new JSpinner();
			spnCantTrabajadores.setBounds(157, 56, 159, 20);
			panel_InfoSolicitud.add(spnCantTrabajadores);
			
			JLabel lblCantidadDeTrabajadores = new JLabel("Cantidad de trabajadores:");
			lblCantidadDeTrabajadores.setBounds(15, 56, 147, 20);
			panel_InfoSolicitud.add(lblCantidadDeTrabajadores);
			
			JPanel panel_EspecificSolicitud = new JPanel();
			panel_EspecificSolicitud.setLayout(null);
			panel_EspecificSolicitud.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Especificaciones de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_EspecificSolicitud.setBounds(10, 138, 554, 169);
			panel.add(panel_EspecificSolicitud);
			
			JLabel lblEdadMinima = new JLabel("Edad M\u00EDnima:");
			lblEdadMinima.setBounds(10, 25, 73, 14);
			panel_EspecificSolicitud.add(lblEdadMinima);
			
			JSpinner spnEdadMin = new JSpinner();
			spnEdadMin.setBounds(93, 22, 213, 20);
			panel_EspecificSolicitud.add(spnEdadMin);
			
			JPanel panel_IdiomasRequeridos = new JPanel();
			panel_IdiomasRequeridos.setLayout(null);
			panel_IdiomasRequeridos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Idiomas requeridos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_IdiomasRequeridos.setBounds(331, 25, 213, 130);
			panel_EspecificSolicitud.add(panel_IdiomasRequeridos);
			
			JCheckBox ckbxIngles = new JCheckBox("Ingl\u00E9s");
			ckbxIngles.setBounds(9, 17, 93, 23);
			panel_IdiomasRequeridos.add(ckbxIngles);
			
			JCheckBox ckbxFrances = new JCheckBox("Franc\u00E9s");
			ckbxFrances.setBounds(111, 17, 93, 23);
			panel_IdiomasRequeridos.add(ckbxFrances);
			
			JCheckBox ckbxItaliano = new JCheckBox("Italiano");
			ckbxItaliano.setBounds(9, 51, 93, 23);
			panel_IdiomasRequeridos.add(ckbxItaliano);
			
			JCheckBox ckbxRuso = new JCheckBox("Ruso");
			ckbxRuso.setBounds(9, 85, 93, 23);
			panel_IdiomasRequeridos.add(ckbxRuso);
			
			JCheckBox ckbxJapones = new JCheckBox("Japon\u00E9s");
			ckbxJapones.setBounds(111, 51, 93, 23);
			panel_IdiomasRequeridos.add(ckbxJapones);
			
			JCheckBox ckbxMandarin = new JCheckBox("Mandar\u00EDn");
			ckbxMandarin.setBounds(111, 85, 93, 23);
			panel_IdiomasRequeridos.add(ckbxMandarin);
			
			JLabel lblNewLabel_1 = new JLabel("Localizaci\u00F3n Sugerida:");
			lblNewLabel_1.setBounds(10, 50, 125, 14);
			panel_EspecificSolicitud.add(lblNewLabel_1);
			
			textField = new JTextField();
			textField.setBounds(129, 47, 177, 20);
			panel_EspecificSolicitud.add(textField);
			textField.setColumns(10);
			
			JPanel panel_EspecificUniversitario = new JPanel();
			panel_EspecificUniversitario.setBorder(new TitledBorder(null, "Especificaci\u00F3n profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_EspecificUniversitario.setBounds(6, 75, 300, 80);
			panel_EspecificSolicitud.add(panel_EspecificUniversitario);
			panel_EspecificUniversitario.setLayout(null);
			
			JLabel lblCarrera = new JLabel("Carrera:");
			lblCarrera.setBounds(10, 21, 64, 14);
			panel_EspecificUniversitario.add(lblCarrera);
			
			JComboBox cmbCarrera = new JComboBox();
			cmbCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Ing. Industrial", "Ing. Sistemas", "Ing. Telem\u00E1tica", "Administraci\u00F3n de empresas", "Medicina"}));
			cmbCarrera.setBounds(64, 18, 226, 20);
			panel_EspecificUniversitario.add(cmbCarrera);
			
			JPanel panel_EspecificObrero = new JPanel();
			panel_EspecificObrero.setBorder(new TitledBorder(null, "Especificaci\u00F3n profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_EspecificObrero.setBounds(6, 75, 300, 80);
			panel_EspecificSolicitud.add(panel_EspecificObrero);
			panel_EspecificObrero.setLayout(null);
			
			JLabel lblOficio = new JLabel("Oficio:");
			lblOficio.setBounds(10, 21, 64, 14);
			panel_EspecificObrero.add(lblOficio);
			
			JComboBox cmbOficio = new JComboBox();
			cmbOficio.setBounds(64, 18, 226, 20);
			panel_EspecificObrero.add(cmbOficio);
			
			JPanel panel_EspeficTecnico = new JPanel();
			panel_EspeficTecnico.setBorder(new TitledBorder(null, "Especificaci\u00F3n profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_EspeficTecnico.setBounds(6, 75, 300, 80);
			panel_EspecificSolicitud.add(panel_EspeficTecnico);
			panel_EspeficTecnico.setLayout(null);
			
			JLabel lblAreaTec = new JLabel("\u00C1rea Tec.");
			lblAreaTec.setBounds(10, 21, 64, 14);
			panel_EspeficTecnico.add(lblAreaTec);
			
			JComboBox cmbAreaTec = new JComboBox();
			cmbAreaTec.setBounds(64, 18, 226, 20);
			cmbAreaTec.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			panel_EspeficTecnico.add(cmbAreaTec);
			
			JLabel lblAnyosTecnicos = new JLabel("A\u00F1os T\u00E9c.");
			lblAnyosTecnicos.setBounds(10, 49, 64, 14);
			panel_EspeficTecnico.add(lblAnyosTecnicos);
			
			JSpinner spnAnyosTecnicos = new JSpinner();
			spnAnyosTecnicos.setBounds(64, 46, 226, 20);
			panel_EspeficTecnico.add(spnAnyosTecnicos);
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
