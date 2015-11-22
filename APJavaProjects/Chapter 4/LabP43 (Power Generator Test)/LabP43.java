 
/**
   A PowerGenerator computes a number to the tenth power
*/

class PowerGenerator
{
   /**
      Constructs a power generator
       
   */
   public PowerGenerator(int aFactor)
   {
      number = 1;
      power = aFactor;
   }

   /**
       
   */
   public double nextPower()
   {
      number = number * power;
      return number;
   }

   private double number;
   private int power;
}

/**
    
*/
public class LabP43
{
   public static void main(String[] args)
   {
      PowerGenerator myGenerator = new PowerGenerator(10);

      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long)  myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long) myGenerator.nextPower());
      System.out.println( (long)  myGenerator.nextPower());
   }
   
   }