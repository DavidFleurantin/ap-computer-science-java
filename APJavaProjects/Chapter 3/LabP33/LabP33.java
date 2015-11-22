// Programmer: David Fleurantin
// Date:       October 17, 2014


 /**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
class SavingsAccount
{  
   /**
      Constructs a bank account with a balance and an interest rate of zero
   */
    private double balance;
   private double interestRate;
   
   public SavingsAccount()
   {   
      balance = 0;                                    
      interestRate = 0; 
   }

   /**
      Constructs a bank account with a given balance and intrest rate
      @param initialBalance the initialInterest
   */
   public SavingsAccount(double initialBalance, double initialInterest)
   {   
        balance      = initialBalance;  
        interestRate = initialInterest;  
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }
   
    /**
       Adds interest to the bank account.
       Void Method
   */
   public void addInterest()
{
      double interest = balance * interestRate / 100.0;
      balance = balance + interest;
   } 

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

  
}

// SavingsAccount Test (Public)

public class LabP33
{  
   public static void main(String[] args)
   {  
      SavingsAccount momsSavings = new SavingsAccount(1000,10);  // Instantiates Savings Account with Balance of 1000 and Intrest Rate of 10%
      
      momsSavings.addInterest();
      momsSavings.addInterest();
      momsSavings.addInterest();                   // Adds 10% interest 5 times
      momsSavings.addInterest();  
      momsSavings.addInterest();  
      
      double balance = momsSavings.getBalance();       // retrieves balance
      
      System.out.print("The balance is $");
      System.out.println(balance);
   }
}


