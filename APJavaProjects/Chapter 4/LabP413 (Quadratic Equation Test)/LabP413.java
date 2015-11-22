  
import java.util.Scanner;
import javax.swing.JOptionPane;

 class QuadraticEquation
{
   /*
       
   */
   public QuadraticEquation(double coefficientA, double coefficientB, double coefficientC)
   {
      a = coefficientA;
      b = coefficientB;
      c = coefficientC;
     discriminant  = Math.sqrt(b * b -4 * a * c);  
 
   }

   /**
       
   */
   public double getSolution1()
   {
      return (-b + root) / (2 * a);
   }

   /**
      
   */
   public double getSolution2()
   {
      return (-b - root) / (2 * a);
   }

   private double a;
   private double b;
   private double c;
   private double discriminant;
private double root;



/**
    
 */
public class LabP413
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      String input1 = JOptionPane.showInputDialog("Please enter coefficient a:");
      int a = Integer.parseInt(input1);

      String input2 = JOptionPane.showInputDialog("Please enter coefficient b:");
      int b = Integer.parseInt(input2);

      String input3 = JOptionPane.showInputDialog("Please enter coefficient c:");
      int c = Integer.parseInt(input3);

      QuadraticEquation myEquation = new QuadraticEquation(a, b, c);

	  JOptionPane.showMessageDialog(null, "First Root:  " + myEquation.getSolution1());
      JOptionPane.showMessageDialog(null, "Second Root: " +  myEquation.getSolution2());
       
  
   }
}
