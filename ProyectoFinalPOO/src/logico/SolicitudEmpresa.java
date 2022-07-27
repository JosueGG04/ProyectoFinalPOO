package logico;

import java.io.Serializable;
import java.util.ArrayList;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class SolicitudEmpresa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4898251650035678305L;
	private String idSolicitud;
	private String tipo;//innecesario
	private int cantEmpleadosSolicitados;
	private ArrayList<Persona> personasContratadas;
	private int edadMinima;
	private String localizacionSugerida; //¿Necesario?
	private float salarioMaximo;
	private ArrayList<String> idiomas;
	private String carrera;
	private String oficio;
	private String areaTecnica;
	private int anyosProfesion;
	
	public SolicitudEmpresa(String idSolicitud, String tipo, int cantEmpleadosSolicitados, int edadMinima
			, float salarioMaximo, String carrera, String oficio, String areaTecnica,
			int anyosProfesion) {
		super();
		this.idSolicitud = idSolicitud;
		this.tipo = tipo;
		this.cantEmpleadosSolicitados = cantEmpleadosSolicitados;
		this.edadMinima = edadMinima;
		this.salarioMaximo = salarioMaximo;
		this.carrera = carrera;
		this.oficio = oficio;
		this.areaTecnica = areaTecnica;
		this.anyosProfesion = anyosProfesion;
		this.personasContratadas = new ArrayList<Persona>();
		this.idiomas =  new ArrayList<String>();
	}

	public String getTipo() { 
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantEmpleadosSolicitados() {
		return cantEmpleadosSolicitados;
	}

	public void setCantEmpleadosSolicitados(int cantEmpleadosSolicitados) {
		this.cantEmpleadosSolicitados = cantEmpleadosSolicitados;
	}

	public ArrayList<Persona> getPersonasContratadas() {
		return personasContratadas;
	}

	public void setPersonasContratadas(ArrayList<Persona> personasContratadas) {
		this.personasContratadas = personasContratadas;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getLocalizacionSugerida() {
		return localizacionSugerida;
	}

	public void setLocalizacionSugerida(String localizacionSugerida) {
		this.localizacionSugerida = localizacionSugerida;
	}

	public float getSalarioMaximo() {
		return salarioMaximo;
	}

	public void setSalarioMaximo(float salarioMaximo) {
		this.salarioMaximo = salarioMaximo;
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String getAreaTecnica() {
		return areaTecnica;
	}

	public void setAreaTecnica(String areaTecnica) {
		this.areaTecnica = areaTecnica;
	}

	public int getAnyosProfesion() {
		return anyosProfesion;
	}

	public void setAnyosProfesion(int anyosProfesion) {
		this.anyosProfesion = anyosProfesion;
	}

	public String getIdSolicitud() {
		return idSolicitud;
	}
	
	int cantPersonasActual() {
		return personasContratadas.size();
	}
}
