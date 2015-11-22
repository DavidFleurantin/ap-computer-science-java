// Programmer: David Fleurantin
// Date: Novemeber 8, 2014

import java.lang.Math.*;
import javax.swing.JOptionPane;

 /**
   Pair Class 
*/
 class Pair
{
   /**
      Constructs a Pair with two numbers
   */
   public Pair(double aFirst, double aSecond)
   {
      num1 = aFirst;
      num2 = aSecond;
   }

   /**
   Computes Sum
*/
   public double Sum()
   {
      double sum = num1 + num2;
      
      return sum;
   }
  
   /**
   Computes Difference
*/
   public double Difference()
   {
      double difference = num1 - num2;
      
      return difference;
   }
   
   /**
   Computes Product
*/
   public double Product()
   {
      double product = num1 * num2;
      
      return product;
   }
   
   /**
   Computes Average

*/
   public double Average()
   {
      double average = (num1 + num2) / 2;
      
      return average;
   }
   
   /**
   Computes Distance
*/
   public double Distance()
   {
      double distance = Math.abs(num1 - num2);
      
      return distance;
      
   }

   /**
   Maximum of two Numbers
*/
   public double Maximum()
   {
      double max = Math.max(num1, num2);
      
      return max;
   }

   /**
   Minimum of two Numbers
*/
   public double Minimum()
   {
      double min = Math.min(num1, num2);
      
      return min;
   }
   
   /**
    Private Instance Fields
*/
   
   private double num1;
   private double num2;
 
}
 
public class LabP44 {
	
	public static void main(String [] args) {
		/**
	      User Input: First Number
	   */
		String input1 = JOptionPane.showInputDialog("Enter your first number");
		double firstNumber = Double.parseDouble(input1);
		
		/**
	      User Input: Second Number
	   */
		String input2 = JOptionPane.showInputDialog("Enter your second number");
		double secondNumber = Double.parseDouble(input2);
		
		/**
	      Pair Constructed
	   */
		Pair userNumbers = new Pair(firstNumber, secondNumber);
		
		/**
	      Arithmetic
	   */
		double sum = userNumbers.Sum();
		double difference = userNumbers.Difference();
		double product = userNumbers.Product();
		double average = userNumbers.Average();
		double distance = userNumbers.Distance();
		double max = userNumbers.Maximum();
		double min = userNumbers.Minimum();
		
		/**
	      Output
	   */
		JOptionPane.showMessageDialog(null, "The Sum of the two numbers is: " + sum );
		JOptionPane.showMessageDialog(null, "The Difference of the two numbers is: " + difference );
		JOptionPane.showMessageDialog(null, "The Product of the two numbers is: " + product );
		JOptionPane.showMessageDialog(null, "The Average of the two numbers is: " + average);
		JOptionPane.showMessageDialog(null, "The Distance of the two numbers is: " + distance);
		JOptionPane.showMessageDialog(null, "The Maximum of the two numbers is: " + max);
		JOptionPane.showMessageDialog(null, "The Minimum of the two numbers is: " + min );
		
		System.exit(0);
	}
	
}

