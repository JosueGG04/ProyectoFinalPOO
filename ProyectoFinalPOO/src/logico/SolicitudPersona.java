package logico;

import java.io.Serializable;

public class SolicitudPersona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2348235660897647670L;
	private String idSolicitud;
	private String cedula;
	private String trabajo;
	private boolean estado;
	public SolicitudPersona(String idSolicitud, String cedula, String trabajo, boolean estado) {
		super();
		this.idSolicitud = idSolicitud;
		this.cedula = cedula;
		this.trabajo = trabajo;
		this.estado = estado;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getIdSolicitud() {
		return idSolicitud;
	}
	public String getCedula() {
		return cedula;
	}
	public String getTrabajo() {
		return trabajo;
	}
	
	
	
}
