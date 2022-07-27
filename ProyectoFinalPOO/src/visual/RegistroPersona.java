package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;

public class RegistroPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroPersona dialog = new RegistroPersona();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroPersona() {
		setBounds(100, 100, 550, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel_personal = new JPanel();
		panel_personal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_personal.setBounds(10, 11, 514, 263);
		contentPanel.add(panel_personal);
		panel_personal.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 86, 64, 14);
		panel_personal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 114, 219, 20);
		panel_personal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 24, 46, 14);
		panel_personal.add(lblCedula);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(10, 52, 219, 20);
		panel_personal.add(formattedTextField);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(10, 198, 128, 14);
		panel_personal.add(lblFechaDeNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(259, 24, 64, 14);
		panel_personal.add(lblTelefono);
		
		JFormattedTextField ftxtTelefono = new JFormattedTextField();
		ftxtTelefono.setBounds(259, 52, 219, 20);
		panel_personal.add(ftxtTelefono);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(259, 86, 46, 14);
		panel_personal.add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(259, 114, 219, 20);
		panel_personal.add(txtCiudad);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(259, 198, 46, 14);
		panel_personal.add(lblGenero);
		
		DatePicker FechaNacimiento = new DatePicker();
		FechaNacimiento.getComponentToggleCalendarButton().setSize(26, 20);
		FechaNacimiento.getComponentDateTextField().setSize(190, 20);
		FechaNacimiento.setDateToToday();
		FechaNacimiento.setBounds(10, 173, 219, 25);//get date ("uuuu-MM-dd")
		panel_personal.add(FechaNacimiento);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBounds(259, 224, 109, 23);
		panel_personal.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(380, 224, 109, 23);
		panel_personal.add(rdbtnMujer);
		
		JLabel lblNewLabel = new JLabel("Correo electr\u00F3nico:");
		lblNewLabel.setBounds(10, 145, 109, 14);
		panel_personal.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 170, 468, 20);
		panel_personal.add(textField);
		textField.setColumns(10);
		
		JPanel panel_info_tipo = new JPanel();
		panel_info_tipo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion Especifica", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_info_tipo.setBounds(10, 521, 514, 100);
		contentPanel.add(panel_info_tipo);
		panel_info_tipo.setLayout(null);
		
		JPanel panel_tipo = new JPanel();
		panel_tipo.setLayout(null);
		panel_tipo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo de personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_tipo.setBounds(10, 433, 514, 77);
		contentPanel.add(panel_tipo);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Univesitario");
		rdbtnNewRadioButton_1.setBounds(46, 29, 109, 23);
		panel_tipo.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnTecnico = new JRadioButton("Tecnico");
		rdbtnTecnico.setBounds(201, 29, 109, 23);
		panel_tipo.add(rdbtnTecnico);
		
		JRadioButton rdbtnTrabajador = new JRadioButton("Trabajador");
		rdbtnTrabajador.setBounds(356, 29, 109, 23);
		panel_tipo.add(rdbtnTrabajador);
		
		JPanel panel_empleado = new JPanel();
		panel_empleado.setLayout(null);
		panel_empleado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_empleado.setBounds(10, 285, 514, 137);
		contentPanel.add(panel_empleado);
		
		JLabel lblSalarioEsperado = new JLabel("Salario Esperado:");
		lblSalarioEsperado.setBounds(10, 22, 100, 14);
		panel_empleado.add(lblSalarioEsperado);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 47, 213, 20);
		panel_empleado.add(spinner);
		
		JPanel panel_idiomas = new JPanel();
		panel_idiomas.setBorder(new TitledBorder(null, "Idiomas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_idiomas.setBounds(291, 11, 213, 115);
		panel_empleado.add(panel_idiomas);
		panel_idiomas.setLayout(null);
		
		JCheckBox chckbxNIngles = new JCheckBox("Ingles");
		chckbxNIngles.setBounds(9, 17, 93, 23);
		panel_idiomas.add(chckbxNIngles);
		
		JCheckBox chckbxFrances = new JCheckBox("Frances");
		chckbxFrances.setBounds(111, 17, 93, 23);
		panel_idiomas.add(chckbxFrances);
		
		JCheckBox chckbxItaliano = new JCheckBox("Italiano");
		chckbxItaliano.setBounds(9, 51, 93, 23);
		panel_idiomas.add(chckbxItaliano);
		
		JCheckBox chckbxRuso = new JCheckBox("Ruso");
		chckbxRuso.setBounds(9, 85, 93, 23);
		panel_idiomas.add(chckbxRuso);
		
		JCheckBox chckbxJapones = new JCheckBox("Japones");
		chckbxJapones.setBounds(111, 51, 93, 23);
		panel_idiomas.add(chckbxJapones);
		
		JCheckBox chckbxChino = new JCheckBox("Mandarin");
		chckbxChino.setBounds(111, 85, 93, 23);
		panel_idiomas.add(chckbxChino);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Asalariado ");
		chckbxNewCheckBox_1.setBounds(10, 74, 97, 23);
		panel_empleado.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxDisponibilidadDeMudanza = new JCheckBox("Disponibilidad de mudanza");
		chckbxDisponibilidadDeMudanza.setBounds(10, 103, 190, 23);
		panel_empleado.add(chckbxDisponibilidadDeMudanza);
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
