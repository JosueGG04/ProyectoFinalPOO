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

import logico.Utilidades;

import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class RegistroSolicitudEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIDSolicitud;
	private JTextField txtEmpresa;
	private JRadioButton rbUniversitario;
	private JRadioButton rbObrero;
	private JRadioButton rbTecnico;
	private JPanel panel_EspecificUniversitario;
	private JPanel panel_EspecificObrero;
	private JPanel panel_EspeficTecnico;
	private JSpinner spnEdadMin;
	private JCheckBox chckbxIngles;
	private JCheckBox chckbxFrances;
	private JCheckBox chckbxItaliano;
	private JCheckBox chckbxJapones;
	private JCheckBox chckbxRuso;
	private JCheckBox chckbxMandarin;
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
		setTitle("Crear Solicitud Empresa");
		setBounds(100, 100, 512, 525);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Codigo solicitud:");
			lblNewLabel.setBounds(19, 11, 102, 14);
			panel.add(lblNewLabel);
			
			txtIDSolicitud = new JTextField();
			txtIDSolicitud.setEditable(false);
			txtIDSolicitud.setBounds(117, 8, 89, 20);
			panel.add(txtIDSolicitud);
			txtIDSolicitud.setColumns(10);
			{
				JLabel lblEmpresa = new JLabel("Empresa:");
				lblEmpresa.setBounds(19, 41, 70, 14);
				panel.add(lblEmpresa);
			}
			{
				txtEmpresa = new JTextField();
				txtEmpresa.setEditable(false);
				txtEmpresa.setColumns(10);
				txtEmpresa.setBounds(82, 38, 276, 20);
				panel.add(txtEmpresa);
			}
			
			JPanel panel_InfoSolicitud = new JPanel();
			panel_InfoSolicitud.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_InfoSolicitud.setBounds(10, 69, 472, 119);
			panel.add(panel_InfoSolicitud);
			panel_InfoSolicitud.setLayout(null);
			
			rbUniversitario = new JRadioButton("Univesitario");
			rbUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbUniversitario.isSelected()) {
						rbObrero.setSelected(false);
						rbTecnico.setSelected(false);
						panel_EspecificObrero.setVisible(false);
						panel_EspecificUniversitario.setVisible(true);
						panel_EspeficTecnico.setVisible(false);;
					}
				}
			});
			rbUniversitario.setSelected(true);
			rbUniversitario.setBounds(139, 13, 100, 23);
			panel_InfoSolicitud.add(rbUniversitario);
			
			rbObrero = new JRadioButton("Obrero");
			rbObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbObrero.isSelected()) {
						rbUniversitario.setSelected(false);
						rbTecnico.setSelected(false);
						panel_EspecificObrero.setVisible(true);
						panel_EspecificUniversitario.setVisible(false);
						panel_EspeficTecnico.setVisible(false);;
					}
				}
			});
			rbObrero.setBounds(250, 13, 100, 23);
			panel_InfoSolicitud.add(rbObrero);
			
			rbTecnico = new JRadioButton("Tecnico");
			rbTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbTecnico.isSelected()) {
						rbUniversitario.setSelected(false);
						rbObrero.setSelected(false);
						panel_EspecificObrero.setVisible(false);
						panel_EspecificUniversitario.setVisible(false);
						panel_EspeficTecnico.setVisible(true);;
					}
				}
			});
			rbTecnico.setBounds(361, 13, 100, 23);
			panel_InfoSolicitud.add(rbTecnico);
			
			JLabel lblTipoDeTrabajador = new JLabel("Tipo de trabajador:");
			lblTipoDeTrabajador.setBounds(11, 16, 117, 20);
			panel_InfoSolicitud.add(lblTipoDeTrabajador);
			
			JSpinner spnCantTrabajadores = new JSpinner();
			spnCantTrabajadores.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnCantTrabajadores.setBounds(172, 48, 229, 20);
			panel_InfoSolicitud.add(spnCantTrabajadores);
			
			JLabel lblCantidadDeTrabajadores = new JLabel("Cantidad de trabajadores:");
			lblCantidadDeTrabajadores.setBounds(11, 52, 147, 20);
			panel_InfoSolicitud.add(lblCantidadDeTrabajadores);
			
			JLabel lblVacante = new JLabel("Titulo del empleo:");
			lblVacante.setBounds(11, 88, 125, 14);
			panel_InfoSolicitud.add(lblVacante);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(130, 85, 220, 20);
			panel_InfoSolicitud.add(textField);
			
			JPanel panel_EspecificSolicitud = new JPanel();
			panel_EspecificSolicitud.setLayout(null);
			panel_EspecificSolicitud.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Especificaciones de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_EspecificSolicitud.setBounds(10, 199, 472, 228);
			panel.add(panel_EspecificSolicitud);
			
			JLabel lblEdadMinima = new JLabel("Edad M\u00EDnima:");
			lblEdadMinima.setBounds(10, 25, 101, 14);
			panel_EspecificSolicitud.add(lblEdadMinima);
			
			spnEdadMin = new JSpinner();
			spnEdadMin.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnEdadMin.setBounds(121, 22, 159, 20);
			panel_EspecificSolicitud.add(spnEdadMin);
			
			JPanel panel_IdiomasRequeridos = new JPanel();
			panel_IdiomasRequeridos.setLayout(null);
			panel_IdiomasRequeridos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Idiomas requeridos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_IdiomasRequeridos.setBounds(290, 11, 174, 130);
			panel_EspecificSolicitud.add(panel_IdiomasRequeridos);
			
			chckbxIngles = new JCheckBox("Ingl\u00E9s");
			chckbxIngles.setBounds(4, 17, 80, 23);
			panel_IdiomasRequeridos.add(chckbxIngles);
			
			chckbxFrances = new JCheckBox("Franc\u00E9s");
			chckbxFrances.setBounds(88, 17, 80, 23);
			panel_IdiomasRequeridos.add(chckbxFrances);
			
			chckbxItaliano = new JCheckBox("Italiano");
			chckbxItaliano.setBounds(4, 51, 80, 23);
			panel_IdiomasRequeridos.add(chckbxItaliano);
			
			chckbxRuso = new JCheckBox("Ruso");
			chckbxRuso.setBounds(4, 85, 80, 23);
			panel_IdiomasRequeridos.add(chckbxRuso);
			
			chckbxJapones = new JCheckBox("Japon\u00E9s");
			chckbxJapones.setBounds(88, 51, 80, 23);
			panel_IdiomasRequeridos.add(chckbxJapones);
			
			chckbxMandarin = new JCheckBox("Mandar\u00EDn");
			chckbxMandarin.setBounds(88, 85, 80, 23);
			panel_IdiomasRequeridos.add(chckbxMandarin);
			
			JLabel lblNewLabel_1 = new JLabel("Provincia Sugerida:");
			lblNewLabel_1.setBounds(10, 50, 125, 14);
			panel_EspecificSolicitud.add(lblNewLabel_1);
			
			panel_EspeficTecnico = new JPanel();
			panel_EspeficTecnico.setVisible(false);
			panel_EspeficTecnico.setBorder(new TitledBorder(null, "Especificaci\u00F3n profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_EspeficTecnico.setBounds(10, 137, 454, 80);
			panel_EspecificSolicitud.add(panel_EspeficTecnico);
			panel_EspeficTecnico.setLayout(null);
			
			JLabel lblAreaTec = new JLabel("\u00C1rea Tec.");
			lblAreaTec.setBounds(10, 21, 64, 14);
			panel_EspeficTecnico.add(lblAreaTec);
			
			JComboBox cmbAreaTec = new JComboBox();
			cmbAreaTec.setBounds(84, 18, 226, 20);
			cmbAreaTec.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>"}));
			panel_EspeficTecnico.add(cmbAreaTec);
			
			JLabel lblAnyosTecnicos = new JLabel("A\u00F1os T\u00E9c.");
			lblAnyosTecnicos.setBounds(10, 49, 64, 14);
			panel_EspeficTecnico.add(lblAnyosTecnicos);
			
			JSpinner spnAnyosTecnicos = new JSpinner();
			spnAnyosTecnicos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnAnyosTecnicos.setBounds(84, 46, 226, 20);
			panel_EspeficTecnico.add(spnAnyosTecnicos);
			
			panel_EspecificUniversitario = new JPanel();
			panel_EspecificUniversitario.setBorder(new TitledBorder(null, "Especificaci\u00F3n profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_EspecificUniversitario.setBounds(10, 137, 454, 80);
			panel_EspecificSolicitud.add(panel_EspecificUniversitario);
			panel_EspecificUniversitario.setLayout(null);
			
			JLabel lblCarrera = new JLabel("Carrera:");
			lblCarrera.setBounds(10, 21, 64, 14);
			panel_EspecificUniversitario.add(lblCarrera);
			
			JComboBox cmbCarrera = new JComboBox();
			cmbCarrera.setModel(new DefaultComboBoxModel(new String[] {"", "Arquitectura", "Comercio Internacional", "Contabilidad", "Derecho", "Educaci\u00F3n F\u00EDsica", "Enfermer\u00EDa", "Filosof\u00EDa y Letras", "Finanzas", "Inform\u00E1tica", "Ingenier\u00EDa en alimentos", "Medicina", "Nutricionista", "Publicidad y Mercadeo"}));
			cmbCarrera.setBounds(84, 18, 226, 20);
			panel_EspecificUniversitario.add(cmbCarrera);
			
			panel_EspecificObrero = new JPanel();
			panel_EspecificObrero.setVisible(false);
			panel_EspecificObrero.setBorder(new TitledBorder(null, "Especificaci\u00F3n profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_EspecificObrero.setBounds(10, 137, 454, 80);
			panel_EspecificSolicitud.add(panel_EspecificObrero);
			panel_EspecificObrero.setLayout(null);
			
			JLabel lblOficio = new JLabel("Oficio:");
			lblOficio.setBounds(10, 21, 64, 14);
			panel_EspecificObrero.add(lblOficio);
			
			JComboBox cmbOficio = new JComboBox();
			cmbOficio.setBounds(84, 18, 226, 20);
			panel_EspecificObrero.add(cmbOficio);
			
			JCheckBox chckbxDisponibilidadDeViajar = new JCheckBox("Disponibilidad de viajar");
			chckbxDisponibilidadDeViajar.setBounds(10, 74, 190, 23);
			panel_EspecificSolicitud.add(chckbxDisponibilidadDeViajar);
			
			JCheckBox chckbxDisponibilidadDeMudanza = new JCheckBox("Disponibilidad de mudanza");
			chckbxDisponibilidadDeMudanza.setBounds(10, 100, 190, 23);
			panel_EspecificSolicitud.add(chckbxDisponibilidadDeMudanza);
			
			JComboBox cmbProvincia = new JComboBox();
			cmbProvincia.setModel(new DefaultComboBoxModel(new String[] {"", "Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Distrito Nacional", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Enriquillo", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Higuamo", "Independencia", "La Altagracia", "La Romana", "La Vega", "Mar\u00EDa Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Ozama", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Crist\u00F3bal", "San Jos\u00E9 de Ocoa", "San Juan", "San Pedro de Macor\u00EDs", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "S\u00E1nchez Ram\u00EDrez", "Valdesia", "Valverde", "Yuma"}));
			cmbProvincia.setBounds(136, 47, 144, 20);
			panel_EspecificSolicitud.add(cmbProvincia);
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.setBounds(377, 7, 89, 23);
			panel.add(btnNewButton);
			
			JLabel label = new JLabel("RNC:");
			label.setBounds(216, 11, 35, 14);
			panel.add(label);
			
			JFormattedTextField ftxtRNC = new JFormattedTextField(Utilidades.getMascaraRNC());
			ftxtRNC.setBounds(270, 8, 88, 20);
			panel.add(ftxtRNC);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
