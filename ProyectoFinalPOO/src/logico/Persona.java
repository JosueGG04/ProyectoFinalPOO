package logico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Persona implements Serializable{
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected Date fechaNacimiento;
	protected String telefono;
	protected String ciudad;
	protected float salarioEsperado;
	protected char genero;
	protected boolean estadoProfesional;
	protected ArrayList<String> idiomas;
	protected ArrayList<SolicitudPersona> misSolicitudes;
	
	public Persona(String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String ciudad,
			float salarioEsperado, char genero, boolean estadoProfesional, ArrayList<String> idiomas){
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.ciudad = ciudad;
		this.salarioEsperado = salarioEsperado;
		this.genero = genero;
		this.estadoProfesional = estadoProfesional;
		this.idiomas = idiomas;
		this.misSolicitudes = new ArrayList<SolicitudPersona>();
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
	
	
	
	
}
