package model;

import java.util.Arrays;
import java.util.Observable;

/**
 * Created by François Caillet on 03/02/2016.
 * All rights reserved.
 */
public class Environment extends Observable{

    private String name;
    /**
     * width and height b numbers of cells
     */
    private int width;
    private int height;

    private Cell[][] cells;
    //private ArrayList<Agent> agents;

    /**
     * Constructor
     * ***************************
     * @param name environment's name
     * @param width extent from side to side
     * @param height distance upward
     */
    public Environment(String name, int width, int height) {
    	this.name = name;
        this.cells = new Cell[width][height];
        this.width = width;
        this.height = height;
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
            this.cells[x][y] = cell;
        /*if ( cell instanceof Agent) {
        	addAgent(new Agent(cell.getPosition(), ((Agent) cell).getName()));
        }*/
    }
/*
    public void addAgent(Agent agent){
        agents.add(agent);
    }*/

    public void setPositionCell(Cell cell, int newX, int newY) {
    	int x = cell.getPosition().getX();
        int y = cell.getPosition().getY();
        
        if (newX >= 0 && newX < width && newY >= 0 && newY < height) {
        	cell.setPosition(newX, newY);
            addCell(cell);
         	removeCell(x,y);
         	setChanged();
         	notifyObservers();
        }
    }
    
    public void run() {
		try {
			for(int i=0; i<width; i++) {
        		for(int j=0; j<height; j++) {
    				Cell cell = new Cell();
        			cell = getCell(i,j);
        			if(cell != null ) {
        				if(cell.getClass().getSimpleName().equals("Explorer")) {
        					setPositionCell(cell,i+1,j+1);
        				}	
        			}
    	    	}
        	}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
