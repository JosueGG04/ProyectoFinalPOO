package logico;

import java.io.Serializable;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl;

public class Empresa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7025053391394293331L;
	private String RNC;
	private String nombre;
	private String director; 
	private String telefono;
	private String correo;
	private String telDirector;
	private String correoDirector;
	private ArrayList<SolicitudEmpresa> misSolicitudes;
	
	public Empresa(String RNC, String nombre, String director, String telefono, String correo, String telDirector, String correoDirector) {
		super();
		this.RNC = RNC;
		this.nombre = nombre;
		this.director = director;
		this.telefono = telefono;
		this.correo = correo;
		this.telDirector = telDirector;
		this.correoDirector = correoDirector;
		this.misSolicitudes = new ArrayList<SolicitudEmpresa>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelDirector() {
		return telDirector;
	}

	public void setTelDirector(String telDirector) {
		this.telDirector = telDirector;
	}

	public String getCorreoDirector() {
		return correoDirector;
	}

	public void setCorreoDirector(String correoDirector) {
		this.correoDirector = correoDirector;
	}


	public ArrayList<SolicitudEmpresa> getMisSolicitudes() {
		return misSolicitudes;
	}

	public void setMisSolicitudes(ArrayList<SolicitudEmpresa> misSolicitudes) {
		this.misSolicitudes = misSolicitudes;
	}

	public String getRNC() {
		return RNC;
	}
	
	
}
