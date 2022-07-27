package logico;

import java.util.ArrayList;
import java.util.Date;

public class Universitario extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String carrera;



	public Universitario(String cedula, String nombre, String apellido, String correo, Date fechaNacimiento,
			String telefono, String ciudad, float salarioEsperado, char genero, boolean estadoProfesional,
			boolean disponibilidadViaje, boolean disponibilidadMudanza, ArrayList<String> idiomas, String carrera) {
		super(cedula, nombre, apellido, correo, fechaNacimiento, telefono, ciudad, salarioEsperado, genero,
				estadoProfesional, disponibilidadViaje, disponibilidadMudanza, idiomas);
		this.carrera = carrera;
	}



	public String getCarrera() {
		return carrera;
	}
	
}
