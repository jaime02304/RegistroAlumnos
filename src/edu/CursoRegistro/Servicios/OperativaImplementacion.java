package edu.CursoRegistro.Servicios;

import edu.CursoRegistro.Controladores.*;
import edu.CursoRegistro.Dtos.EstudianteDtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 
 */
public class OperativaImplementacion implements OperativaInterfaz{
	MenuImplementacion mi1 = new MenuImplementacion();

	public void añadirEstudiantes(Scanner sc) {
    int id = idAutomatico();
    System.out.println("Dame los apellidos.");
    sc.nextLine();
    String apellidos = sc.nextLine();
    System.out.println("Dame el nombre.");
    String nombre = sc.next();
	System.out.println("Dame el DNI.");
	String dNI = sc.next();
	System.out.println("Dame el telefono movil");
	long telefono = sc.nextLong();
	LocalDate fechaNacimiento = recogerFecha(sc); 
	EstudianteDtos estudiante = new EstudianteDtos(id,nombre,apellidos,dNI,telefono,fechaNacimiento);
	InicioApp.listaEstudiantesDtos.add(estudiante);
	System.out.println("se ha añadido correctamente");
	}
	private int idAutomatico(){
		int id;
		int tamaño = InicioApp.listaEstudiantesDtos.size();
		if(tamaño<=0) {
			id=1;
		}else {
			id = InicioApp.listaEstudiantesDtos.get(tamaño-1).getId() + 1 ;
		}
		return id;
	}
	
	private LocalDate recogerFecha(Scanner sc) {
		boolean cerrarcondicion = false;
		LocalDate fecha;
		do {
			System.out.println("Dame la fecha con el siguiente formato (dd-MM-yyyy)");
			String fehcaString = sc.next();
			String[] fechaSplitStrings = fehcaString.split("-");
			if(fechaSplitStrings.length>1) {
				DateTimeFormatter formatoDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
				fecha = LocalDate.parse(fehcaString, formatoDateTimeFormatter);
				cerrarcondicion=true;
				return fecha;
			}else {
				cerrarcondicion=false;
			}
		} while (!cerrarcondicion);
		return null;
		
	}

	public void modificarEstudiante(Scanner sc) {
		System.out.println("Dame el DNI del estudiante que quieres modificar");
		String dNIcomparar = sc.next();
		for(EstudianteDtos estudiante : InicioApp.listaEstudiantesDtos) {
			if(estudiante.getdNIEstudiante().equals(dNIcomparar)) {
				byte opcion = mi1.mostrarMenuEditarYEliminar(sc);
				switch (opcion) {
				case 0:
					System.out.println("Volveras al menu inicial.");
					break;
				case 1:
					System.out.println("Dame el nuevo DNI");
					estudiante.setdNIEstudiante(sc.next());
					break;
				case 2:
					System.out.println("Dame el nuevo nombre");
					estudiante.setNombreEstudiante(sc.next());
					break;
				case 3:
					sc.nextLine();
					System.out.println("Dame los nuevos apellidos");
					estudiante.setApellidosEstudiante(sc.nextLine());
					break;
				case 4:
					estudiante.setFechaNacimientoDate(recogerFecha(sc));
					break;
				case 5:
					System.out.println("Dame el nuevo telefono movil");
					estudiante.setNumeroTelefonoestudiante(sc.nextLong());
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
				}
				
			}else {
				System.out.println("No se ha obtenido bien el resultado del DNI, por el caso se le redirigira a la pagina principal.");
			}
		}
		
	}
	
	public void borrarEstudiante(Scanner sc) {
		System.out.println("Dame el DNI del estudiante que quieres eliminar");
		String dNIcomparar = sc.next();
		LocalDate fechaFicticia = LocalDate("31-12-9999");
		for(EstudianteDtos estudiante : InicioApp.listaEstudiantesDtos) {
			if(estudiante.getdNIEstudiante().equals(dNIcomparar)) {	
				if(InicioApp.listaEstudiantesDtos.size()==1) {
					InicioApp.listaEstudiantesDtos.remove(estudiante);
					InicioApp.listaEstudiantesDtos.add(new EstudianteDtos(0,"aaaaa","aaaaa","aaaaa",0,fechaFicticia ));
				}else {
					InicioApp.listaEstudiantesDtos.remove(estudiante);
				}
			}else {
				System.out.println("No se ha obtenido bien el resultado del DNI, por el caso se le redirigira a la pagina principal.");
			}
		}
		
	}
	private LocalDate LocalDate(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
