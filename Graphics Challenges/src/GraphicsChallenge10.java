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
	        frame.setSize(400, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.cyan);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		int i = 0;
    		int j = 0;

    			for( i = 0; i < 400; i = i + 50)
    			{
    				
    				for( j = 0; j < 400; j = j + 100)
    				{
    					if((j == 0) && (i % 100 == 50))
    					{
    						j = j + 50;
    					}
    				graphics.setColor(Color.darkGray);
					graphics.fillRect(j, i, 50, 50);
    					
    				}
	      	   }
    		}
       }
	
	        
    
	