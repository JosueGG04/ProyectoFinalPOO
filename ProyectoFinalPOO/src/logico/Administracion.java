package logico;

import java.util.ArrayList;

public class Administracion {
	private ArrayList<Persona> misPersonas;
	private ArrayList<Empresa> misEmpresas;
	private ArrayList<SolicitudEmpresa> misSolicitudCompanias;
	private ArrayList<SolicitudPersona> misSolicitudPersonas;
	public static int generadorSolicitudPersona = 1;
	public static int generadorSolicitudEmpresa = 1;
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
	
	public void insertarPersona(Persona persona) {
		misPersonas.add(persona);
	}
	
	public void insertarEmpresa(Empresa empresa) {
		misEmpresas.add(empresa);
	}
	
	public void insertarSolicitudEmpresa(SolicitudEmpresa solicitudEmpresa) {
		misSolicitudCompanias.add(solicitudEmpresa);
		generadorSolicitudEmpresa++;
	}
	
	public void insertarSolicitudPersona(SolicitudPersona solicitudPersona) {
		misSolicitudPersonas.add(solicitudPersona);
		generadorSolicitudPersona++;
	}
	
	public Persona buscarPersonaPorCedula(String cedula) {
		Persona aux =null;
		int i=0;
		boolean encontrado = false;
		while (i<misPersonas.size()&& !(encontrado)) {
			if (misPersonas.get(i).getCedula().equalsIgnoreCase(cedula)) {
				aux=misPersonas.get(i);
				encontrado=true;
			}
		}
		
		return aux;
	}
	
	public Empresa buscarEmpresaPorRNC(String RNC) {
		Empresa aux = null;
		int i=0;
		boolean encontrado = false;
		while (i<misEmpresas.size()&& !(encontrado)) {
			if (misEmpresas.get(i).getRNC().equalsIgnoreCase(RNC)) {
				aux=misEmpresas.get(i);
				encontrado=true;
			}
		}
		
		return aux;
	}
	
	public ArrayList<Persona> Algoritmo(SolicitudEmpresa solicitud) {
		int cantidadDeRequisitos=solicitud.cantidadDeRequisitos();
		boolean[] ListaDeRequisitos=solicitud.requisitosDeLaSolicitud();
		//0 edadMinima
		//1 localizacionSugerida
		//2 salarioMaximo
		//3 idiomas
		//4 DisponibilidadViajar
		//5 DisponibilidadMudanza
		//6 anyosProfesion
		ArrayList<Persona> candidatos = new ArrayList<Persona>();
		
		for (Persona personal : misPersonas) {
			float coincidencias=0;
			boolean entrar=false;
			String tipoPersona=stringTipo(personal);
			if (solicitud.getTipo().equalsIgnoreCase(tipoPersona)) {				
				if (tipoPersona.equalsIgnoreCase("Universitario")) {
					Universitario universitario= (Universitario) personal;
					if (solicitud.getCarrera().equalsIgnoreCase(universitario.getCarrera())) {
						entrar=true;
					}
				}				
				if (tipoPersona.equalsIgnoreCase("Obrero")) {
					Obrero obrero = (Obrero) personal;
					if (buscarOficio(obrero.getOficios(),solicitud.getOficio())) {
						entrar=true;
					}
				}
				if (tipoPersona.equalsIgnoreCase("Tecnico")) {
					Tecnico tecnico = (Tecnico) personal;
					if (solicitud.getAreaTecnica().equalsIgnoreCase(tecnico.getAreaTecnica())&&ListaDeRequisitos[6]) {
						entrar=true;
					}
				}
			}
			if (entrar) {
				if (solicitud.getEdadMinima()<=personal.edad()&&ListaDeRequisitos[0]) {
					coincidencias++;
				}
				if (solicitud.getLocalizacionSugerida().equalsIgnoreCase(personal.getProvincia())&&ListaDeRequisitos[1]) {
					coincidencias++;
				}
				if (solicitud.getSalarioMaximo()>=personal.getSalarioEsperado()&&ListaDeRequisitos[2]) {
					coincidencias++;
				}
				if (ListaDeRequisitos[3]) {
					coincidencias+=compararArraysDeIdiomas(solicitud.getIdiomas(),personal.getIdiomas());
				}
				if (personal.isDisponibilidadMudanza()&&ListaDeRequisitos[4]) {
					coincidencias++;
				}
				if (personal.isDisponibilidadViaje()&&ListaDeRequisitos[5]) {
					coincidencias++;
				}
				if (tipoPersona.equalsIgnoreCase("Tecnico")) {
					Tecnico tecnico = (Tecnico) personal;
					if (solicitud.getAnyosProfesion()<=tecnico.getAnyosProfesion()&&ListaDeRequisitos[6]) {
						coincidencias++;
					}
				}
			}
			if(entrar&&(coincidencias/cantidadDeRequisitos)>=solicitud.getPorcentajeDeEmparejamiento()) {
				candidatos.add(personal);
			}
		}
		
		return candidatos;
	}
	
	private boolean buscarOficio(ArrayList<String> oficios, String oficio) {
		boolean encontrado=false;
		for (String oficioPersonal : oficios) {
			if (oficio.equalsIgnoreCase(oficioPersonal)) {
				encontrado=true;
			}
		}
		return encontrado;
	}

	private String stringTipo(Persona persona) {
		String tipoPersona="";
		if (persona instanceof Obrero) {
			tipoPersona="Obrero";
		}
		if (persona instanceof Universitario) {
			tipoPersona="Universitario";
		}
		if (persona instanceof Tecnico) {
			tipoPersona="Tecnico";
		}
		return tipoPersona;
	}
	
	private float compararArraysDeIdiomas(ArrayList<String> idiomasSolicitud, ArrayList<String> idiomasPersona) {
		float coincidencias=0;
		for (String idiomaSolicitud : idiomasSolicitud) {
			int i=0;
			boolean encontrado=false;
			while (i>idiomasPersona.size()&&!(encontrado)) {
				if(idiomaSolicitud.equalsIgnoreCase(idiomasPersona.get(i))){
					coincidencias++;
					encontrado=true;
				}
				
			}
		}
		return coincidencias/idiomasSolicitud.size();
	}
	
	
	
}
