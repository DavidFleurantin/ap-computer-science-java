// Programmer: David Fleurantin
// Date:       October 17, 2014

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
class SavingsAccount
{  
   /**
      Constructs a bank account with a balance of zero
   */
    private double balance;
   private double interestRate;
   
   public SavingsAccount()
   {   
      balance = 0;                                    
       
   }

   /**
      Constructs a bank account with a given balance 
      @param initialBalance 
   */
   public SavingsAccount(double initialBalance)
   {   
        balance = initialBalance;  
       
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
   public void addInterest(double interest)
{
       
      balance = balance +  balance * interest / 100; 
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

public class LabP32
{  
   public static void main(String[] args)
   {  
      SavingsAccount momsSavings = new SavingsAccount(1000);  // Instantiates Savings Account with Balance of 1000 
      
     
      momsSavings.addInterest(10);                       // Add interest of 10%
      
      
      double balance = momsSavings.getBalance();       // retrieves balance
      
      System.out.print("The balance is $");
      System.out.println(balance);
   }
}


