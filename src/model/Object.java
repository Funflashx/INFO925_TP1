package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Object extends Cell {

	public Object(Position position) {
		super(position);
	}
	
	@Override
	public String toString() {
		return "Object{" +
				"position='" + super.getPosition() + '\'' +
				'}';
	}
}
