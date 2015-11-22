// Programmer: David Fleurantin
// Date: December 8, 2014


import  javax.swing.JOptionPane;
 
 class FloatSorter {
 
	   
	    // Instance variables
	    double num1;
	    double num2;
	    double num3;
	    String sorted;
 
    // constructor
    public FloatSorter(double number1, double number2, double number3) {
        num1 = number1;
        num2 = number2;
        num3 = number3;
    }
 
    // Sort Method
    public String Sort() {
        double temp = 0;
        if (num1 > num2) {  
            temp = num2;   
            num2 = num1;
            num1 = temp;
        }
        if (num2 > num3) {  
            temp = num3;    
            num3 = num2;
            num2 = temp;
        }
        if (num1 > num2) { 
            num2 = num1;
            num1 = temp;
        }
 
        sorted = num1 + "\n" + num2 + "\n" + num3;
        return sorted;
    }
 
}
 
// Test Class
 
 public class LabP64 {
 
    public static void main(String[] args) {
        
    	JOptionPane.showMessageDialog(null,  "Please Enter Three Floating-Point Numbers" );
    	
        String num1    = JOptionPane.showInputDialog ( "Enter First Number" ); 
        double number1 = Double.parseDouble(num1);
        
        String num2    = JOptionPane.showInputDialog ( "Enter Second Number" ); 
        double number2 = Double.parseDouble(num2);
        
        String num3    = JOptionPane.showInputDialog ( "Enter Third Number" ); 
        double number3 = Double.parseDouble(num3);
 
        FloatSorter numberList = new FloatSorter(number1, number2, number3);
 
        JOptionPane.showMessageDialog (null, "The inputs in sorted order are: " + "\n" + numberList.Sort ());
     
    }
 
}