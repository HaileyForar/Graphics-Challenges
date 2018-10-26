import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsChallenge9 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge9 canvas = new GraphicsChallenge9();
	        JFrame frame = new JFrame();
	        frame.setSize(800, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		 
	        for (int i = 0; i < 350; i++)
	        	{
		        graphics.setColor(Color.green);
		        graphics.fillRect(300, i, 50, 50);
		        
	        	}
    		}
	
    	
    		public void moveBox(int dx, int dy)
    			{
    				int xLeft =
						0;
					if(xLeft < 0 || xLeft > 400)
    					{
    						dx = -dx;
    					}
    				xLeft = xLeft + dx;
    				
    			}
    	}