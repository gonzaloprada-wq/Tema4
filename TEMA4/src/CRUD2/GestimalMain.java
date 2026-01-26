package CRUD2;

import java.util.Scanner;

public class GestimalMain {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String selector = "";

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

			selector = reader.nextLine().toLowerCase();

			switch (selector) {

			case "a" -> {

				Mercancia producto = new Mercancia();

				producto.imprimirMenu(producto);

			}

			case "b" -> {

				añadirProducto();

			}

			case "c" -> {

				eliminarObjeto();

			}

			case "d"->{
				
				
				
				
			}
			
			}

		} while (!selector.equalsIgnoreCase("g"));

	}

	public static void añadirProducto() {

		Scanner reader = new Scanner(System.in);

		Mercancia producto = new Mercancia();

		System.out.println("Ingresa nuevo producto: ");

		String nombreProducto = reader.nextLine();

		if (producto.comprobarRepetidos(nombreProducto)) {

			System.out.println("Ingresa Stock: ");

			int stockProducto = reader.nextInt();

			System.out.println("Ingresa Precio: ");

			double precioProducto = reader.nextDouble();

			producto.setNombre(nombreProducto);
			producto.setStock(stockProducto);
			producto.setPrecio(precioProducto);

			producto.agregarProducto(producto);

		} else {

			System.out.println("\nProducto ya existente.\n");

		}

	}

	public static void eliminarObjeto() {
		
		Scanner reader = new Scanner(System.in);
		
		
		
		
		System.out.println("Ingresa el elemento que quieres eliminar: ");{
			
		String eliminarElemento=reader.nextLine();
		
		if(Mercancia.eliminarProducto(eliminarElemento)) {
			
			System.out.println("Eliminado Correctamente\n");
			
		}else {
			
			System.out.println("No existe/no ha sido eliminado");
			
		}
			
		}
		
	}

}
