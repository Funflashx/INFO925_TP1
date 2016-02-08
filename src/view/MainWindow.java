package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Environment;

public class MainWindow extends JFrame {
	
	public MainWindow(Environment env) {
		this.setTitle("Environnement");
	    this.setSize(1000, 1000);
	    this.setLocationRelativeTo(null);
	    
	    // On indique que le content est notre panel MapPanel
	    this.setContentPane(new MapPanel(env)); 
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	}
	
	
}