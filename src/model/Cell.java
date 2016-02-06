package model;

public class Cell {

	private Position position;

	/**
	 * Constructor
	 * **************************
	 * @param position on environment
	 */
	public Cell(Position position) {
		this.position = position;
	}

	/**
	 * GETTER & SETTER
	 */
	public Position getPosition() {
		return position;
	}
	public void setPosition(int x, int y) {
		this.position.setX(x);
		this.position.setY(y);
	}


	@Override
	public String toString() {
		return "Cell{" +
				position.toString() +
				'}';
	}
}
