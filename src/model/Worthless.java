package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */

public class Worthless extends Object {

    private String label;

    /**
     * Represente un objet inutile dans l'environement (Murs, rochers, arbre...)
     * @param position position de cette objet
     * @param label a label
     */
    public Worthless(Position position, String label) {
        super(position);
        this.label = label;
    }
    
    @Override
	public String toString() {
		return "Worthless{" +
				"Label='" + label + '\'' +
				'}';
	}
}
