package logico;

import java.util.ArrayList;
import java.util.Date;

public class Tecnico extends Persona {
	private String areaTecnica;
	private int anyosProfesion;
	
	public Tecnico(String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String ciudad,
			float salarioEsperado, char genero, boolean estadoProfesional, ArrayList<String> idiomas,
			String areaTecnica, int anyosProfesion) {
		super(cedula, nombre, apellido, fechaNacimiento, telefono, ciudad, salarioEsperado, genero, estadoProfesional,
				idiomas);
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
