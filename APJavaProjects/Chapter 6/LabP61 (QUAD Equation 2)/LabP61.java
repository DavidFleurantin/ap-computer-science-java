// Programmer: David Fleurantin
// Date November 21, 2014



import javax.swing.JOptionPane; 
 import java.lang.Math;
 
class QuadraticEquation
 {
   /*
    *Constructs a quadratic equation and get 2 solutions.
    *@param coefficientA coefficient a of quadratic equation
    *@param coefficientB coefficient b of quadratic equation
    *@param coefficientC coefficient c of quadratic equation
   */
   public QuadraticEquation(double coefficientA, double coefficientB, double coefficientC)
   {
      a = coefficientA;
      b = coefficientB;
      c = coefficientC;
      discriminant = b * b - 4 * a * c;
   }

   /*
    *Returns the first solution to the quadratic equation.
    *@return the first solution
   */
   public double getSolution1()
   {
      return (-b + Math.sqrt(discriminant)) / (2 * a);
   }

   /*
    *Returns the second solution to the quadratic equation.
    *@return the second solution
   */
   public double getSolution2()
   {
      return (-b - Math.sqrt(discriminant)) / (2 * a);
   }

   /*
    *Determines if there is a solution or not.
    *@return true if there is a solution
   */
   public boolean hasSolutions()
   {
      return discriminant > 0;
   }

   private double a;
   private double b;
   private double c;
   private double discriminant;
}


/**
    Test Class
 */
public class LabP61
{
   public static void main(String[] args)
   {
     
      
      	String input1 = JOptionPane.showInputDialog("Enter A");
		int a = Integer.parseInt(input1);

		String input2 = JOptionPane.showInputDialog("Enter B");
		int b = Integer.parseInt(input2);

		String input3 = JOptionPane.showInputDialog("Enter C");
		int c = Integer.parseInt(input3);

      	QuadraticEquation myEquation = new QuadraticEquation(a, b, c);

      		if(myEquation.hasSolutions())
      			
      			{
    				JOptionPane.showMessageDialog(null , "Root 1 : " + myEquation.getSolution1());
    				JOptionPane.showMessageDialog(null , "Root 2 : " + myEquation.getSolution2());
      			}
      		
      		else
    	 		 {	
    	  			JOptionPane.showMessageDialog(null , "There are no real solutions");
    	  		 }
   }
}