package logico;

import java.util.ArrayList;

public class Administracion {
	private ArrayList<Persona> misPersonas;
	private ArrayList<Empresa> misEmpresas;
	private ArrayList<SolicitudEmpresa> misSolicitudCompanias;
	private ArrayList<SolicitudPersona> misSolicitudPersonas;
	public static Administracion administracion = null;
	
	private Administracion() {
		super();
		this.misPersonas = new ArrayList<Persona>();
		this.misEmpresas = new ArrayList<Empresa>();
		this.misSolicitudCompanias = new ArrayList<SolicitudEmpresa>();
		this.misSolicitudPersonas = new ArrayList<SolicitudPersona>();
	}
	
	public static Administracion getInstance() {
		if(administracion == null) {
			administracion = new Administracion();
		}
		return administracion;
	}
	
	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}
	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}
	public ArrayList<Empresa> getMisEmpresas() {
		return misEmpresas;
	}
	public void setMisEmpresas(ArrayList<Empresa> misEmpresas) {
		this.misEmpresas = misEmpresas;
	}
	public ArrayList<SolicitudEmpresa> getMisSolicitudCompanias() {
		return misSolicitudCompanias;
	}
	public void setMisSolicitudCompanias(ArrayList<SolicitudEmpresa> misSolicitudCompanias) {
		this.misSolicitudCompanias = misSolicitudCompanias;
	}
	public ArrayList<SolicitudPersona> getMisSolicitudPersonas() {
		return misSolicitudPersonas;
	}
	public void setMisSolicitudPersonas(ArrayList<SolicitudPersona> misSolicitudPersonas) {
		this.misSolicitudPersonas = misSolicitudPersonas;
	}
}
