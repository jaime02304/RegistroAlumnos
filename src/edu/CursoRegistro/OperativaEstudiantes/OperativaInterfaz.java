package edu.CursoRegistro.OperativaEstudiantes;

import java.util.Scanner;

/**
 * interfaz donde se encuentra la cabecera de los metodos en relacion con la operativa de estudiantes
 * @author jpribio - 19/9/24
 */
public interface OperativaInterfaz {

	/**
	 * Metodo que añade estudiantes al registro
	 * @author jpribio - 19/9/24
	 * @param sc
	 */
	public void añadirEstudiantes(Scanner sc);
	
	/**
	 * Metodo que modifica algun elemento segun por el DNI
	 * @author jpribio - 19/09/24
	 */
	public void modificarEstudiante(Scanner sc);
	
	
}
