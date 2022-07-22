package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Persona {
	private ArrayList<String> oficio;

	public Obrero(String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono, String ciudad,
			float salarioEsperado, char genero, boolean estadoProfesional, ArrayList<String> idiomas,
			ArrayList<String> oficio) {
		super(cedula, nombre, apellido, fechaNacimiento, telefono, ciudad, salarioEsperado, genero, estadoProfesional,
				idiomas);
		this.oficio = oficio;
	}

	public ArrayList<String> getOficio() {
		return oficio;
	}
	
	
}
