import  javax.swing.JOptionPane;


/**
   Computes the average of a set of data values.
*/
 class DataSet
{
   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
      sum = 0;
      count = 0;
      maximum = null;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(Measurable x)
   {
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public Measurable getMaximum()
   {
      return maximum;
   }

   private double sum;
   private Measurable maximum;
   private int count;
}



// End Class


 class Quiz implements Measurable
{
   
    private double score;
    private String grade;
    
     
    public Quiz(double x){
         
        score = x;
    }
   
    // method
    public String getLetterGrade()
    {
     if (score>=95) 
     {grade= "A+";}
     else
      if(score <95&& score >=90)
      {grade="A";}
     else
      if(score <90&& score >=85)
      {grade="B+";}
     else
      if(score <85&& score >=80)
      {grade="B";}
     else
      if(score <80&& score >=75)
      {grade="C+";}
     else
      if(score <75&& score >=70)
      {grade="C";}
     else
      if(score <70&& score >=65)
      {grade="D";}
     else
      if(score <65)
      {grade="F";}
      
     return grade;
     
    }



public double getMeasure(){
 
 return score;
 
 }

}

    
 // Test Class
 
  public class Lab112Tester
{
   public static void main (String[] args)
   {
     


    DataSet myData = new DataSet();
       int counter = 1;

       boolean completed = false;
       while (!completed)
       { 
        String input = JOptionPane.showInputDialog ( null, "Please Enter a Quiz (PRESS Q TO AVERAGE): ");
           

          if (input.equalsIgnoreCase("Q"))
             completed = true;
          else
          {
           
             double score = Double.parseDouble(input);
             
             Quiz newQuiz = new Quiz(score);

             if (newQuiz.getMeasure() >= 0)
             {
              
                myData.add(newQuiz);
                System.out.println("Quiz " + counter + ": " + score + "\n");
                counter++;
                
             }
             else
                completed = true;
          }
       }
  
 
  System.out.println("Your Average: " + myData.getAverage() + "\n");
  System.out.println("Your Highest Score: " + ((Quiz)(myData.getMaximum())).getMeasure() + " ==> " + ((Quiz)(myData.getMaximum())).getLetterGrade());
  
 }

}



 interface Measurable
{
   /**
      Computes the measure of the object.
      @return the measure
   */
   double getMeasure();
}



 