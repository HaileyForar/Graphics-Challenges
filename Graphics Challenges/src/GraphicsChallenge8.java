import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsChallenge8 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge8 canvas = new GraphicsChallenge8();
	        JFrame frame = new JFrame();
	        frame.setSize(400, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		
	        for (int i = 0; i < 400; i++)
	        	{
		        graphics.setColor(Color.magenta);
		        graphics.fillRect(i, i, 20, 20);
		        
		        delay();
		        
		        graphics.setColor(Color.black);
		        graphics.fillRect(i, i, 20, 20);
		        
	        	}
    		}
    	
    	public void delay()
			{
	        try
					{
					Thread.sleep(50);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}
	