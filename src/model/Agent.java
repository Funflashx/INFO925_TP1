package model;

import model.interfaces.Cell;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Agent implements Cell {

	private Position position;

	public Position getPosition(){
		return position;
		
	}

	public void setPosition (Position position){
		this.position = position;
	}
	
	
}
