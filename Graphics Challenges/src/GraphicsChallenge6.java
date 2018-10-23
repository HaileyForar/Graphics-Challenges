import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class GraphicsChallenge6 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallenge6 canvas = new GraphicsChallenge6();
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
    			 System.out.println("Would you like to make a small square, or a big square, and would you like it to be red or blue?.");
    			 System.out.println("1 = Small -- 2 = Big");
    			 System.out.println("R = Red -- B = Blue");
    			 System.out.println("(Please enter in 1 or 2 with the corresponding letter for the color that you want your square to be.)");
				 Scanner userInput1 = new Scanner(System.in);
				int numberInserted = userInput1.nextInt();
				String letterInserted = userInput1.nextLine();
    		
				if(numberInserted == 1)
					{
	       
	                    graphics.fillRect(0, 0, 100, 100);
	     
    		        }
				
				else if(numberInserted == 2)
					{
						graphics.fillRect(0, 0, 300, 300);
					}
				
				String R =
					null;
				String B =
					null;
				if(letterInserted == R)
					{
						graphics.setColor(Color.red);
					}
				
				else
					{
						graphics.setColor(Color.blue);
					}
					
    		}
	}
	