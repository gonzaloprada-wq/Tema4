package EjercicioC;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
			
		
		Persona p1 = new Persona("29587987M","Gonzalo","Prada", 18);
	
		String mayorMenor;

	
		
		if (p1.getEdad() >= 18) {

			mayorMenor = " es ";
		} else {
			mayorMenor = " no es ";
		}
		
		
		
		p1.setNombre("");
		p1.setDni("235234234");
		
		System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + mayorMenor + "mayor de edad.");
		

	


	}
}

	

