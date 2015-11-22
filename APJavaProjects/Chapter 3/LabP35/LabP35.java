// Programmer: David Fleurantin
// Date:       October 17, 2014

 /**
   An Employee has a name and a salary
*/
class Employee
{  
   /**
      Constructs an Employee account with an unnassigned name and salary of 0
   */
    private String name;
    private double salary;
   
   public Employee()
   {   
      name = "unassigned";
      salary = 0.0;                                   // 
       
   }

   /**
      Constructs an Employee account  with a given name and salary
      @param initialBalance 
   */
   public Employee(String yourName, double yourSalary)
   {   
        name = yourName;
        salary = yourSalary;  
       
   }

     
   public String getName()                 // Retrieves Name of Employee
   {   
      return name;
   }
   
    public double getSalary()              // Retrieves Salary of Employee
   {   
      return salary;
   }

    public void raiseSalary(double byPercent)              // Retrieves Salary of Employee
   {   
       
       salary = salary + byPercent / 100 * salary;
   }

  
}

// Employee Test (Public)

public class LabP35
{  
   public static void main(String[] args)
   {  
      Employee myAccount = new Employee("David",100000);  // Instantiates Employee Account with Name David and Salary of 100000 
        
      myAccount.raiseSalary(10);                 // Raise Salary by 10%
      
      String myName   = myAccount.getName();       // retrieves name
      double mySalary = myAccount.getSalary();     // retrieves salary
          
      System.out.println("Name:    " + myName);
      System.out.println("Salary:  $" + mySalary);
   }
}


