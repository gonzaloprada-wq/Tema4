package EjerciciosDeRepaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Creo el scaner para guardar valores en este mas adelante
		Scanner reader = new Scanner(System.in);

		//Aqui pido al ususario ingresar una frase para realizar todas las operaciones sobre esta
		System.out.println("Ingresa una frase o texto");

		//Creo dicha frase y la leo almacenandola
		String fraseCompleta = reader.nextLine();

		//Creo un arrayfrase a partir de una funcion que se le inserta la anterior frase solicitada
		String[] arrayFrase = obtenerPalabras(fraseCompleta);

		//Imprimo un mensaje pidiendo la longitud que el usuario desea buscar para las palabras (como de larga busca la palabra en caracteres)
		System.out.println("\nIngresa longitud de filtrado deseada para las palabras");

		//Creo para almacenar dicho numero y lo leo
		int longitud = reader.nextInt();

		//Imprimo un mensaje  que cuenta cuantas tienen dicha longitud o mas, mediante una funcion que usa el array con lña frase y la longitud maxima buscada
		System.out.println("Tienen dicha longitud " + contarPalabrasLargas(arrayFrase, longitud) + " palabras.");

		//Aqui imprimo que palabra es la mas larga de todas usando una funcion
		System.out.println("La palabra mas larga es " + palabraMasLarga(arrayFrase));

	}

	//aqui se ejecuta una funcion que convierte las frases en arrays
	static String[] obtenerPalabras(String frase) {

		//aqui convierte la frase en minusculas y quita espacios en los alterales
		frase = frase.toLowerCase().trim();

		//convierte cada frase en un array
		String[] arrayFrase = frase.split(" ");

		//Devuelvo el array
		return arrayFrase;
	}

	//esta funcion cuenta cuantas palabtas con el minimo de longitud ingresado hay
	static int contarPalabrasLargas(String[] palabras, int longitudMinima) {

		//Creo el contador en 0
		int contadorLargas = 0;

		//recorro un for con la longitud de las palabras en ella 
		for (int i = 0; i < palabras.length; i++) {

			//si las palabras son mayores o iguales que la longitud minima se suma el contador
			if (palabras[i].length() >= longitudMinima) {

				contadorLargas++;

			}
		}

		//Devuelve el contador por consecuetne, el numero de palabras largas
		return contadorLargas;
	}

	
	//en esta funcion determena cual es la plabra mas larga ademas de la primera mas larga
	static String palabraMasLarga(String[] palabras) {

		//Creo un auxiliar para guardar la mas larga actual
		String palabraAuxiliar = "";

		///recorro un for 
		for (String palabra : palabras) {

			//si la palabra es mas larga que la auxiliar esta palabra se vuelve la auxiliar
			if (palabra.length() > palabraAuxiliar.length()) {

				palabraAuxiliar = palabra;

			}

		}

		//aqui devuelve la palabra mas larga
		return palabraAuxiliar;
	}

}
