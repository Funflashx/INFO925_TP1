package model;

import java.util.ArrayList;
import java.util.Observable;

public class Cell {

	private Position position;
	
	//Notre collection d'observateurs
	//private ArrayList<Observateur> listObservateurs = new ArrayList<Observateur>();

	/**
	 * Constructor
	 * **************************
	 * @param position on environment
	 */
	
	public Cell() {
	}
	
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
