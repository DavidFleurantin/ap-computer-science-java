import javax.swing.JOptionPane;

import java.lang.Math.*;

/**
Pair Class 
*/
class Square
{
/**
   Constructs Square with a length
*/
public Square(double userLength)
{
   length = userLength;
}

/**
Computes Area
*/
public double Area()
{
   double area = Math.pow(length, 2);
   
   return area;
}

/**
Computes Perimeter
*/
public double Perimeter()
{
   double perimeter = length * 4;
   
   return perimeter;
}
/**
Computes Length of Diagonal
*/
public double LengthOfDiagonal()
{
   double lengthOfDiagonal= Math.sqrt(2) * length;
   
   return lengthOfDiagonal;
}

 

/**
 Private Instance Fields
*/

private double length;
 

}
 public class LabP410 {
	
	public static void main(String [] args) {
		/**
	      User Input: Square Length
	   */
		String input1 = JOptionPane.showInputDialog("Enter the length of the sides of your square");
		double length = Double.parseDouble(input1);
		
		/**
	      Square Constructed
	   */
		 
		Square mySquare = new Square(length);
		
		/**
	      Arithmetic
	   */
		double area = mySquare.Area();
		double perimeter = mySquare.Perimeter();
		double lengthOfDiagonal = mySquare.LengthOfDiagonal();
		
		/**
	      Output
	   */
		JOptionPane.showMessageDialog(null, "The Area of your square with length " + length +" is: "  + area );
		JOptionPane.showMessageDialog(null, "The Perimeter of your square with length " + length +" is: "  + perimeter );
		JOptionPane.showMessageDialog(null, "The Length of the Diagonal of your square with length " + length +" is: "  + lengthOfDiagonal );
		JOptionPane.showMessageDialog(null, "The ROUNDED Length of the Diagonal of your square with length " + length +" is: "  + Math.round(lengthOfDiagonal)); 
		System.exit(0);
	}
	
}

