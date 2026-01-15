package EjercicioC;

public class Punto {

	private int x;

	private int y;

	public Punto(int x, int y) {

		this.x = x;

		this.y = y;

	}

	public int getX() {

		return x;

	}

	public int getY() {

		return y;

	}

	public void setX(int newX) {

		if (newX > 0 && newX != x) {

			x = newX;

		}

	}
	
	public void setY(int newY) {

		if (newY > 0 && newY != x) {

			x = newY;

		}

	}

}
