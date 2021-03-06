 //also Located in Share DeGeorge Recursion Folder
// LabRecursiveSt.java
// Student Program Version
// This version completes recursive implementations of the <countUp>, <countDown>, <sum>, <fact>, <fibo>, <gcf> and
// the <pow> methods.
  public class LabRecursionSt{
 public static void main(String args[]) {
  System.out.println("Counting from 1 up to 10");
  Test.countUp(1,10);
  skip2();
  System.out.println("Counting from 10 down to 1");
      Test.countDown(10,1);
      skip2();
     System.out.print("The sum of all integers 0 to 100 is " + Test.sum(100));
     skip2();
     System.out.print("The factorial of 5 is " + Test.fact(5));
  skip2();
  System.out.print("The 10th Fibonacci Number is " + Test.fibo(10));
  skip2();
  System.out.print("The GCF of 120 and 108 is " + Test.gcf(120,108));
  skip2();
  System.out.print("2 raised to the 8th power is " + Test.pow(2,8));
  
  }
 
 public static void skip2()
 {
  System.out.println("\n\n");
 }
}

class Test{
 public static void countUp(int k, int n)
 // displays consecutive integers from k to n
 {
  if (n<=k) // base case
         System.out.println(" ");
     else
         countUp(k, n-1);
  System.out.print(n + " ");
     
     }
 
 public static void countDown(int k, int n)
 // displays consecutive integers backwards from k to n
 {
 if (k<=n) // base case
         System.out.println("");
     else
      
         countDown(k, n+1);
 System.out.print(n + " ");
  
 }
 public static int sum(int n)
 // returns the sum of all integers 1 + 2 + .... + n-1 + n
 {
  if(n==1)
   return 1;
  else
   return n + sum(n-1);
 }
    
 public static int fact(int n)
 // returns n factorial
 {
  if(n==0)
   return 1;
  else
   return n * fact(n-1);
 }


public static int fibo(int n)
 // returns the nth Fibonacci number
 {
  if (n ==1 || n== 2)
   return 1;
  else 
   return fibo(n-1) + fibo(n-2);
 }
   
 public static int gcf(int n1, int n2)
 // returns the gcf of n1 and n2
 {
  if (n1 == n2)
   return n1;
  else
   if (n2 > n1)
    return gcf(n1, n2-n1);
  else
   return gcf(n1-n2, n2); 
  
 }  
   
 public static int pow(int n1, int n2)
 // returns n1 raised to the n2 power
 {
  if(n2 == 0)
   return 1;
  else
    return n1 * pow(n1, n2-1) ;
  
 }
   
}    

