
// The Dice class allows you to roll a die randomly
 
 
import java.util.Random;
    
public class Dice
{
    // instance variables /private attributes
    private int rollCount;
    private int sides;
    private Random rand;
    private int currentSide;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        rollCount = 0;
        sides = 6;
        rand = new Random();
        roll();
    }

    public Dice(int n)
	{
		rollCount = 0;
		sides = n;
		rand = new Random();
		roll();
	}
    /**
     * Method roll will return a random roll of the die
     * 
     * @return    random integer from 1 to the number of sides 
     */
    public void roll()
    {
          rollCount++;
          currentSide=rand.nextInt(sides) + 1;
    }
    
    /**
     * Method currentSide will return current face showing on die
     * 
     * @return   current side showing 
     */
    public int getCurrentSide()
    {
          return currentSide;
    }
     /**
     * Method numSides will return number of sides on die
     * 
     * @return   number of sides 
     */
    public int numSides()
    {
          return sides;
    }
    
    /**
     * Method numRolls will return number of rolls of the die
     * 
     * @return   number of rolls 
     */
    public int numRolls()
    {
          return rollCount;
    }
    
    /**
     * Method toString will return 
     * 
     * @return    number of sides, current side and the rollcount
     */
    public String toString()
    {
          return "This dice has "+ sides+" sides and has been rolled "+ rollCount+ " times\n its current value is "+currentSide;
    }
}
