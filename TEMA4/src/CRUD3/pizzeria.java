	package CRUD3;
	
	import java.util.ArrayList;
	
	class Pizzeria {
	
		private String pizza;
		
		private double precio;
		
		private int mesa;
		
		static  ArrayList<Pizzeria> carta= new ArrayList<>();
		
		static  ArrayList<Pizzeria> pedidos= new ArrayList<>();
		
		 static{
			 
	        carta.add(new Pizzeria("Margarita", 13.0,0));
	        carta.add(new Pizzeria("Peperoni", 10.0,0));
	        carta.add(new Pizzeria("Romana", 10.0,0));
	        carta.add(new Pizzeria("Barbacoa", 15.0,0));
	        carta.add(new Pizzeria("Hawaiana", 10.0,0));
	    }
		
		private Pizzeria(String pizza, double precio, int mesa ){
			
			this.pizza=pizza;
			
			this.precio=precio;
			
			this.mesa=mesa;
		}
	 
	 public Pizzeria() {}
		
		public String getPizza()	 {
	
			return this.pizza;
	
		};
		
		public double getPrecio() {
	
			return this.precio;
	
		};
		
		
		public double getMesa() {
			
			return this.mesa;
			
		}
	
		public void setMesa(int numero) {
			
			this.mesa=numero;
			
		}
		
		public boolean ingresarPedido(String nombrePizza, int mesa){
			
			boolean existe=false;
			
			for(Pizzeria p : Pizzeria.carta) {
				
				if(p.getPizza().trim().equalsIgnoreCase(nombrePizza)){
					
					Pizzeria nueva = new Pizzeria(p.getPizza(),p.getPrecio(),mesa);
					
					Pizzeria.pedidos.add(nueva);
					
					existe=true;								
				}			
			}
	
			
			
			return existe;
		}
		
		public boolean servirPedido(String nombrePizza, int mesa){
			
			boolean existe=false;
			
			for(Pizzeria p : Pizzeria.pedidos) {
				
				if(p.getPizza().trim().equalsIgnoreCase(nombrePizza)&&p.getMesa()==mesa){
					
					Pizzeria.pedidos.remove(p);
					
					existe=true;								
				}	
				
				break;
			}
	
			
			
			return existe;
		}
		
		
	}
