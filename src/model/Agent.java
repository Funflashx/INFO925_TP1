package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Agent extends Cell {

	private String name;

	/**
	 * Constructor
	 * **************************
	 * @param name of the agent
	 * @param position of the agent
	 */
	public Agent(Position position, String name) {
		super(position);
		this.name = name;
	}

	/**
	 * Agent initialisation
	 */
	void init () {
		
	}

	/**
	 * GETTER & SETTER
     */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Agent{" +
				"name='" + name + '\'' +
				'}';
	}


}
