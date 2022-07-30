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
	private String titulo;
	private String tipo;
	private int cantEmpleadosSolicitados;
	private ArrayList<Persona> personasContratadas;
	private int porcentajeDeEmparejamiento;
	
	private int edadMinima;//1
	private String localizacionSugerida;//2
	private float salarioMaximo;//3
	private ArrayList<String> idiomas;//4
	private boolean DisponibilidadViajar;//5
	private boolean DisponibilidadMudanza;//6
	
	private String carrera;//requisito
	
	private String oficio;//requisito
	
	private String areaTecnica;//requisito
	private int anyosProfesion;//7
	




	public SolicitudEmpresa(String idSolicitud, String titulo, String tipo, int cantEmpleadosSolicitados,
			int edadMinima, String localizacionSugerida, float salarioMaximo, ArrayList<String> idiomas,
			int porcentajeDeEmparejamiento, boolean disponibilidadViajar, boolean disponibilidadMudanza, String carrera,
			String oficio, String areaTecnica, int anyosProfesion) {
		super();
		this.idSolicitud = idSolicitud;
		this.titulo = titulo;
		this.tipo = tipo;
		this.cantEmpleadosSolicitados = cantEmpleadosSolicitados;
		this.edadMinima = edadMinima;
		this.localizacionSugerida = localizacionSugerida;
		this.salarioMaximo = salarioMaximo;
		this.idiomas = idiomas;
		this.personasContratadas = new ArrayList<Persona>();
		this.porcentajeDeEmparejamiento = porcentajeDeEmparejamiento;
		DisponibilidadViajar = disponibilidadViajar;
		DisponibilidadMudanza = disponibilidadMudanza;
		this.carrera = carrera;
		this.oficio = oficio;
		this.areaTecnica = areaTecnica;
		this.anyosProfesion = anyosProfesion;
	}

	public String getIdSolicitud() {
		return idSolicitud;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCantEmpleadosSolicitados() {
		return cantEmpleadosSolicitados;
	}

	public ArrayList<Persona> getPersonasContratadas() {
		return personasContratadas;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public String getLocalizacionSugerida() {
		return localizacionSugerida;
	}

	public float getSalarioMaximo() {
		return salarioMaximo;
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public int getPorcentajeDeEmparejamiento() {
		return porcentajeDeEmparejamiento;
	}

	public String getCarrera() {
		return carrera;
	}

	public String getOficio() {
		return oficio;
	}

	public String getAreaTecnica() {
		return areaTecnica;
	}

	public int getAnyosProfesion() {
		return anyosProfesion;
	}

	public boolean isDisponibilidadViajar() {
		return DisponibilidadViajar;
	}

	public boolean isDisponibilidadMudanza() {
		return DisponibilidadMudanza;
	}



	public	int cantidadDeRequisitos() {
		int cant=0;
		if (edadMinima!=0) {
			cant++;
		}
		if (!(localizacionSugerida).equalsIgnoreCase("")) {
			cant++;
		}
		if (salarioMaximo!=0) {
			cant++;
		}
		if (idiomas.size()!=0) {
			cant++;
		}
		if (DisponibilidadMudanza) {
			cant++;
		}
		if (DisponibilidadViajar) {
			cant++;
		}
		
		if (anyosProfesion!=0) {
			cant++;
		}
		return cant;
	}
	
	public boolean[] requisitosDeLaSolicitud() {
		boolean requisitos[]  = new boolean[7];
		if (edadMinima!=0) {
			requisitos[0]=true;
		}
		if (!(localizacionSugerida).equalsIgnoreCase("")) {
			requisitos[1]=true;
		}
		if (salarioMaximo!=0) {
			requisitos[2]=true;
		}
		if (idiomas.size()!=0) {
			requisitos[3]=true;
		}
		if (DisponibilidadMudanza) {
			requisitos[4]=true;
		}
		if (DisponibilidadViajar) {
			requisitos[5]=true;
		}
		
		if (anyosProfesion!=0) {
			requisitos[6]=true;
		}

		return requisitos;
	}

}
