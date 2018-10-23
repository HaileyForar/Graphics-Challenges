import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsChallenge1 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge1 canvas = new GraphicsChallenge1();
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
    			
	        graphics.setColor(Color.pink);
	        graphics.drawLine(400, 0, 0, 400);
	        
	        graphics.setColor(Color.pink);
	        graphics.drawLine(0, 0, 400, 400);

    		}
	}