package model;

import model.interfaces.Cell;

import java.util.Arrays;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */


public class Environment {

    private String name;
    /**
     * width and height are numbers of cells
     */
    private int width;
    private int height;

    private Cell[][] cells;

    /**
     * Constructor
     * ***************************
     * @param width extent from side to side
     * @param height distance upward
     */
    public Environment(int width, int height) {
        this.cells = new Cell[width][height];
        this.width = width;
        this.height = height;
        this.name = "";
    }

    /**
     * GETTERS & SETTERS
     */

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Returns the cell which is at the position x, y in the cells table
     * @param	x	x position
     * @param	y	y position
     * @return		corresponding object
     */
    public Cell getCell(int x, int y)
    {
        return this.cells[x][y];
    }

    /**
     * Removes the Object which is at the position x, y in the cells table
     * @param	x	x position
     * @param	y	y position
     */
    public void removeCell(int x, int y)
    {
        this.cells[x][y] = null;
    }

    /**
     * Adds an cell to the cells
     * @param	cell	cell to add
     */
    public void addCell(Cell cell)
    {
        int x = cell.getPosition().getX();
        int y = cell.getPosition().getY();

        if (x >= 0 && x < width && y >= 0 && y < height)
            cells[x][y] = cell;
    }


    @Override
    public String toString() {
        return "Environment{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", cells=" + Arrays.toString(cells) +
                '}';
    }

}
