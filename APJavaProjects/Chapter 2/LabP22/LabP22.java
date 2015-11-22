// Programmer: David Fleurantin
// Date: September 17, 2014

import java.awt.Rectangle;

public class LabP22 {
 
 public static void main(String[]args)
 {
   
  Rectangle box =  new Rectangle(5, 10,  20, 40);                              // Rectangle with height of 40 and width of 20
  System.out.print("The area of the box is ");
  System.out.print(box.getWidth() * 2 + box.getHeight() * 2);                // Perimeter calculated (20*2 + 40*2) 
  
 }

}
