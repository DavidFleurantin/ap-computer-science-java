import javax.swing.JOptionPane;

 /**
   This class prints out all the factors of an input value.
*/
 class FactorGenerator
{
   /**
      Creates a FactorGenerator object used to determine the factor of
      an input value.
      @param aNum is the input value
   */
   public FactorGenerator(int aNum)
   {
      num = aNum;
      factor = 2;
   }

   /**
      Determine whether or not there are more factors.
      @return true there are more factors
   */
   public boolean hasMoreFactors()
   {
      while (factor <= num && num % factor != 0)
         factor++;
      return factor <= num;
   }

   /**
      Calculate the next factor of a value.
      @return factor the next factor
   */
   public int nextFactor()
   {
      if (!hasMoreFactors())
         return 0;
      num = num / factor;
      return factor;
   }

   private int num;
   private int i;
   private int factor;
}
 

 /**
    Prints the factors of an integer.
 */
 public class LabP710
 {
    public static void main (String[] args)
    {
      
    	String number = JOptionPane.showInputDialog ( null, "Enter an integer: ");
       int userNumber = Integer.parseInt(number);

       FactorGenerator generator = new FactorGenerator(userNumber);

       while (generator.hasMoreFactors())
          System.out.println(generator.nextFactor());
    }
 }
