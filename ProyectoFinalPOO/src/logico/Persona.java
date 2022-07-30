package logico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6357698275386607916L;
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected Date fechaNacimiento;
	protected String telefono;
	protected String provincia;
	protected float salarioEsperado;
	protected char genero;
	protected boolean estadoProfesional;
	protected boolean disponibilidadViaje;
	protected boolean disponibilidadMudanza;
	protected ArrayList<String> idiomas;
	protected ArrayList<SolicitudPersona> misSolicitudes;
	


	public Persona(String cedula, String nombre, String apellido, String correo, Date fechaNacimiento, String telefono,
			String provincia, float salarioEsperado, char genero, boolean estadoProfesional, boolean disponibilidadViaje,
			boolean disponibilidadMudanza, ArrayList<String> idiomas) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.provincia = provincia;
		this.salarioEsperado = salarioEsperado;
		this.genero = genero;
		this.estadoProfesional = estadoProfesional;
		this.disponibilidadViaje = disponibilidadViaje;
		this.disponibilidadMudanza = disponibilidadMudanza;
		this.idiomas = idiomas;
		this.misSolicitudes = new ArrayList<SolicitudPersona>();
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public float getSalarioEsperado() {
		return salarioEsperado;
	}

	public void setSalarioEsperado(float salarioEsperado) {
		this.salarioEsperado = salarioEsperado;
	}

	public boolean isEstadoProfesional() {
		return estadoProfesional;
	}

	public void setEstadoProfesional(boolean estadoProfesional) {
		this.estadoProfesional = estadoProfesional;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public char getGenero() {
		return genero;
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public ArrayList<SolicitudPersona> getMisSolicitudes() {
		return misSolicitudes;
	}

	public String getCorreo() {
		return correo;
	}

	public boolean isDisponibilidadViaje() {
		return disponibilidadViaje;
	}

	public boolean isDisponibilidadMudanza() {
		return disponibilidadMudanza;
	}
	
	public int edad() {
		 Calendar naci = Calendar.getInstance();
		 Calendar actual = Calendar.getInstance();
		 int edad=0;
		 naci.setTime(fechaNacimiento);
		 edad = actual.get(1)-naci.get(1);
		 return edad;
	}
	
}
