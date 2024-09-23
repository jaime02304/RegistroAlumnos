package edu.CursoRegistro.Servicios;

import java.util.Scanner;

/**
 * Implementacion que implementa a la interfaz del menu
 */
public class MenuImplementacion implements MenuInterfaz {

	public byte mostrarMenu(Scanner sc) {
 
		byte opcion;
		System.out.println("---------------------------------");
		System.out.println("| Opcion 0. Cerrar menu |");
		System.out.println("| Opcion 1. Añadir estudiante |");
		System.out.println("| Opcion 2. Eliminar estudiante |");
		System.out.println("| Opcion 3. Modificar estudiante |");
		System.out.println("| ¿Qué opcion quieres elegir? |");
		System.out.println("-----------------------------------");
		opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public byte mostrarMenuEditarYEliminar(Scanner sc) {
		byte opcion;
		System.out.println("---------------------------------");
		System.out.println("| Opcion 0. Volver |");
		System.out.println("| Opcion 1. DNI |");
		System.out.println("| Opcion 2. Nombre |");
		System.out.println("| Opcion 3. Apellidos |");
		System.out.println("| Opcion 4. Fecha de nacimiento |");
		System.out.println("| Opcion 5. Telefono |");
		System.out.println("| ¿Qué opcion quieres elegir? |");
		System.out.println("-----------------------------------");
		opcion = sc.nextByte();
		return opcion;
	}

}
