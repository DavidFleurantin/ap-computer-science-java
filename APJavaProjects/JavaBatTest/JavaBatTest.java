//Programmer: David Fleurantin
//Date      : February 23, 2015

import java.util.Arrays;

class JavaBat{
 
/** countEvens
 * 
 * @param nums
 * @return all even numbers
 */
	
	public static int countEvens(int[] nums) {
		  
		  int answer = 0;
		  int target = 0;
		  
		  for (int i = 0; i <nums.length; i++)
		  {
		  
		  if (nums[i] % 2 == target)
		        {answer++;}
		  }
		  
		  return answer;
		  
		}
		
/** bigDiff
 * 
 * @param nums
 * @return difference between max and min
 */
	
	public static int bigDiff(int[] nums) {
		  
		  int max = nums[0];
		  
		  int min = nums[0];
		  
		  for(int i = 0; i < nums.length; i++)
		  
		     if(nums[i] > max) {max = nums[i];}
		     
		     else 
		         if(nums[i] < min) {min = nums[i];}
		     
		      return (max-min);
		  	  
		} 

/** centeredAverage
 * 
 * @param nums
 * @return the mean excluding the max and min and repeated numbers
 */
	
	public static int centeredAverage(int[] nums) {
		  
	    int max = nums[0];
	    int min = nums[0];
	    int sum = 0;
	    int average = 0;
	 
	    for (int i = 0; i < nums.length; i++) 
	    {
	        sum = sum + nums[i];
	        if (nums[i] > max) {max = nums[i];}
	        else
	           if (nums[i] < min) {min = nums[i];}
	    }
	    
	    if (sum != 0) 
	     { average = (sum - (max + min)) / (nums.length - 2); }
	      
	     return average;
	    
	  
	}
	
/** sum13
 * 	
 * @param nums
 * @return the sum excluding 13
 */
	
	public static int sum13(int[] nums) {
		   
		   int sum = 0;
		  
		  for (int i = 0;i <nums.length ;i++)
		  {
		  
		  if (nums[i] != 13)
		        sum = sum + nums[i];
		  
		  else 
		      if (nums[i] == 13 && i < nums.length -1 )
		         {
		            nums[i]=0;
		            nums[i+1] =0; }
		         }
		  return sum;
		}
	
/** shiftedLeft
 * 
 * @param nums
 * @return a shifted array
 */
	
	public static int[] shiftLeft(int[] nums) {
		  
		 int[] shiftedNums;
		 shiftedNums  = new int[nums.length];
		   
		  if (nums.length == 0) {
		        
		        return shiftedNums;
		  }
		   
		  for (int i = 0; i < nums.length-1; i++) {
		    
		       shiftedNums[i] = nums[i+1];
		  }
		  
		  if (nums.length > 1)
		       shiftedNums[0] = nums[1];
		       shiftedNums[nums.length-1] = nums[0];
		       return shiftedNums;  
		}
	
/** maxOf
 * 
 * @param nums
 * @return the max
 */
	
	public static int maxOf(int[] nums) {
		  
		  int max = nums[0];
		
		  
		  for (int i = 0; i <nums.length; i++)
		  {
		  
		  if (nums[i] > max)
		        {max = nums[i];}
		  }
		  
		  return max;
		  
		}
	
/** minOf
 * 
 * @param nums
 * @return the min
 */
	
	public static int minOf(int[] nums) {
		  
		  int min = nums[0];
		   
		  
		  for (int i = 0; i <nums.length; i++)
		  {
		  
		  if (nums[i] < min)
		        {min = nums[i];}
		  }
		  
		  return min;
		  
		}	
 
}// end class 

public class JavaBatTest{
public static void main(String args[]) //throws IOException
{     int []numSet={12,3,5,6,13,13,50,8,0};
 
//  write the code to print out the original array
System.out.println("The original array is: " + Arrays.toString(numSet));
 
System.out.println("Number of Evens: " + JavaBat.countEvens(numSet));
System.out.println("The difference between " + JavaBat.maxOf(numSet) + " and " + JavaBat.minOf(numSet) + " is "+ JavaBat.bigDiff(numSet));
System.out.println("The Centered average is "+JavaBat.centeredAverage(numSet));
System.out.println("Without 13 the sum is: "+JavaBat.sum13(numSet));
int[] answer= JavaBat.shiftLeft(numSet);
for (int e:answer)
{System.out.println("shifted is: "+ e); 
}

//write code to print out answer
System.out.println("The shifted array is: " + Arrays.toString(answer));

}//end main
}    

 