package EjercicioA;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {

			System.out.println("Usuario " + i);
			System.out.println(user());
		}

	}

	public static String user() {
		Scanner reader = new Scanner(System.in);

		Persona p1 = new Persona();

		String mayorMenor;

		for (int i = 1; i <= 2; i++) {

			System.out.print("Ingresa DNI: ");

			p1.DNI = reader.nextLine().trim();

			if (p1.DNI.length() != 8) {
				System.out.println("ERROR, El formato debe ser: 0000000A");
			}

		}
		while (p1.DNI.length() != 8)
			;

		System.out.print("Ingresa Nombre: ");

		p1.Nombre = reader.nextLine().trim();

		
		
		System.out.print("Ingresa Apellidos: ");

		p1.Apellidos = reader.nextLine().trim();

		
		
		System.out.print("Ingresa edad: ");

		p1.edad = reader.nextInt();

		
		
		if (p1.edad >= 18) {

			mayorMenor = " es ";
		} else {
			mayorMenor = " no es ";
		}

		return p1.Nombre + " " + p1.Apellidos + " con DNI " + p1.DNI + mayorMenor + "mayor de edad.";

	}

}
