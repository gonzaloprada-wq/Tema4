package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class crudMain {

	public static void main(String[] args) {

		gestionAlumnos gestion = new gestionAlumnos();

		Scanner reader = new Scanner(System.in);

		int selector;

		do {
			System.out.println("\nALUMNOS/AS");
			System.out.println("===========");
			System.out.println("\n1. Listado.");
			System.out.println("2. Nuevo Alumno.");
			System.out.println("3. Modificar.");
			System.out.println("4. Borrar.");
			System.out.println("5. Salir.");

			selector = reader.nextInt();

			switch (selector) {

			case 1 -> {
				Alumnado alumnoNuevo = new Alumnado();
				gestion.imprimirListado(alumnoNuevo);
				break;
			}

			case 2 -> {

				System.out.println("Ingresa nombre");

				String newNombre = reader.nextLine();

				newNombre = reader.nextLine();

				double NewNota = detectarNotaCorrecta();

				Alumnado alumnoNuevo = new Alumnado();

				alumnoNuevo.setNombre(newNombre);

				alumnoNuevo.setNota(NewNota);

				if (gestion.agregarAlumno(alumnoNuevo)) {

					System.out.println("Agregado con exito!");

				}
			}

			case 3 -> {

				System.out.println("Ingresa nombre del Alumno: ");

				reader.nextLine();

				String nombreabuscar = reader.nextLine();

				Alumnado alumnoEncotrado = gestion.buscarAlumno(nombreabuscar);

				if (alumnoEncotrado != null) {

					double newNota = detectarNotaCorrecta();

					alumnoEncotrado.setNota(newNota);

					System.out.println("Nota cambiada");

				} else {

					System.out.println("Alumno no encontrado");

				}

			}

			case 4 -> {

				System.out.println("Ingresa nombre del alumno a eliminar: ");

				reader.nextLine();

				String nombreabuscar = reader.nextLine();

				Boolean eliminado = gestion.haSidoEliminado(nombreabuscar);

				if (eliminado) {

					System.out.println("El usuario ha sido eliminado");

				} else {

					System.out.println("El usuario no ha podido eliminarse / no existe");

				}

			}

			}
			;

		} while (selector != 5);

		System.out.println("Saliendo....");

		reader.close();
	}

	public static double detectarNotaCorrecta() {
		Scanner reader = new Scanner(System.in);

		double newNota;

		do {
			System.out.println("Ingresa nota 0-10");

			newNota = reader.nextDouble();

		} while (newNota > 10 || newNota < 0);

		return newNota;

	}

}
