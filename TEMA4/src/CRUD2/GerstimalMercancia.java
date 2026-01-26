package CRUD2;

import java.util.ArrayList;

class Mercancia {

	private String nombre;

	private int stock;

	private double precio;

	static ArrayList<Mercancia> produccion = new ArrayList<>();

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

	public void agregarProducto(Mercancia producto) {

		produccion.add(producto);

	}

	public boolean comprobarRepetidos(String producto) {

		boolean unico = true;

		for (Mercancia a : produccion) {

			if (a.getNombre().equalsIgnoreCase(producto)) {

				unico = false;

			}

		}
		return unico;

	}

	public String cadenaProductos(Mercancia p) {

		String impresion = ("Nombre de producto: " + p.getNombre() + "||Stock: " + p.getStock() + "||Precio: "
				+ p.precio + "e");

		return impresion;

	}

	public void imprimirMenu(Mercancia producto) {

		if (produccion.isEmpty()) {

			System.out.println("Esta vacio, añade productos.\n");

		} else {

			for (Mercancia a : produccion) {

				System.out.println(cadenaProductos(a) + "\n");

			}

		}

	}

	public static boolean eliminarProducto(String nombre) {

		boolean eliminado = false;

		for (Mercancia a : produccion) {

			if (a.getNombre().equalsIgnoreCase(nombre)) {

				produccion.remove(a);

				eliminado=true;
				
				break;
			}			
			
		}

		return eliminado;
		
	}

}
