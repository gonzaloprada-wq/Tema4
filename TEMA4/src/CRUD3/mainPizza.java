package CRUD3;

import java.util.Scanner;

public class mainPizza {

	public static void main(String[] args) {
		
		Pizzeria p = new Pizzeria();
		
		Scanner reader = new Scanner(System.in);
		
		
		
        boolean salirMenu=false;
		System.out.println("BIENVENIDO A LA PIZZERIA!");
		do {
			
			System.out.println("\na. Listado de pizzas");
			System.out.println("b. Nuevo pedido ");
			System.out.println("c. Pizza servida");
			System.out.println("d. Salir");
			
			String menu=reader.nextLine().trim();
			
			switch(menu) {
			
			case "a","A"->{
				
				System.out.println("---LISTADO DE PIZZAS---");
				
				for(Pizzeria pizza : Pizzeria.carta) {
					
					System.out.println(pizza.getPizza()+"| PRECIO: "+pizza.getPrecio());
					
				}								
			}
			
			case "b","B"->{
				
				
				
				System.out.println("Ingresa la pizza al pedido:");
				
				String nombrePizza=reader.nextLine().trim().toLowerCase();
				
				System.out.println("Ingresa Mesa:");
				
				int mesa = reader.nextInt();
				
				
				if(p.ingresarPedido(nombrePizza, mesa)){
					
					
				System.out.println("\nPedido Ingresado con exito!");
				System.out.println("\nPEDIDOS:");
				
				for(Pizzeria pedidos : Pizzeria.pedidos){
					
					System.out.println(pedidos.getPizza()+"|Num. Mesa: "+pedidos.getMesa()+"\n");
					
				}
				
				
				}else {
					
					System.out.println("Pizza no existente!");
					
				}
				
				
				
			}
			
			case "c","C"->{
				
				System.out.println("Ingresa la pizza del pedido servido:");
				
				String nombrePizza=reader.nextLine().trim().toLowerCase();
				
				System.out.println("Ingresa Mesa del pedido servido:");
				
				int mesa = reader.nextInt();
				
				
				if(p.servirPedido(nombrePizza, mesa)){
				
				System.out.println("Pedido servido con exito!");
									
					
				}else{
					
					System.out.println("Pedido no existente!");
					
				}
			}
			
			
			case "d","D"->{
				
				salirMenu=true;		
			}
			
			
			
			}
			
			
			
		}while(!salirMenu);		

		
		
	}
}
