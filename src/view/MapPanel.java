package view;

import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import model.Environment;


public class MapPanel extends JPanel {
	
	private Environment env = null ;
	
	public MapPanel(Environment env) {
		this.env = env;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;    
		int width = env.getWidth();
		int height = env.getHeight();
		int zoom = 50;
		
		// draw grid
		g2d.drawRect(0, 0, width*zoom, height*zoom);
		g2d.setColor(Color.BLACK);
		
		// draw line
		for (int i = 0; i <= width; i++) 
			g2d.drawLine(i*zoom, 0, i*zoom, height*zoom);

		for (int j = 0; j <= height; j++) 
			g2d.drawLine(0, j*zoom, width*zoom, j*zoom);
		
		for(int i=0; i<width; i++)
    	{
    		for(int j=0; j<height; j++)
	    	{
    			String str = "";

				if(env.getCell(i, j) != null)
				{					
					String type = String.valueOf(env.getCell(i,j).getClass().getSimpleName());
					/* Définition de la couleur de la case */ 
					switch (type)
					{
					  case "Explorer":
					    System.out.println("Je suis un explorateur !");
					    g2d.setColor(Color.BLUE);
					    break;
					  case "Mineral":
					    System.out.println("Je suis un minéral !");
					    g2d.setColor(Color.YELLOW);
					    break;
					  case "Worthless":
					    System.out.println("Je suis un objet inutile !");
					    g2d.setColor(Color.RED);
					    break;
					  default:
					    System.out.println("Je ne connais pas mon type");
					}
					/* Tracé du rectangle pour la case */
					g2d.fillRect(i*zoom, j*zoom, zoom, zoom);
					
					/* Affichage du type */ 
					str = env.getCell(i,j).toString();
					if(str.length() >7)
					{
						str = str.substring(0,6);
						str =str + ".";
					}
					Font f1 = new Font("SansSerif", Font.PLAIN, zoom/4);
					g2d.setFont(f1);
					g2d.setColor(Color.BLACK);
					g2d.drawString(str,  (i*zoom)+1, (j*zoom)+(zoom/5)+1);
				}
	    	}
    	}
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}
	
	

}
