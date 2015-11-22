 /**
   This class finds the letter representation of a numeric grade.
*/
 import javax.swing.JOptionPane; 

 class Grade
{
   /**
      Constructs a letter grade.
      @param numericGrade the numeric grade given by user
   */
   public Grade(double numericGrade)
   {
      input = numericGrade;
   }

   /**
      Find the letter grade from a numeric grade.
      @return grade the letter grade
   */
   public String getLetterGrade()
   {
      String letter = "";
      String sign= "";

      if (input >= 0 && input <= 4.0)
      {
         if (input >= 3.5 )
            letter = "A";
         else 
         	if (input >= 2.5 )
            	letter = "B";
         else 
         	if (input >= 1.5 )
            	letter = "C";
         else 
         	if (input >= 0.5 )
            	letter = "D";
         else
            letter = "F";
      }
      else
         letter = " Not a Valid Input";

      double remainder = input - (int) input;

      if ((0.5 <= remainder) && (remainder < 0.85))
         sign = "-";
         
      else 
      		if ((0.15 <= remainder) && (remainder < 0.5) || (remainder == 0))
         sign = "+";

      return letter + sign;
   }

   private double input;
}

/**
    Tets CLass
*/
public class LabP69
{
   public static void main(String[] args)
   {
       
       String userInput = JOptionPane.showInputDialog(null, "Enter a Numeric Grade Here ");
	   double numGrade = Double.parseDouble(userInput);

      Grade g = new Grade(numGrade);

      JOptionPane.showMessageDialog(null, "Letter Grade: " + g.getLetterGrade());
   }
}