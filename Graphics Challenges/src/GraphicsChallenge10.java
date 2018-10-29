import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsChallenge10 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge10 canvas = new GraphicsChallenge10();
	        JFrame frame = new JFrame();
	        frame.setSize(406, 420);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.cyan);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    				
    			for(int i = 0; i < 600; i = i + 50)
    				{
    					graphics.setColor(Color.darkGray);
    					graphics.fillRect(i, i, 50, 50);
    					
    				}
    			
    			graphics.setColor(Color.darkGray);
		        graphics.fillRect(100, 0, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(200, 0, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(300, 0, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(400, 0, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(0, 100, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(0, 200, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(0, 300, 50, 50);
		        
		        graphics.setColor(Color.darkGray);
		        graphics.fillRect(0, 400, 50, 50);
	       
	      	}
	}
	        
    
	