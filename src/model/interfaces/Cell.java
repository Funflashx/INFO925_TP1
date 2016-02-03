package model.interfaces;

import model.Position;

public interface Cell {
	
	Position position = null;
	
	public Position getPosition();
	public void setPosition (Position position);
	
}
