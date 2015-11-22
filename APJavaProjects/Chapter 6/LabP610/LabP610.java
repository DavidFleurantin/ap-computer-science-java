import  javax.swing.JOptionPane; 

class Sorter
{
	    // Instance Variables
	    private String string1;
	    private String string2;
	    private String string3;
	    private String string4;
	    
    // Constructor
    public Sorter(String w, String x, String y, String z)
    {
        string1 = w;
        string2 = x;
        string3 = y;
        string4 = z;
    }
    
    // method
    public void getMaxMin()
    {
        if ((string1.compareTo(string2) < 0) && (string1.compareTo(string3) < 0) && (string1.compareTo(string4) < 0))
        	JOptionPane.showMessageDialog (null, "The lexicographic mininum is " + string1);
        else 
        	if ((string2.compareTo(string1) < 0) && (string2.compareTo(string3) < 0) && (string2.compareTo(string4) < 0))
        		JOptionPane.showMessageDialog (null, "The lexicographic mininum is " + string2);
        else 
        	if ((string3.compareTo(string1) < 0) && (string3.compareTo(string2) < 0) && (string3.compareTo(string4) < 0))
            System.out.println("The lexicographic mininum is " + string3 + ".");
        else 
        	if ((string4.compareTo(string1) < 0) && (string4.compareTo(string2) < 0) && (string4.compareTo(string3) < 0))
        		JOptionPane.showMessageDialog (null, "The lexicographic mininum is " + string4);
        else
        	JOptionPane.showMessageDialog (null, "Not all inputs are different");
        if ((string1.compareTo(string2) > 0) && (string1.compareTo(string3) > 0) && (string1.compareTo(string4) > 0))
        	JOptionPane.showMessageDialog (null, "The lexicographic maximum is " + string1);
        else 
        	if ((string2.compareTo(string1) > 0) && (string2.compareTo(string3) > 0) && (string2.compareTo(string4) > 0))
        		JOptionPane.showMessageDialog (null, "The lexicographic maximum is " + string2);
        else 
        	if ((string3.compareTo(string1) > 0) && (string3.compareTo(string2) > 0) && (string3.compareTo(string4) > 0))
        		JOptionPane.showMessageDialog (null, "The lexicographic maximum is " + string3);
        else if ((string4.compareTo(string1) > 0) && (string4.compareTo(string2) > 0) && (string4.compareTo(string3) > 0))
        	JOptionPane.showMessageDialog(null, "The lexicographic maximum is " + string4);
        else
        	JOptionPane.showMessageDialog(null, "Not all inputs are different");
         
    }
    
}

// Test Class
        public class LabP610 {
        	 
            public static void main(String[] args) {
                
            	JOptionPane.showMessageDialog(null,  "Please Enter Four Strings" );
            	
                String string1    = JOptionPane.showInputDialog ( "Enter First String" ); 
               
                
                String string2    = JOptionPane.showInputDialog ( "Enter Second Second String" ); 
               
                
                String string3    = JOptionPane.showInputDialog ( "Enter Third String" ); 
               
                
                String string4    = JOptionPane.showInputDialog ( "Enter Third String" ); 
           
         
                Sorter numberList = new Sorter(string1, string2, string3, string4);
         
                 numberList.getMaxMin();
             
            }
    }
    
  
