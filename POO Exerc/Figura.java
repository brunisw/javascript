public abstract class Figura {

	private int x, y;
	
	public abstract void desenhar();
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int novoX) {
		x = novoX;
	}
	public void setY(int novoY) {
		y = novoY;
	}

}
