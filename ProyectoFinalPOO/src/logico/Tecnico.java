package logico;

import java.util.ArrayList;
import java.util.Date;

public class Tecnico extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String areaTecnica;
	private int anyosProfesion;
	
	public Tecnico(String cedula, String nombre, String apellido, String correo, Date fechaNacimiento, String telefono,
			String ciudad, float salarioEsperado, char genero, boolean estadoProfesional, boolean disponibilidadViaje,
			boolean disponibilidadMudanza, ArrayList<String> idiomas, String areaTecnica, int anyosProfesion) {
		super(cedula, nombre, apellido, correo, fechaNacimiento, telefono, ciudad, salarioEsperado, genero,
				estadoProfesional, disponibilidadViaje, disponibilidadMudanza, idiomas);
		this.areaTecnica = areaTecnica;
		this.anyosProfesion = anyosProfesion;
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
	
	
	
}
