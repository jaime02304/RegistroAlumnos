package edu.CursoRegistro.Dtos;

import java.time.LocalDate;

/**
 * Clase donde se encuentra los dtos
 * @author jpribio - 19/9/24
 */
public class EstudianteDtos {
	int id;
	String  nombreEstudiante = "aaaaa";
	String apellidosEstudiante = "aaaaa";
	String dNIEstudiante = "aaaaa";
	long numeroTelefonoestudiante = 0;
	LocalDate fechaNacimientoDate;
	
	//getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public String getApellidosEstudiante() {
		return apellidosEstudiante;
	}
	public void setApellidosEstudiante(String apellidosEstudiante) {
		this.apellidosEstudiante = apellidosEstudiante;
	}
	public String getdNIEstudiante() {
		return dNIEstudiante;
	}
	public void setdNIEstudiante(String dNIEstudiante) {
		this.dNIEstudiante = dNIEstudiante;
	}
	public long getNumeroTelefonoestudiante() {
		return numeroTelefonoestudiante;
	}
	public void setNumeroTelefonoestudiante(long numeroTelefonoestudiante) {
		this.numeroTelefonoestudiante = numeroTelefonoestudiante;
	}	
	public LocalDate getFechaNacimientoDate() {
		return fechaNacimientoDate;
	}
	public void setFechaNacimientoDate(LocalDate fechaNacimientoDate) {
		this.fechaNacimientoDate = fechaNacimientoDate;
	}
	//Constructor
	public EstudianteDtos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstudianteDtos(int id, String nombreEstudiante, String apellidosEstudiante, String dNIEstudiante,
			long numeroTelefonoestudiante, LocalDate fechaNacimientoDate) {
		super();
		this.id = id;
		this.nombreEstudiante = nombreEstudiante;
		this.apellidosEstudiante = apellidosEstudiante;
		this.dNIEstudiante = dNIEstudiante;
		this.numeroTelefonoestudiante = numeroTelefonoestudiante;
		this.fechaNacimientoDate = fechaNacimientoDate;
	}
	
	
}
