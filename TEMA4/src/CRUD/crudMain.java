package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class crudMain {

	public static void main(String[] args) {

		gestionAlumnos gestion = new gestionAlumnos();
		
		Alumnado alumnoNuevo = new Alumnado();

		Scanner reader = new Scanner(System.in);

		int selector;

		System.out.println("ALUMNOS/AS");
		System.out.println("===========");
		System.out.println("\n1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");

		selector = reader.nextInt();

		switch (selector) {

		case 1 -> {gestion.imprimirListado(alumnoNuevo); break;}

		case 2 -> {gestion.agregarAlumno(alumnoNuevo);
		
		System.out.println("Ingresa nombre");
		
		alumnoNuevo.getNota()=reader.nextDouble();}
		
		
		
		
		};
	}}

	

