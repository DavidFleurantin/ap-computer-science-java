 /**
   Class used to generate a Fibonacci number with a given input.
*/

 import javax.swing.JOptionPane; 

 class FibonacciGenerator
{
   /**
      Construct a FibonacciGenerator object to generate a Fibonacci number.
   */
   public FibonacciGenerator()
   {
      fOld1 = 1;
      fOld2 = 1;
      fNew = 1;
   }

   /**
      Method used to calculate a fibonacci number.
      @return fNew the fibonacci number
   */
   public int nextNumber()
   {
      fNew = fOld1 + fOld2;

      fOld2 = fOld1;
      fOld1 = fNew;

      return fNew;
   }

   private int fOld1;
   private int fOld2;
   private int fNew;
}



/**
   Test driver class for FibonacciGenerator class.
*/
public class LabP75
{
   public static void main(String[] args)
   {
      
      String number;
      
	   number = JOptionPane.showInputDialog ( null, "Enter n:");
    
      int userNumber = 0;

	   while(true)
{
	   userNumber = Integer.parseInt(number);
      FibonacciGenerator userGen = new FibonacciGenerator();

      int next = 0;
if (userNumber == -9999)
	{break;}

      else if (userNumber <= 2)
         next = 1;
      else
      {
         for (int i = 3; i <= userNumber; i++)
            next = userGen.nextNumber();
        
      }

      JOptionPane.showMessageDialog ( null, "fib(" + userNumber + ") = " + next);
      number = JOptionPane.showInputDialog ( null, "Enter n:");
   }
}
}
