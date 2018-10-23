import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsChallenge5 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge5 canvas = new GraphicsChallenge5();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			
	        graphics.setColor(Color.yellow);
	        graphics.fillOval(10, 10, 300, 300);
	        
	        graphics.setColor(Color.blue);
	        graphics.fillRect(70, 70, 50, 50);
	        
	        graphics.setColor(Color.blue);
	        graphics.fillRect(200, 70, 50, 50);
	        
	        graphics.setColor(Color.pink);
	        graphics.fillOval(70, 170, 200, 50);
	        

    		}
	}