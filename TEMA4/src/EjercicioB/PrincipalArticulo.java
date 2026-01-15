package EjercicioB;

public class PrincipalArticulo {

	public static void main(String[] args) {
	
		
		Articulo p1 = new Articulo("Pijama",7,3);
		
		System.out.println("Articulo:"+p1.nombre+" - PRECIO:"+p1.precio+" IVA:21% - PVP:"+(p1.precio*p1.IVA));
		
		

	}

}
