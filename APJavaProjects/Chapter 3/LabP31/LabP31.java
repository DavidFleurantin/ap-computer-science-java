// Programmer: David Fleurantin
// Date:       October 17, 2014



/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
 class BankAccount
{  
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
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
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   private double balance;
}


public class LabP31
{  
   public static void main(String[] args)
   {  
      BankAccount account = new BankAccount();
      
      account.deposit(1000);          
      account.withdraw(500);                  // Deposits and Withdraws from BAnk Account
      account.withdraw(400);
      
      double balance = account.getBalance();
      
      System.out.print("The balance is $");
      System.out.println(balance);
   }
}


