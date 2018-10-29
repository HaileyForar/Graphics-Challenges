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
	        frame.setSize(400, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
		
    		}
// 
//    	public void paint(Graphics graphics) 
//    		{
//    		int j = 0;
//	        for (int i = 200; i < 380; i++)
//	        	{
//		        graphics.setColor(Color.green);
//		        graphics.fillRect(i, j, 20, 20);
//		        
//                delay();
//                
//                graphics.setColor(Color.black);
//		        graphics.fillRect(i, j, 20, 20);
//		        j++;
//	        	}
//	        
//            for (int i = 380; i > 200; i--)
//        	    {
//	            graphics.setColor(Color.green);
//	            graphics.fillRect(i, j, 20, 20);
//	        
//               delay();
//            
//                graphics.setColor(Color.black);
//	            graphics.fillRect(i, j, 20, 20);
//	            j--;
//        	    }
//	        }
    	
    	public void paint(Graphics graphics) 
		{
		
        for (int i = 0; i < 380; i++)
        	{
	        graphics.setColor(Color.green);
	        graphics.fillRect(i, 200, 20, 20);
	        
            delay();
            
            graphics.setColor(Color.black);
	        graphics.fillRect(i, 200, 20, 20);
	      
        	}
        
        for (int i = 380; i > 0; i--)
    	    {
            graphics.setColor(Color.green);
            graphics.fillRect(i, 200, 20, 20);
        
           delay();
        
            graphics.setColor(Color.black);
            graphics.fillRect(i, 200, 20, 20);
    	    }
        }
	



    	
   public void delay()
	{
    try
			{
			Thread.sleep(20);
			} catch (InterruptedException e)
			{
			e.printStackTrace();
			}
    			}
	}
    	