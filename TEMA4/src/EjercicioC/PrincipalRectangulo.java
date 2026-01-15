package EjercicioC;

import java.util.Scanner;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		Rectangulo rec1= new Rectangulo(0,0,5,3);
		
		Rectangulo rec2= new Rectangulo(7,9,2,3);
		
		int	contador=1;
		
		

	System.out.print(resultadoConversion(rec1.x1, rec1.x2, rec1.y1, rec1.y2));
	
	System.out.print(resultadoConversion(rec2.x1, rec2.x2, rec2.y1, rec2.y2));

	}

	
	public static String resultadoConversion(int x1,int x2,int y1,int y2) {

		String resultado="";
		
		String coordenadas;
		
		coordenadas=("Las coordenadas son: "+"("+x1+","+y1+")"+ " ("+x2+","+y2+")");
		
		

		String perimetro;
		
		int longitud;
		
		int ancho;
		
		if(x1>x2){longitud=x1-x2;}
		else if(x2>x1){longitud=x2-x1;}
		else {longitud=0;}
		
		if(y1>y2){ancho=y1-y2;}
		else if(y2>y1){ancho=y2-y1;}
		else {ancho=0;}
		
		perimetro="El perimetro es igual a: "+((longitud*2)+(ancho*2));
		
		String area;
		
		area="El area es igual a: "+(longitud*ancho);
		
		resultado=coordenadas+"\n"+perimetro+"\n"+area+"\n\n";
		
		return	resultado;
		
	}
	
}
