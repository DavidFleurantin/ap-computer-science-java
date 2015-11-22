
/**
   This class determines the number of days in a month.
*/

import  javax.swing.JOptionPane;



 class Month
 
 
{
   /*
    * Creates a Month object to determine the number of days in a month.
    * @param aMonth is the month in numeric format to determine the number of days
   */
   
   // Instance Field
	private int month;


   public Month(int userMonth)
   {
      month = userMonth;
   }

   /*
    * Method to get the number of days in the month.
    * @return the days in the tested month
   */
   public int getDays()
   {
      int days;

      if (month == 4 || month == 6 || month == 9 || month == 11)
         days = 30;
      else if (month == 2)
         days = 28;
      else if (1 <= month && month <= 12)
         days = 31;
      else
         days = -1;

      return days;
   }

   
}


/*
 * This is a test class for Month class.
*/
public class LabP613
{
   public static void main(String[] args)
   {
	   String month     = JOptionPane.showInputDialog ( "Please Enter a Month in Integer Form" ); 
       int inputMonth   = Integer.parseInt(month);

      Month m = new Month(inputMonth);

      int days = m.getDays();

    	  JOptionPane.showMessageDialog(null, days + " days");
   }
}



