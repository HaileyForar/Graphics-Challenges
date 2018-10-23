import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsChallenges4 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenges4 canvas = new GraphicsChallenges4();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			
	        graphics.setColor(Color.blue);
	        graphics.drawRect(550, 550, 400, 400);
	        
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(551, 551, 398, 398);

    		}
	}
