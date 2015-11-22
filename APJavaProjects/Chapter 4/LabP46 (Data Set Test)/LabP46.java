import javax.swing.JOptionPane;
import java.lang.Math.*;

/**
 DataSet
*/
 class DataSet
{
/**
   Constructs an empty data set.
*/
public DataSet(int num1, int num2, int num3, int num4)
{
   total = 0;
   count = 0;
   max = Math.max(num1, Math.max(num2, Math.max(num3, num4))); 
   min = Math.min(num1, Math.min(num2, Math.min(num3, num4))); 
}

/**
   Add the values
   @param x the value to be added
*/
public void addValue(int x)
{
   count= count + 1;
   total = total + x;
}

/**
   Computes the sum of the values.
   @return the sum of the values
*/
public int getLargest()
{
   return max;
}

/**
   Computes the average of the values.
   @return the average of the values
*/
public double getSmallest()
{
   return min;
}

/**
 Sum
*/
public int getSum()
{
return total;
}

/**
Average
*/
public double getAverage()
{
return (double) (total) / count;
}

private int total; 
private int count;
private int max;
private int min;
  
}


 public class LabP46 {
	
	public static void main(String [] args) {
		/**
	      User Input: First Number
	   */
		String input1 = JOptionPane.showInputDialog("Enter your first number");
		int firstNumber = Integer.parseInt(input1);
		
		/**
	      User Input: Second Number
	   */
		String input2 = JOptionPane.showInputDialog("Enter your second number");
		int secondNumber = Integer.parseInt(input2);
		
		/**
	      User Input: Third Number
	   */
		String input3 = JOptionPane.showInputDialog("Enter your third number");
		int thirdNumber = Integer.parseInt(input3);
		
		/**
	      User Input: Fourth Number
	   */
		String input4 = JOptionPane.showInputDialog("Enter your fourth number");
		int fourthNumber = Integer.parseInt(input4);
		/**
	      Pair Constructed
	   */
	 
		DataSet myDataSet = new DataSet(firstNumber, secondNumber, thirdNumber, fourthNumber);
		
		/**
	      Add Value
	   */

		
		  myDataSet.addValue(firstNumber);
	      myDataSet.addValue(secondNumber);
	      myDataSet.addValue(thirdNumber);
	      myDataSet.addValue(fourthNumber);
	      
	      
		
		/**
	      Output
	   */
 
		JOptionPane.showMessageDialog(null, "The Sum of the four numbers is: " + myDataSet.getSum());
		JOptionPane.showMessageDialog(null, "The Average of the four numbers is: " + myDataSet.getAverage() );
		JOptionPane.showMessageDialog(null, "The Largest of the four numbers is: " + myDataSet.getLargest());
		JOptionPane.showMessageDialog(null, "The Smallest of the four numbers is: " + myDataSet.getSmallest() );
		
		System.exit(0);
	}
	
}

