package CRUD2;

import java.util.Scanner;

public class GestimalMain {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		String selector="";
		
		do {
			
			System.out.println("BIENVENIDO");
			System.out.println("==========");
			System.out.println();
			System.out.println("a. Listado");
			System.out.println("b. Alta");
			System.out.println("c. Baja");
			System.out.println("d. Modificiación");
			System.out.println("e. Entrada de mercancía");
			System.out.println("f. Salida de mercancía");
			System.out.println("g. Salir");
			System.out.println();
			System.out.println("Ingresa letra: ");
			
			selector=reader.nextLine().toLowerCase();
				
			switch(selector ) {
			
			case "a"->{
				
				
				
				
				
				
				
				
				
				
			}
			
			case "b"->{
				
				Mercancia producto= new Mercancia();
				
				
				System.out.println("Ingresa nuevo producto: ");
				
				String nombreProducto=reader.nextLine();
				
				producto.setNombre(nombreProducto);
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			}
			
			
			
			
			
			
		}while(selector.equalsIgnoreCase("g"));
					
		
	
		
		
		
		
	}

	
}
