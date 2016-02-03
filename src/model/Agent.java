package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Agent extends Cell {

	private String name;

	public Agent(Position position, String name) {
		super(position);
		this.name = name;
	}
	
	
}
