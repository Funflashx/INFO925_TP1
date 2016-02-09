package model;

public class Explorer extends Agent {

	public Explorer(Position position, String name) {
		super(position,name);
	}
	
	void findMineral() {
		
	}
	
	@Override
	public String toString() {
		return "Explorer: " + super.getName();
	}

}
