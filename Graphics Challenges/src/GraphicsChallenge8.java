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
	        frame.setSize(800, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		
	        graphics.setColor(Color.pink);
	        graphics.fillOval(0, 0, 200, 100);
	        
	        graphics.setColor(Color.pink);
	        graphics.fillRect(795, 395, 200, 100);
	        
	        graphics.setColor(Color.white);
	        graphics.drawLine(40, 30, 330, 380);
	        
	        for (int i = 0; i < 350; i++)
	        	{
		        graphics.setColor(Color.green);
		        graphics.fillRect(300, i, 50, 50);
		        
		        delay();
		        
		        graphics.setColor(Color.black);
		        graphics.fillRect(300, i, 50, 50);
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
	