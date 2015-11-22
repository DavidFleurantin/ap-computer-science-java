// Programmer: David Fleurantin
// Date:       October 17, 2014


 /**
   An Student has a name, quizScore, and quizNumber
*/
class Student
{  
   /**
      Constructs an Student account with an unnassigned name and quizScore and quizNumber of 0
   */
    private String name;
    private double quizScore;
    private double quizNumber;
   
   public Student()
   {   
      name = "unassigned";
      quizScore = 0; 
      quizNumber = 0;                                  
       
   }

   /**
      Constructs an Student account with a given name, quizScore, and numberOfQuizes
      @param initialBalance 
   */
   public Student(String yourName, double yourQuizScore, double numberOfQuizes)
   {   
        name = yourName;
        quizScore = yourQuizScore; 
        quizNumber = numberOfQuizes; 
       
   }

     
   public String getName()                         // Retrieves Name of Student
   {   
      return name;
   }
   
    public double getTotalQuizScore()              // Retrieves Total Quiz Score of Student
   {   
      return quizScore;
   }


  public void addQuiz(double nextScore)              //  Adds given Quiz Score
   {   
       
       quizScore = quizScore + nextScore;
       quizNumber = quizNumber + 1; 
   }
   
     public double getAverageScore()              // Retrieves Average Quiz Score of Student
   {   
       
       
        double average = quizScore/ quizNumber;
        
        return average;
        
   }
  
}

// Class Student Test (Public)

public class LabP37
{  
   public static void main(String[] args)
   {  
      Student pupil = new Student("David",0,0);  // Instantiates Student Account with Name David, Total Quiz Score of 0 and Number of Quizes 0
        
      
      pupil.addQuiz(90);
      pupil.addQuiz(90);                             // Adds Three Quiz Scores
      pupil.addQuiz(100);                           
      
      String myName   = pupil.getName();                  // retrieves name
      double myTotalScore = pupil.getTotalQuizScore();    // retrieves Total Quiz Score
      double myAverageScore = pupil.getAverageScore();    // retrieves Average Quiz Score
    
          
      System.out.println("Road to the 4.0");    
      System.out.println("Name:    " + myName);
      System.out.println("Total Quiz Score:" + myTotalScore);
      System.out.println("Average Quiz Score:" + myAverageScore);
      
      System.out.println(pupil);
   }
}


