package EjercicioC;

public class Articulo {

	
	String nombre;
	
	double precio;
	
	final double IVA=1.21;

	int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int cuantosQuedan){
		
		this.nombre=nombre;
		this.precio=precio;
		this.cuantosQuedan=cuantosQuedan;
	}

}
