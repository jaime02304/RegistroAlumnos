package edu.CursoRegistro.Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.CursoRegistro.Dtos.EstudianteDtos;
import edu.CursoRegistro.OperativaEstudiantes.OperativaImplementacion;
import edu.CursoRegistro.OperativaEstudiantes.OperativaInterfaz;
import edu.CursoRegistro.Servicios.MenuImplementacion;
import edu.CursoRegistro.Servicios.MenuInterfaz;

/**
 * Se trata de la clase de inicio de la app donde esta los controladores
 * @author jpribio-19/9/2024
 */
public class InicioApp {
	public static List<EstudianteDtos> listaEstudiantesDtos = new ArrayList<EstudianteDtos>();
	/**
	 * Trata del metodo principal donde se encuentra todo el procedimiento de la
	 * pagina
	 * @author jpribio-19/9/2024
	 * @param args
	 */
	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op = new OperativaImplementacion();
		Scanner sc = new Scanner(System.in);
		boolean cerrarMenu = false;
		byte opcionMenu;
		try {
			do {
				opcionMenu = mi.mostrarMenu(sc);
				switch (opcionMenu) {
				case 0:
					cerrarMenu = true;
					System.out.println("La aplicacion se ha cerrado, que tenga un buen dia");
					break;
				case 1:
					op.añadirEstudiantes(sc);
					for(EstudianteDtos estudiantes : listaEstudiantesDtos) {
						System.out.println(estudiantes.getNombreEstudiante()+","+estudiantes.getApellidosEstudiante()+","+estudiantes.getFechaNacimientoDate());
					}
					break;
				case 2:
					op.modificarEstudiante(sc);
					for(EstudianteDtos estudiantes : listaEstudiantesDtos) {
						System.out.println(estudiantes.getNombreEstudiante()+","+estudiantes.getApellidosEstudiante()+","+estudiantes.getFechaNacimientoDate());
					}
					break;
				case 3:
					break;
				default:
					System.out.println(
							"No has elegido ninguna opcion correcta, por favor elija una opcion que sea valida.");
				}
			} while (!cerrarMenu);
		} catch (Exception e) {
			System.out.println();
		}

	}

}
