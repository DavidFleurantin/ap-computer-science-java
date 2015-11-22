// Programmer: David Fleurantin
// Date:       October 17, 2014

class Circle {

private double radius;						    		// Attributes						

public Circle()							 

{
	
	 radius = 0;									// Default Constructor							
}

public Circle(double r)					 
{
	
	
	 radius = r;									// Constructor (Radius given)
}



// Methods

// Retrieve Radius

public double getRadius()		
{


	return radius;
									 
}


// Reset Radius 

public void reSetRadius(double otherRadius)
{
	
	 radius = otherRadius;
}


// Retrieve Diameter

public double diameter()
{
    double diameter =  radius * 2;
	
	return diameter;
}

// Retrieve Area

public double area()
{

   double area = radius * radius * 3.14;
	

	return area;
}


// Retrieve Circumference

public double circumference()
{
   double 	circumference = 2 * radius * 3.14;
	
	return circumference;
}

// multiply Radius method

public void multiplyMyRadius(double k)
{
	
	 radius = radius * k;
}



// ShowData

public void showData()
{
	System.out.println("The radius of the Circle is: " + this.getRadius());
	
	System.out.println("The diameter of the Circle is: " + this.diameter());
	
	System.out.println("The area of the Circle is: " + this.area());
	
	System.out.println("The circumference of the Circle is: " + this.circumference());
}

// toString
	
	  public String toString() {
        return " Radius: " + this.getRadius()  + "Diameter: " + this.diameter() + "Area :" + this.area() 
        + "Circumference :" + this.circumference();  
        }
 
 
 // Copy Constructor
 
 public Circle (Circle x) 
 
  {
  	
  	this.radius = x.radius;
  }
}
	
	 
 


public class CircleTestStudentVersion
{
 public static void main(String args[])  
 {
   Circle c1 = new Circle(20);
   Circle c2 = new Circle(5);
   Circle c3 = new Circle(10);
   System.out.println( "The default circle's radius is "+ c1.getRadius()  );
   
   System.out.println("The second circle's radius is "+ c2.getRadius());
   System.out.println("The third circle's radius is "+ c3.getRadius());
   
   
   System.out.println("The default circle's diameter is "+ c1.diameter());
   
   System.out.println("The second circle's area is "+ c2.area());
   System.out.println("The third circle's circumference is "+ c3.circumference());
   
   
   //Write a void method to print the circle's attributes
   c1.showData();
   c2.showData();
   c3.showData();
   
   c1.multiplyMyRadius(3);
   c2.multiplyMyRadius(3);
   c3.multiplyMyRadius(3);
   c1.showData();
   c2.showData();
   c3.showData();
// reset the radius
   c1.reSetRadius(8);
   System.out.println("Having set the default circle's radius to 8, the circumference of c1 is:"+ c1.circumference());


 // toString Method 
 
 
    System.out.println("Details of c2 (toString) "  + c2.toString());
 }
 
} 



