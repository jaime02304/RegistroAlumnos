package edu.CursoRegistro.Servicios;

import java.util.Scanner;

/**
 * Interfaz en relacion al menu, donde se encuentra la cabecera de los metodos
 */
public interface MenuInterfaz {
	/**
	 * Metodo de mostrar el menu y recoger la opcion del menu
	 * @author jpribio - 19/09/24
	 * @param sc
	 * @return
	 */
	public byte mostrarMenu(Scanner sc);

	/**
	 * Metodo de mostrar el menu y recoger la opcion del menu para editar o eliminar el estudiante
	 * @author jpribio - 19/09/24
	 * @param sc
	 * @return
	 */
	public byte mostrarMenuEditarYEliminar(Scanner sc);
}
