// Programmer: David Fleurantin
	// Date: September 17, 2014

import TurtleGraphics.StandardPen;

import java.awt.Color;
 

public class drawInitials {

	public static void main(String[] args) {
		
		StandardPen mypen = new StandardPen();
	    
		   mypen.down();
		   mypen.move(200);
	 	   mypen.move(100, 150);
	 	   mypen.move(0,100);
	      


	mypen.setColor(Color.red);
	
mypen.home();
	 	   mypen.down();
	 	   mypen.move(100);
	 	   mypen.move(75, 100);
	 	   mypen.home();
	 	   mypen.down();
	 	   mypen.move(50);
	 	   mypen.move(50,50);

	mypen.setColor(Color.green);
	 
	         
	mypen.drawString(" Programmmer: David Fleurantin ");    

	    }
	}



