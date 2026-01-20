package EjercicioD;

public class PrincipalPunto {

	public static void main(String[] args) {

		Punto p1= new Punto(5,0);
		Punto p2= new Punto(6,2);
		p1.setXY(59, 74);
		
		p1.desplaza(8, 0);
		
		System.out.println(p1.distancia(p2));
	}

	
		
}
