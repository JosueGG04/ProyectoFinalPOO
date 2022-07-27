package logico;

import java.io.Serializable;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;

public class Empresa implements Serializable{
	private String idEmpresa;
	private String nombre;
	private String director; 
	private String telefono;
	private ArrayList<SolicitudEmpresa> misSolicitudes;
	
	public Empresa(String idEmpresa, String nombre, String director, String telefono) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.director = director;
		this.telefono = telefono;
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

	public ArrayList<SolicitudEmpresa> getMisSolicitudes() {
		return misSolicitudes;
	}

	public void setMisSolicitudes(ArrayList<SolicitudEmpresa> misSolicitudes) {
		this.misSolicitudes = misSolicitudes;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}
	
	
}
