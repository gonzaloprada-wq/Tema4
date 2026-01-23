package CRUD;

import java.util.ArrayList;

public class gestionAlumnos {

	ArrayList<Alumnado> alumnos = new ArrayList<>();

	public boolean agregarAlumno(Alumnado alumno) {

		for (Alumnado a : alumnos) {

			if (a.getNombre().equalsIgnoreCase(alumno.getNombre())) {

				System.out.println("ERROR! Alumno ya ingresado");
					
				return false;
		
			}

		}

		alumnos.add(alumno);
		return true;
	}

	public void imprimirListado(Alumnado alumno) {

		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos");
		}

		else {
			for (Alumnado a : alumnos) {

				System.out.println("\n Nombre: " + a.getNombre() + " Nota: " + a.getNota());

			}
		}
	}

	public Alumnado buscarAlumno(String nombreabuscar) {

		for (Alumnado a : alumnos) {
			if (a.getNombre().equalsIgnoreCase(nombreabuscar)) {

				return a;
			}
		}

		return null;

	}

	public boolean haSidoEliminado(String nombreabuscar) {

		boolean eliminado = false;

		for (int i = 0; i < alumnos.size(); i++) {

			if (alumnos.get(i).getNombre().equalsIgnoreCase(nombreabuscar)) {

				alumnos.remove(i);

				eliminado = true;

			}

		}

		return eliminado;

	}

}
