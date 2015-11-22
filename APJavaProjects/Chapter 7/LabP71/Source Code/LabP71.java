/**
   David Fleurantin
   January 16, 2014
*/

 import javax.swing.JOptionPane; 
 
 class Converter
{
	 private double rate;
	 
   /**
      Converter class constructor
      @param aRate the exchange rate
   */
   public Converter(double aRate)
   {
      rate = aRate;
   }

   /**
      Convert Dollars to Euro
      @param amount the amount to convert
   */
   public double convert(double amount)
   {
      double coinExchange = rate * amount;

      return coinExchange;
   }

   
} // End Class


 /**
    Test Class
 */
 public class LabP71
 {
    public static void main (String[] args)
    {
       
    String rate = JOptionPane.showInputDialog ( null, "Please a desired exchange rate between Dollars(US) and Euros: " );
    
       double userRate = Double.parseDouble(rate);

       Converter userConverter = new Converter(userRate);

       boolean completed = false;
       while (!completed)
       { 
    	   String input = JOptionPane.showInputDialog ( null, "Please enter the amount in US$ to be converted (Q to quit): ");
          

          if (input.equalsIgnoreCase("Q"))
             completed = true;
          else
          {
             double amount = Double.parseDouble(input);

             if (amount > 0)
             {
                double Coinexchange = userConverter.convert(amount);
                JOptionPane.showMessageDialog ( null, "The conversion to Euro is: " + Coinexchange + " Euro");
             }
             else
                completed = true;
          }
       }
    }
 } // End Class