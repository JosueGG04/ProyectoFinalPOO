package logico;

import java.util.ArrayList;
import java.util.Date;

public class Universitario extends Persona {
	private String carrera;

	public Universitario(String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono,
			String ciudad, float salarioEsperado, char genero, boolean estadoProfesional, ArrayList<String> idiomas,
			String carrera) {
		super(cedula, nombre, apellido, fechaNacimiento, telefono, ciudad, salarioEsperado, genero, estadoProfesional,
				idiomas);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}
	
}
