package model;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */

public class Worthless extends Object {

    private String name;

    /**
     * Represente un objet inutile dans l'environement
     * (Murs, rochers, arbre...)
     * @param position position de cette objet
     */
    public Worthless(Position position, String name) {
        super(position);
        this.name = name;
    }

}
