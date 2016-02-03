package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Mineral extends Object {

    public TypeMineral typeMineral;
    public int quantity;

    public Mineral(Position position, int quantity, TypeMineral typeMineral) {
        super(position);
        this.quantity = quantity;
        this.typeMineral = typeMineral;
    }
}
