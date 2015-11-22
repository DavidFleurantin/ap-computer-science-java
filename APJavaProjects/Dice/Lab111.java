
// The Dice class allows you to roll a die randomly
 
 
import java.util.Random;
import javax.swing.JOptionPane;


    
  class DataSet
{
   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
      sum = 0;
      count = 0;
      maximum = 0;
   }

   /**
      Adds a data value to the data set
      @param x a data value
   */
   public void add(double x)
   {
      sum = sum + x;
      if (count == 0 || maximum < x) maximum = x;
      count++;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public double getMaximum()
   {
      return maximum;
   }

   private double sum;
   private double maximum;
   private int count;
}


// End Class


  class Die implements Measurable
{
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
   }

   /**
      Simulates a throw of the die
      @return the face of the die 
   */
   public double getMeasure()
   {
      return cast;
      
   }
   
   
    /**
      Measur
      @return the face of the die 
   */
   public void cast()
   {
      cast = 1 + generator.nextInt(sides);
      
   }
   
   private Random generator;
   private int sides;
   private double cast;
}




public class Lab111
{
   public static void main (String[] args)
   {
     
     
     
     String sides = JOptionPane.showInputDialog ( null, "Please Select The Number of Sides on Each Die: " );
    
       final int NUMBER_OF_SIDES = Integer.parseInt(sides);
       
     String rolls = JOptionPane.showInputDialog ( null, "Please Select How Many Time You Want to Roll: " );
    
        final int NUMBER_OF_TRIES = Integer.parseInt(rolls);
       
         
	 
	
	 
	
	 
	 DataSet diceData = new DataSet();
	 

	 
	 for (int i = 1; i <= NUMBER_OF_TRIES; i++)
	 
	 {
	 	Die myDice = new Die(NUMBER_OF_SIDES);
	 	myDice.cast();
	 	double temp = myDice.getMeasure();
	 	System.out.println("Die " + i + ": " + temp + "\n");
	 	diceData.add(temp); 	
	 	
	 }
	  
	  System.out.println("Your Average Roll: " + diceData.getAverage() + "\n");
	  
	  
      }
   }



 interface Measurable
{
   /**
      Computes the measure of the object.
      @return the measure
   */
   double getMeasure();
}
