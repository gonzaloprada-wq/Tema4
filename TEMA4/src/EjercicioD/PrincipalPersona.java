package EjercicioD;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
			
		
		Persona p1 = new Persona("29587987M","Gonzalo","Prada", 18);
	
		String mayorMenor;

		Persona p2 = new Persona("sdifsdjif","Gon","pra", 90);
		
		System.out.println(p1.diferenciaEdad(p2));
	
		
		
		
		p1.setNombre("");
		p1.setDni("235234234");
		
		System.out.println(p1.toString());
		

	


	}
}

	

