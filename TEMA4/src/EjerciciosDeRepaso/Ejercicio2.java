package EjerciciosDeRepaso;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creo un rand que generando numeros aleatorios
		Random rand = new Random();

		// Creo un double para notas con un total de 10 alumnos
		double[] notasClase = new double[10];

		for (int i = 0; i < notasClase.length; i++) {
			
			// las notas son aleatorias de 0 a 10
			notasClase[i] = rand.nextDouble(10);

			notasClase[i] = Math.floor(notasClase[i] * 100) / 100;
			
		}
		
		impresionYValor(notasClase);

		System.out.println();
		// imprimo una media realizando una funcion
		System.out.println("La media de la clase es la siguiente " + calcularMedia(notasClase));

		System.out.println("Se le sube 0.5 a todos los alumnos ");

		sumaDecimal(notasClase);
		
		impresionYValor(notasClase);
		
	}

	
	static void impresionYValor(double[] notasClase) {
	
		// creo un for que añade notas al array

		for (int i = 0; i < notasClase.length; i++) {

			System.out.print(notasClase[i] + "|");
			
		}
		System.out.println();
	}

	
	// Creo una funcion que calcula la media recibiendo el array notas
	static double calcularMedia(double[] notas) {

		// creo double para almacenar resultado
		double resultadoMedia;

		// creo un auxiliar para ir sumando para realziar la media
		double auxNumeros = 0;

		// Creo un for que recorre el array
		for (int i = 0; i < notas.length; i++) {

			// cada nota que pasa se le suma a aux
			auxNumeros += notas[i];

		}

		// calculo la media con la longitud del array
		resultadoMedia = auxNumeros / notas.length;

		// redondeo a dos decimales
		resultadoMedia = Math.round(resultadoMedia * 100.00) / 100.00;

		// devuelvo resultado
		return resultadoMedia;
	};

	static double[] sumaDecimal(double[] subida){
		
		for(int i=0; i<subida.length;i++){
			
			if(subida[i]<=9.5){
			subida[i]+=0.5;
			}else {
				
			subida[i]=10.0;
				
			}
			
		}
		
		return subida;
	}
	
}
