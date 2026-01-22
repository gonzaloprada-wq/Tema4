package CRUD;

import java.util.ArrayList;

public class gestionAlumnos {

	ArrayList<Alumnado> alumnos = new ArrayList<>();

	
	
	public void agregarAlumno(Alumnado alumno) {

		alumnos.add(alumno);
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

	
	public void nuevoAlumno() {
		
		
		
		
		
	}
	
	
	
	
}
