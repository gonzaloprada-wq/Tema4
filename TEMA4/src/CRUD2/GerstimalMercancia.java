package CRUD2;

class Mercancia {

	private String nombre;

	private int stock;

	private double precio;

	void Mercancia(String nombre, int stock, double precio) {

		this.nombre = nombre;

		this.stock = stock;

		this.precio = precio;

	}

	public String getNombre() {

		return this.nombre;

	};

	public int getStock() {

		return this.stock;

	};

	public Double getPrecio() {

		return this.precio;

	};

	public void setNombre(String nombre) {

		nombre = nombre.trim();

		this.nombre = nombre;

	};

	public void setPrecio(double precio) {

		if (precio > 0) {

			this.precio = precio;
		}
	};

	public void setStock(int stock) {

		if (stock >= 0) {

			this.stock = stock;
		}
	};

}
