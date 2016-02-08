package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Mineral extends Object {

    public TypeMineral typeMineral;
    public int quantity;

    /**
     * Constructor
     * ******************
     * @param position on the environment
     * @param quantity of this mineral
     * @param typeMineral its type
     */
    public Mineral(Position position, int quantity, TypeMineral typeMineral) {
        super(position);
        this.quantity = quantity;
        this.typeMineral = typeMineral;
    }

    /**
     * GETTER & SETTER
     */
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TypeMineral getTypeMineral() {
        return typeMineral;
    }

    public void setTypeMineral(TypeMineral typeMineral) {
        this.typeMineral = typeMineral;
    }
    
    @Override
	public String toString() {
		return "Mineral{" +
				"quantity='" + quantity + "\', " +
				"typeMineral='" + typeMineral + "\'" +
				'}';
	}
}
