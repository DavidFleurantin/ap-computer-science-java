 
import  javax.swing.JOptionPane;

class List {
	 
	// Instance variables
    double number1;
    double number2;
    
    
    // constructor
    public List(double x, double y) {
         number1 = x;
         number2  = y; 
    }
 
    //  Method
    public void floatChecker() {
    	if (Math.abs(number1 - number2) <= 0.01) {
    		JOptionPane.showMessageDialog (null, "They are the same when rounded to two decemial points");//typ gdk
    		
    	}
    	else {
    		JOptionPane.showMessageDialog (null, "They are different");
    	}
	 
    }
    
 
}

// Test Class

public class LabP614
{
    public static void main(String[] args) {
	
    String num1    = JOptionPane.showInputDialog("Enter First Number: ");
    double number1 = Double.parseDouble(num1);
    
	String num2    = JOptionPane.showInputDialog("Enter Second Number: ");
	double number2 = Double.parseDouble(num2);
	
	
	List userList = new List(number1, number2);
	
	userList.floatChecker();
    }
}