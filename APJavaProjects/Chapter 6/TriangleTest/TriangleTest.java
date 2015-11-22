import  javax.swing.JOptionPane;

class Triangle {

   // Instance variables
   private int side1, side2, side3;

   // Constructor to initialize the sides of the triangle.
   public Triangle (int s1, int s2, int s3) {
      side1 = s1;
      side2 = s2;
      side3 = s3;
   }
   
   // Method to test if sides produce triangle
   public boolean isTriangle() {
		if ((side1 > 0) && (side2 > 0) && (side3 > 0) && (side1 + side2 > side3) && 
				(side1 + side3 > side2) && (side2 + side3 > side1));
		return true;
			
   }
   
   public void notTriangle() {
		if (!(this.isTriangle()));
		side1 = 0; side2 = 0; side3 = 0;
		JOptionPane.showMessageDialog (null, "This is not a triangle");
  } 
   
   // Method to test for a right-angled triangle.
   public boolean isRightTriangle() {
      if (this.isTriangle())
    		if  ( (side1 > 0) && (side2 > 0) && (side3 > 0) && ((side1*side1) == ((side2*side2) + (side3*side3))) ||
          ((side2*side2) == ((side1*side1) + (side3*side3))) ||
          ((side3*side3) == ((side1*side1) + (side2*side2))))
         return true;
      else
         return false;
	return false;
   }
}

//Test Class

public class TriangleTest {

 public static void main(String[] args) {
     
	 Triangle testTriangle = new Triangle(3, 4, 5);          // 3, 4, 5, Test
	 
 	JOptionPane.showMessageDialog(null,  "Test of 3, 4, 5 Triangle");
 	
 	JOptionPane.showMessageDialog(null, "Is it a Triangle? : " + testTriangle.isTriangle());
 	JOptionPane.showMessageDialog(null, "Is it a Right-Triangle? : " + testTriangle.isRightTriangle());
 	
 	JOptionPane.showMessageDialog(null,  "Now Its Your Turn!!!");
 	
 	String num1    = JOptionPane.showInputDialog ( "Enter Side One" ); 
    int side1    = Integer.parseInt(num1);
 	
	String num2    = JOptionPane.showInputDialog ( "Enter Side Two" ); 
    int side2    = Integer.parseInt(num2);
    
	String num3    = JOptionPane.showInputDialog ( "Enter Side Three" ); 
    int side3    = Integer.parseInt(num3);
    
    Triangle userTriangle = new Triangle(side1, side2, side3);          // User Triangle Test
    
 if (userTriangle.isTriangle()) 	{
 JOptionPane.showMessageDialog(null, "Is it a Triangle? : " + userTriangle.isTriangle());
	JOptionPane.showMessageDialog(null, "Is it a Right-Triangle? : " + userTriangle.isRightTriangle());
 	
}
 else 
	 userTriangle.notTriangle();
    		
 	
 	
  
 }

}
