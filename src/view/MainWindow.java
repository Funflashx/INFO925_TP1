package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import model.Environment;

public class MainWindow extends JFrame implements Observer {
	
	private Environment env = null ;
	private MapPanel mapPanel = null;
	
	public MainWindow(Environment env) {
		this.env = env;
		
		this.setTitle("Environnement");
	    this.setSize(1000, 1000);
	    this.setLocationRelativeTo(null);
	    
	    // On indique que le content est notre panel MapPanel
	    this.mapPanel = new MapPanel(this.env);
	    this.setContentPane(mapPanel); 
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    this.env.run();
	    
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.mapPanel.setEnv((Environment)arg0);
		this.setContentPane(mapPanel);
	}
	
	
}