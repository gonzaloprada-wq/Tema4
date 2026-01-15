package EjercicioC;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

			System.out.println("Usuario " + 1);
			System.out.println(user());

			System.out.println("Usuario " + 2);
			System.out.println(user2());
		

	}

	public static String user() {
		Scanner reader = new Scanner(System.in);

		Persona p1 = new Persona("29578798M","Gonzalo","Prada Guzman", 18);
		
		String mayorMenor;

	
		if (p1.edad >= 18) {

			mayorMenor = " es ";
		} else {
			mayorMenor = " no es ";
		}
		if (p1.edad >= 18) {

			mayorMenor = " es ";
		} else {
			mayorMenor = " no es ";
		}

		return p1.Nombre + " " + p1.Apellidos + " con DNI " + p1.DNI + mayorMenor + "mayor de edad.";
		

	}
	public static String user2() {
		Scanner reader = new Scanner(System.in);

		Persona p1 = new Persona("2957sdas8M","Gonasfdlo","Pasfa asfsafman", 18);
		
		String mayorMenor;

	
		if (p1.edad >= 18) {

			mayorMenor = " es ";
		} else {
			mayorMenor = " no es ";
		}
		if (p1.edad >= 18) {

			mayorMenor = " es ";
		} else {
			mayorMenor = " no es ";
		}

		return p1.Nombre + " " + p1.Apellidos + " con DNI " + p1.DNI + mayorMenor + "mayor de edad.";
		

	}

}
	

