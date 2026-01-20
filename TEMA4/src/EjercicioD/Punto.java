package EjercicioD;

public class Punto {

	private int x;

	private int y;

	public Punto(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void setXY(int x, int y) {

		if (x != y && x > 0) {

			this.x = x;
		}

		if (y != x && y > 0) {

			this.y = y;
		}
	}

	public void desplaza(int dx, int dy) {

		if (dx > 0) {

			this.x += dx;

		}

		if (dy > 0) {

			this.y += dy;

		}
	}

	public double distancia(Punto p){
		
		int dx=this.x-p.x;
		int dy=this.y-p.y;
		
		
		return Math.sqrt(dx*dx+dy*dy);
		
		
	}
	
	public String toString() {
		
		
		return "("+(this.x)+"-"+(this.y)+")";
		
	}
	
}


/*
 * public int getX() { return x; }
 * 
 * public int getY() { return y; }
 * 
 * public void setX(int newX) { if (newX > 0 && newX != x) { x = newX; } }
 * 
 * public void setY(int newY) { if (newY > 0 && newY != y) { y = newY; } }
 */
