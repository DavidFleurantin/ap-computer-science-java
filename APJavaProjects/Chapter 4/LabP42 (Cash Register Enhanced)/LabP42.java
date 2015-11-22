 import javax.swing.JOptionPane;

 /**
   A cash register totals up sales and computes change due.
*/
class CashRegister
{
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
      count = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double newTotal = purchase + amount;
      purchase = newTotal;
      
      count++;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }

   public void enterDollars(int dollars)
   {
      payment = payment + dollars;
   }

   public void enterQuarters(int quarters)
   {
      payment = payment + quarters * QUARTER_VALUE;
   }

   public void enterDimes(int dimes)
   {
      payment = payment + dimes * DIME_VALUE;
   }

   public void enterNickels(int nickels)
   {
      payment = payment + nickels * NICKEL_VALUE;
   }

   public void enterPennies(int pennies)
   {
      payment = payment + pennies + PENNY_VALUE;
   }

   public int getItemCount()
   {
      int itemCount = count;
      
      return itemCount;
   }
   
   private double purchase;
   private double payment;
   private int count;

   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01; 
   
}
   public class LabP42 {
		
		public static void main(String [] args) {
		 
		CashRegister myCashRegister = new CashRegister();
		
			myCashRegister.recordPurchase(20.37);
			myCashRegister.enterDollars(20);
			myCashRegister.enterQuarters(2);
			myCashRegister.enterDollars(20);
			myCashRegister.enterQuarters(20);
			myCashRegister.recordPurchase(20.37);
			
			
			JOptionPane.showMessageDialog(null, "Number of Items: " + myCashRegister.getItemCount() );
			JOptionPane.showMessageDialog(null, "Your Change: " + myCashRegister.giveChange() );
			
			System.exit(0);
		}
		
	}




