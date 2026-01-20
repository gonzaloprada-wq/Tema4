package EjercicioD;

public class Persona {

	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private int edad;

	public Persona(String DNI, String Nombre, String Apellidos, int edad){
		
		this.dni=DNI;
		
		this.nombre=Nombre;
		
		this.apellidos=Apellidos;
		
		this.edad=edad;
		
	}
	
	public void setDni(String newDNI){
		
		if(newDNI.length()==9&&!newDNI.isEmpty()){
			
			this.dni=newDNI;			
		}	
	}
	
	public void setNombre(String newNombre){
		
		if(!newNombre.isEmpty()&&!newNombre.equals(this.nombre)){
			
			this.nombre=newNombre.trim();			
		}	
	}
	
	public void setApellidos(String newApellidos){
		
		if(!newApellidos.isEmpty()&&newApellidos.equals(this.apellidos)){
			
			this.nombre=newApellidos.trim();			
		}	
	}
	
	public void setEdad(int newEdad){
		
		if(newEdad!=0&&newEdad<100&&newEdad!=this.edad){
			
			this.edad=newEdad;			
		}	
	}
	
	
	
	public String getDni(){
				
		return dni;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public String getApellidos(){
		
		return apellidos;
	}
	
	public int getEdad(){
		
		return edad;
	}
	
	public boolean esMayorEdad(){
		
		boolean esMayor=false;
		
		if(edad>=18){
			
			esMayor=true;			
		}	
		return esMayor;
	};
	
	public boolean esJubilido(){
		
		boolean esJubilado=false;
		
		if(edad>=65){
			
			esJubilado=true;			
		}	
		return esJubilado;
	};
	
	public int diferenciaEdad(Persona p){
		int diferenciaEdad;
		if(this.edad>=p.edad){
		
		
		diferenciaEdad=this.edad-p.edad;
		
		return diferenciaEdad;
		
		
		}else{
			
			diferenciaEdad=p.edad-this.edad;
					
		}
		
		return diferenciaEdad;
		
	}
	
	public String toString(){
		
		String respuestaFinal="DNI: "+getDni()+" Nombre: "
		+getNombre()+" Apellidos: "+getApellidos()+" Edad: "+getEdad()+" Es mayor de edad: "+esMayorEdad()+
		" Esta jubilado: "+esJubilido();
		return respuestaFinal;
		
	}
	
	
}
