package model;

public class Position {
	
	private int x;
	private int y;

	/**
	 * @param x vertival
	 * @param y horizontal
	 */
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Check if the current position is in the environement
	 * @param	width	width of the environement
	 * @param	height	height of the environement
	 * @return			true if the position is in the environement
	 */
	public boolean isBetweenBounds(int width, int height)
	{
		return this.x >= 0 && this.x < width && this.y >= 0 && this.y < height;
	}

	/**
	 * GETTER & SETTER
     */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Position{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}
