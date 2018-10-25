import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class GraphicsChallenge7 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge7 canvas = new GraphicsChallenge7();
	        JFrame frame = new JFrame();
	        frame.setSize(200, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			
    			for(int R = 0; R < 255; R++)
					{
						for(int G = 0; G < 255; G++)
							{
								for(int B = 0; B < 255; B++)
									{
										graphics.setColor(new Color(R, G, B));
										graphics.fillRect(50, 40, 100, 100);
										repaint();
									}
							}
		            }
    			
    			
    		}
	}