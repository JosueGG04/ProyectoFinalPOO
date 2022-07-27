package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import com.github.lgooddatepicker.components.DatePicker;

import logico.Administracion;
import logico.Tecnico;
import logico.Universitario;
import logico.Utilidades;

import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;

public class RegistroPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField textField;
	private JTextField txtCorreo;
	private JFormattedTextField ftxtCedula;
	private JFormattedTextField ftxtTelefono;
	private JComboBox cbxProvincia;
	private JSpinner spnSalarioEsperado;
	private JCheckBox chckbxEmpleado;
	private JCheckBox chckbxDisponibilidadDeViajar;
	private JCheckBox chckbxDisponibilidadDeMudanza;
	private JCheckBox chckbxIngles;
	private JCheckBox chckbxFrances;
	private JCheckBox chckbxJapones;
	private JCheckBox chckbxItaliano;
	private JCheckBox chckbxRuso;
	private JCheckBox chckbxMandarin;
	private JRadioButton rbUnivesitario;
	private JRadioButton rbTecnico;
	private JRadioButton rbObrero;
	private JPanel panel_universitario;
	private JPanel panel_tecnico;
	private JPanel panel_obrero;
	private JRadioButton rbMujer;
	private JRadioButton rbHombre;
	private JComboBox cbxCarrera;
	private JSpinner spnAniosDeExperiencia;
	private JComboBox cbxAreaTecnica;
	private DatePicker selectFechaNacimiento;

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
		setBounds(100, 100, 567, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel_personal = new JPanel();
		panel_personal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_personal.setBounds(10, 11, 529, 209);
		contentPanel.add(panel_personal);
		panel_personal.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 60, 64, 14);
		panel_personal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(84, 54, 150, 20);
		panel_personal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 23, 46, 14);
		panel_personal.add(lblCedula);
		
		ftxtCedula = new JFormattedTextField(Utilidades.getMascaraCedula());
		ftxtCedula.setBounds(84, 17, 150, 20);
		panel_personal.add(ftxtCedula);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(10, 171, 128, 14);
		panel_personal.add(lblFechaDeNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(259, 20, 64, 14);
		panel_personal.add(lblTelefono);
		
		ftxtTelefono = new JFormattedTextField(Utilidades.getMascaraTelefono());
		ftxtTelefono.setBounds(333, 17, 186, 20);
		panel_personal.add(ftxtTelefono);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(10, 97, 57, 14);
		panel_personal.add(lblProvincia);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(259, 94, 46, 14);
		panel_personal.add(lblGenero);
		
		selectFechaNacimiento = new DatePicker();
		selectFechaNacimiento.getComponentToggleCalendarButton().setSize(26, 20);
		selectFechaNacimiento.getComponentDateTextField().setSize(190, 20);
		selectFechaNacimiento.setDateToToday();
		selectFechaNacimiento.setBounds(138, 166, 200, 25);//get date ("uuuu-MM-dd")
		panel_personal.add(selectFechaNacimiento);
		
		
		rbHombre = new JRadioButton("Hombre");
		rbHombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbHombre.isSelected()) {
					rbMujer.setSelected(false);
				}
			}
		});
		rbHombre.setSelected(true);
		rbHombre.setBounds(333, 90, 82, 23);
		panel_personal.add(rbHombre);
		
		rbMujer = new JRadioButton("Mujer");
		rbMujer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbMujer.isSelected()) {
					rbHombre.setSelected(false);
				}
			}
		});
		rbMujer.setBounds(427, 90, 71, 23);
		panel_personal.add(rbMujer);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(259, 57, 64, 14);
		panel_personal.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(333, 54, 186, 20);
		panel_personal.add(txtApellido);
		
		cbxProvincia = new JComboBox();
		cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"", "Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Distrito Nacional", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Enriquillo", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Higuamo", "Independencia", "La Altagracia", "La Romana", "La Vega", "Mar\u00EDa Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Ozama", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Crist\u00F3bal", "San Jos\u00E9 de Ocoa", "San Juan", "San Pedro de Macor\u00EDs", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "S\u00E1nchez Ram\u00EDrez", "Valdesia", "Valverde", "Yuma"}));
		cbxProvincia.setBounds(84, 91, 150, 20);
		panel_personal.add(cbxProvincia);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 134, 57, 14);
		panel_personal.add(lblDireccion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(84, 131, 150, 20);
		panel_personal.add(textField);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(259, 134, 64, 14);
		panel_personal.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(333, 131, 186, 20);
		panel_personal.add(txtCorreo);
		{
			JPanel panel_tipo = new JPanel();
			panel_tipo.setLayout(null);
			panel_tipo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo de personal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_tipo.setBounds(10, 379, 529, 77);
			contentPanel.add(panel_tipo);
			
			rbUnivesitario = new JRadioButton("Univesitario");
			rbUnivesitario.setSelected(true);
			rbUnivesitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbUnivesitario.isSelected()) {
						rbObrero.setSelected(false);
						rbTecnico.setSelected(false);
						panel_tecnico.setVisible(false);
						panel_universitario.setVisible(true);
						panel_obrero.setVisible(false);;
					}
				}
			});
			rbUnivesitario.setBounds(50, 29, 109, 23);
			panel_tipo.add(rbUnivesitario);
			
			rbTecnico = new JRadioButton("Tecnico");
			rbTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbTecnico.isSelected()) {
						rbObrero.setSelected(false);
						rbUnivesitario.setSelected(false);
						panel_tecnico.setVisible(true);
						panel_universitario.setVisible(false);
						panel_obrero.setVisible(false);;
					}
				}
			});
			rbTecnico.setBounds(209, 29, 109, 23);
			panel_tipo.add(rbTecnico);
			
			rbObrero = new JRadioButton("Obrero");
			rbObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rbObrero.isSelected()) {
						rbTecnico.setSelected(false);
						rbUnivesitario.setSelected(false);
						panel_tecnico.setVisible(false);
						panel_universitario.setVisible(false);
						panel_obrero.setVisible(true);;
					}
				}
			});
			rbObrero.setBounds(368, 29, 109, 23);
			panel_tipo.add(rbObrero);
		}
		
		JPanel panel_empleado = new JPanel();
		panel_empleado.setLayout(null);
		panel_empleado.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_empleado.setBounds(10, 231, 529, 137);
		contentPanel.add(panel_empleado);
		
		JLabel lblSalarioEsperado = new JLabel("Salario Esperado:");
		lblSalarioEsperado.setBounds(10, 22, 100, 14);
		panel_empleado.add(lblSalarioEsperado);
		
		spnSalarioEsperado = new JSpinner();
		spnSalarioEsperado.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1000)));
		spnSalarioEsperado.setBounds(120, 19, 176, 20);
		panel_empleado.add(spnSalarioEsperado);
		
		JPanel panel_idiomas = new JPanel();
		panel_idiomas.setBorder(new TitledBorder(null, "Idiomas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_idiomas.setBounds(306, 11, 213, 115);
		panel_empleado.add(panel_idiomas);
		panel_idiomas.setLayout(null);
		
		chckbxIngles = new JCheckBox("Ingles");
		chckbxIngles.setBounds(9, 17, 93, 23);
		panel_idiomas.add(chckbxIngles);
		
		chckbxFrances = new JCheckBox("Frances");
		chckbxFrances.setBounds(111, 17, 93, 23);
		panel_idiomas.add(chckbxFrances);
		
		chckbxItaliano = new JCheckBox("Italiano");
		chckbxItaliano.setBounds(9, 51, 93, 23);
		panel_idiomas.add(chckbxItaliano);
		
		chckbxRuso = new JCheckBox("Ruso");
		chckbxRuso.setBounds(9, 85, 93, 23);
		panel_idiomas.add(chckbxRuso);
		
		chckbxJapones = new JCheckBox("Japones");
		chckbxJapones.setBounds(111, 51, 93, 23);
		panel_idiomas.add(chckbxJapones);
		
		chckbxMandarin = new JCheckBox("Mandarin");
		chckbxMandarin.setBounds(111, 85, 93, 23);
		panel_idiomas.add(chckbxMandarin);
		
		chckbxDisponibilidadDeMudanza = new JCheckBox("Disponibilidad de mudanza");
		chckbxDisponibilidadDeMudanza.setBounds(10, 103, 190, 23);
		panel_empleado.add(chckbxDisponibilidadDeMudanza);
		
		chckbxDisponibilidadDeViajar = new JCheckBox("Disponibilidad de viajar");
		chckbxDisponibilidadDeViajar.setBounds(10, 77, 190, 23);
		panel_empleado.add(chckbxDisponibilidadDeViajar);
		
		JLabel lblEstadoProfesional = new JLabel("Estado Profesional:");
		lblEstadoProfesional.setBounds(10, 55, 114, 14);
		panel_empleado.add(lblEstadoProfesional);
		
		chckbxEmpleado = new JCheckBox("Empleado");
		chckbxEmpleado.setBounds(145, 51, 113, 23);
		panel_empleado.add(chckbxEmpleado);
		
		panel_universitario = new JPanel();
		panel_universitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion Especifica", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_universitario.setBounds(10, 467, 529, 100);
		contentPanel.add(panel_universitario);
		panel_universitario.setLayout(null);
		
		JLabel lblCarreraUniversitaria = new JLabel("Carrera universitaria:");
		lblCarreraUniversitaria.setBounds(10, 40, 122, 14);
		panel_universitario.add(lblCarreraUniversitaria);
		
		cbxCarrera = new JComboBox();
		cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"", "Arquitectura", "Comercio Internacional", "Contabilidad", "Derecho", "Educaci\u00F3n F\u00EDsica", "Enfermer\u00EDa", "Filosof\u00EDa y Letras", "Finanzas", "Inform\u00E1tica", "Ingenier\u00EDa en alimentos", "Medicina", "Nutricionista", "Publicidad y Mercadeo"}));
		cbxCarrera.setBounds(156, 37, 171, 20);
		panel_universitario.add(cbxCarrera);
		
		panel_tecnico = new JPanel();
		panel_tecnico.setVisible(false);
		
		panel_obrero = new JPanel();
		panel_obrero.setVisible(false);
		panel_obrero.setBounds(10, 467, 529, 100);
		contentPanel.add(panel_obrero);
		panel_obrero.setLayout(null);
		panel_obrero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion Especifica", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblOficio = new JLabel("Oficio:");
		lblOficio.setBounds(10, 43, 83, 14);
		panel_obrero.add(lblOficio);
		
		JComboBox cbxOficios = new JComboBox();
		cbxOficios.setModel(new DefaultComboBoxModel(new String[] {"Agricultor", "Alba\u00F1il", "Animador", "Artesano", "Barbero", "Barrendero", "Cajero", "Carnicero", "Carpintero", "Carpintero", "Cerrajero", "Cocinero", "Deshollinador", "Editor", "Escritor", "Escultor", "Exterminador", "Frutero", "Impresor", "Lavandero", "Lechero", "Le\u00F1ador", "Locutor", "Mec\u00E1nico", "Panadero", "Pastor ganadero", "Peletero", "Peluquero", "Pescador", "Pintor de brocha gorda", "Plomero", "Polic\u00EDa", "Repartidor", "Sastre", "Soldador", "Tornero", "Vendedor", "Vigilante"}));
		cbxOficios.setBounds(66, 40, 165, 20);
		panel_obrero.add(cbxOficios);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(241, 23, 89, 23);
		panel_obrero.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(241, 57, 89, 23);
		panel_obrero.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(340, 11, 179, 78);
		panel_obrero.add(scrollPane);
		panel_tecnico.setLayout(null);
		panel_tecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion Especifica", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_tecnico.setBounds(10, 467, 529, 100);
		contentPanel.add(panel_tecnico);
		
		JLabel lblAreaTecnica = new JLabel("Area Tecnica:");
		lblAreaTecnica.setBounds(10, 24, 83, 14);
		panel_tecnico.add(lblAreaTecnica);
		
		cbxAreaTecnica = new JComboBox();
		cbxAreaTecnica.setModel(new DefaultComboBoxModel(new String[] {"", "Arquitectura", "Comercio Internacional", "Contabilidad", "Derecho", "Educaci\u00F3n F\u00EDsica", "Enfermer\u00EDa", "Filosof\u00EDa y Letras", "Finanzas", "Inform\u00E1tica", "Ingenier\u00EDa en alimentos", "Medicina", "Nutricionista", "Publicidad y Mercadeo"}));
		cbxAreaTecnica.setBounds(142, 21, 150, 20);
		panel_tecnico.add(cbxAreaTecnica);
		
		JLabel lblAosDeExperiencia = new JLabel("A\u00F1os de Experiencia:");
		lblAosDeExperiencia.setBounds(10, 62, 122, 14);
		panel_tecnico.add(lblAosDeExperiencia);
		
		spnAniosDeExperiencia = new JSpinner();
		spnAniosDeExperiencia.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spnAniosDeExperiencia.setBounds(142, 59, 150, 20);
		panel_tecnico.add(spnAniosDeExperiencia);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						registrar();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton btnCancel = new JButton("Cancelar");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
	
	
	private void registrar(){
		boolean hecho = false; 
		if(!(ftxtCedula.getText().replaceAll("-", "").equalsIgnoreCase("___________"))&&!(ftxtCedula.getText().replaceAll("_", "").equalsIgnoreCase("---"))) {
			if(!(txtApellido.getText().equalsIgnoreCase(""))&&!(txtCorreo.getText().equalsIgnoreCase(""))&&!(txtNombre.getText().equalsIgnoreCase(""))&&!(cbxProvincia.getSelectedItem().toString().equalsIgnoreCase(""))) {
				char genero = genero();
				boolean estadoProfesional=EstadoProfesionalActual();
				boolean disponibilidadViaje=disponibilidadDeViajar();
				boolean disponibilidadMudanza=disponibilidadDeMundanza();
				ZoneId defaultZoneId = ZoneId.systemDefault();
				Date fecha = Date.from(selectFechaNacimiento.getDate().atStartOfDay(defaultZoneId).toInstant());
				if (rbUnivesitario.isSelected()&&!(cbxCarrera.getSelectedItem().toString().equalsIgnoreCase(""))) {
					Universitario universitario= new Universitario(ftxtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), fecha, ftxtTelefono.getText(), cbxProvincia.getSelectedItem().toString(), Float.valueOf(spnSalarioEsperado.getValue().toString()), genero, estadoProfesional, disponibilidadViaje, disponibilidadMudanza, idiomas(), cbxCarrera.getSelectedItem().toString());
					Administracion.getInstance().insertarPersona(universitario);
					hecho=true;
					System.out.println("exito");
				}
				else if (rbTecnico.isSelected()&&!(cbxAreaTecnica.getSelectedItem().toString().equalsIgnoreCase(""))) {
					Tecnico tecnico= new Tecnico(ftxtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), fecha, ftxtTelefono.getText(), cbxProvincia.getSelectedItem().toString(), Float.valueOf(spnSalarioEsperado.getValue().toString()), genero, estadoProfesional, disponibilidadViaje, disponibilidadMudanza, idiomas(), cbxAreaTecnica.getSelectedItem().toString(), Integer.valueOf(spnAniosDeExperiencia.getValue().toString()));
					Administracion.getInstance().insertarPersona(tecnico);
					hecho=true;
				} 
				else if (rbObrero.isSelected()) {
					
				}
				else {
					
				}
			}
			else {
				
			}
		}
		else {
			
		}
		if (hecho) {
			JOptionPane.showMessageDialog(null,"Trabajador registrado exitosamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	private char genero() {
		return rbMujer.isSelected() ? 'm' : 'h';	
	}
	
	private boolean EstadoProfesionalActual() {
		return chckbxEmpleado.isSelected() ? true : false;
	}
	
	private boolean disponibilidadDeViajar() {
		return chckbxDisponibilidadDeViajar.isSelected() ? true : false;
	}
	
	private boolean disponibilidadDeMundanza() {
		return chckbxDisponibilidadDeMudanza.isSelected() ? true : false;
	}
	
	private ArrayList<String> idiomas() {
		ArrayList<String> misIdiomas = new ArrayList<String>();
		if(chckbxIngles.isSelected()) {
			 misIdiomas.add("Ingles");
		}
		if(chckbxFrances.isSelected()) {
			 misIdiomas.add("Frances");
		}
		if(chckbxRuso.isSelected()) {
			 misIdiomas.add("Ruso");
		}
		if(chckbxItaliano.isSelected()) {
			 misIdiomas.add("Italiano");
		}
		if(chckbxJapones.isSelected()) {
			 misIdiomas.add("Japones");
		}
		if(chckbxMandarin.isSelected()) {
			 misIdiomas.add("Mandarin");
		}
		return misIdiomas;
	}
}
