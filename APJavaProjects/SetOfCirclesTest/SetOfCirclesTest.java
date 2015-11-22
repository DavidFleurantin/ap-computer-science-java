 
 class Circle {

	private int radius;
	 
	
	public Circle(int userRadius){
	
		 radius = userRadius;
	}
	
	
	
	public int getArea()
	{
		int area = (int) (Math.PI * radius * radius);
		
		return area;
	}
	
	public String toString()
	
	{
		
		return "The radius of the Circle is " + radius;
	}
}

public class SetOfCirclesTest

{
	
	public static void main(String[] args)
	
	{
		
	Circle[] setOfCircles = new Circle[20];
		

		for (int i=0; i < setOfCircles.length; i++)  
	 
		{
			int randomNum = 0 + (int)(Math.random()*19); 
			setOfCircles[i] = new Circle(randomNum);
		}
			
		for (Circle elt : setOfCircles) 
		{
		    System.out.println(elt);
		} 
		
		
		System.out.println("Largest Area: " + findLargest(setOfCircles) );
 
	}
	
	public static Circle findLargestIndex(Circle [] OfCircles){
		
		int largestI = 0;
		
		for (int i = 0; i <OfCircles.length; i++)
		  {
		  
		 if(OfCircles[i].getArea() > OfCircles[largestI].getArea())
		 {largestI = i;}
		 
		  }
		  
		  return OfCircles[largestI];
			
			}
	
	
	
	public static Circle findLargest(Circle [] OfCircles){
	
	Circle largest = OfCircles[0];
	
	for (int i = 0; i <OfCircles.length; i++)
	  {
	  
	 if(OfCircles[i].getArea() > largest.getArea())
	 {largest = OfCircles[i];}
	 
	  }
	  
	  return largest;
		
		}
	
	
	
	
	
	
}
