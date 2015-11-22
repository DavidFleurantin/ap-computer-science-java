/**
   This class prints out all the prime numbers of an input value.
*/

import javax.swing.JOptionPane; 

 class PrimeGenerator
{
   public PrimeGenerator()
   {
      current = 1;
   }

   /**
      Calculate the next prime number of an input.
      @return the next prime number
   */
   public int nextPrime()
   {
      do
      {
         current++;
      }
      while (!isPrime());

      return current;
   }

   public boolean isPrime()
   {
      if (current <= 1)
         return false;
      if (current > 2 && current % 2 == 0)
         return false;
      
      for (int i = 3; i * i <= current; i = i + 2)
         if (current % i == 0)
            return false;

      return true;
   }

   private int current;
}




/**
   Test driver class for PrimeGenerator class.
*/
public class LabP711
{
   public static void main (String[] args)
   {
       
	   String limit = JOptionPane.showInputDialog ( null, "Enter upper limit: ");
      int userLimit = Integer.parseInt(limit);

      PrimeGenerator userGen = new PrimeGenerator();

      boolean done = false;
      while (!done)
      {
         int prime = userGen.nextPrime();
         if (prime > userLimit)
            done = true;
         else
            System.out.println(prime);
      }
   }
}