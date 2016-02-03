package model.interfaces;

import model.Position;

public interface Cell {
	
	Position position = null;
	
	public Position GetPosition();
	public void setPosition (Position position);
	
}
