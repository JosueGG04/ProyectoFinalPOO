package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<String> oficio;

	public Obrero(String cedula, String nombre, String apellido, String correo, Date fechaNacimiento, String telefono,
			String ciudad, float salarioEsperado, char genero, boolean estadoProfesional, boolean disponibilidadViaje,
			boolean disponibilidadMudanza, ArrayList<String> idiomas, ArrayList<String> oficio) {
		super(cedula, nombre, apellido, correo, fechaNacimiento, telefono, ciudad, salarioEsperado, genero,
				estadoProfesional, disponibilidadViaje, disponibilidadMudanza, idiomas);
		this.oficio = oficio;
	}

	public ArrayList<String> getOficio() {
		return oficio;
	}
	
	
}
