  import javax.swing.JOptionPane;

 /**
   A cash register totals up sales and computes change due.
*/
class CoinStar
{
   /**
      Constructs a cash register with no money in it.
   */
   public CoinStar(int x)
   {
       cents = x;
       centsLeft = x;
   }

    

   /**
      *Computes the number of Dollars.
      *@return the # of Dollars
   */
   public int getDollars()
   {
      int numDollars =  (cents / DOLLAR_VALUE);
      
      centsLeft = cents % DOLLAR_VALUE;
      
      return numDollars;
   }
 
   
 /**
*Computes the number of quarters.
*@return the # of Quarters
*/
public int getQuarters()
{
int numQuarters =  (centsLeft / QUARTER_VALUE);

centsLeft = centsLeft % QUARTER_VALUE;

return numQuarters;

}
/**
 *Computes the number of dimes.
 *@return the # of Dimes
*/
public int getDimes()
{
int numDimes =  (centsLeft / DIME_VALUE);

centsLeft = cents % DIME_VALUE;

return numDimes;

}
/**
*Computes the number of nickels.
*@return the # of nickels
*/
public int getNickels()
{
int numNickels= (centsLeft / NICKEL_VALUE);

centsLeft = cents % NICKEL_VALUE;

return numNickels;

}
/**
*Computes the number of pennies.
*@return the # of pennies
*/
public int getPennies()
{
int numPennies=  (centsLeft);

return numPennies;

}

   private int cents;
   private int centsLeft;
    

   public static final int DOLLAR_VALUE = 100;
   public static final int QUARTER_VALUE = 25;
   public static final int DIME_VALUE = 10;
   public static final int NICKEL_VALUE = 5;
     
   
}


   public class CoinStarTest1 {
		
		public static void main(String [] args) {
			

			String input1 = JOptionPane.showInputDialog("How many coins do you have?");
			int userCentTotal = Integer.parseInt(input1);
		 
			CoinStar coinConverter = new CoinStar(userCentTotal);
			
			JOptionPane.showMessageDialog(null, "Coin Conversion In Process...");
			JOptionPane.showMessageDialog(null, "Coin Conversion In Process...");
			JOptionPane.showMessageDialog(null, "Coin Conversion In Process...");
			JOptionPane.showMessageDialog(null, "Coin Conversion In Process...");
			
			JOptionPane.showMessageDialog(null, "Your Dollars: "  +  coinConverter.getDollars());
			JOptionPane.showMessageDialog(null, "Your Quarters: " +  coinConverter.getQuarters());
			JOptionPane.showMessageDialog(null, "Your Dimes: "    +  coinConverter.getDimes());
			JOptionPane.showMessageDialog(null, "Your Nickels: "  +  coinConverter.getNickels());
			JOptionPane.showMessageDialog(null, "Your Pennies: "  +  coinConverter.getPennies());
			 
			
			JOptionPane.showMessageDialog(null, "Coin Conversion Complete!!!");
		
		 
		System.exit(0);
		}
		
	}



