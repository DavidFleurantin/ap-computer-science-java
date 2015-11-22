import javax.swing.JOptionPane;

class DigitExtractor{  
 
/** 
Constructs a digit extractor that gets the digits in reverse order. 
@param anInteger - the integer to break up into digits 
*/  
public DigitExtractor(int anInteger){  
number = anInteger;  
}  
/** 
Returns the next digit to be extracted. 
@return the next digit 
*/  
public int nextDigit()
{  

	int temp = -1;  
// != does not equal
	if(number!=0)  
{  
temp = number % 10;  
number = number / 10;  
}  
 
return temp;  
	}  


/**
 Private Instance Fields
*/
int number; 

} 
 
public class LabP412 {
	
	public static void main(String [] args) {
		/**
	      User Input:  Number (5 digits)
	   */
		String input1 = JOptionPane.showInputDialog("Enter your number");
		int number = Integer.parseInt(input1);
		
		DigitExtractor userNumber = new DigitExtractor(number);
		
		 
		
		/**
	      Output
	   */
		JOptionPane.showMessageDialog(null, "Ones Digit: " + userNumber.nextDigit());
		JOptionPane.showMessageDialog(null, "Tens Digit: " + userNumber.nextDigit());
		JOptionPane.showMessageDialog(null, "Hundreds Digit: " + userNumber.nextDigit());
		JOptionPane.showMessageDialog(null, "Thousands Digit: " + userNumber.nextDigit());
		JOptionPane.showMessageDialog(null, "Ten Thousands Digit: " + userNumber.nextDigit());
		 
		
		System.exit(0);
		
	}
	
}


