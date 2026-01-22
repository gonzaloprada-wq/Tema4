package CRUD;

class Alumnado {

	private String nombre;

	private Double nota;

	void publicAlumno(String nombre, double nota) {

		this.nombre = nombre;

		this.nota = nota;

	}

	public String getNombre() {

		return this.nombre;
	}

	public double getNota() {

		return this.nota;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public void setNota(double nota) {				
			
			this.nota = nota;	
		
		
	}

}
