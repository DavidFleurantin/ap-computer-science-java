import  javax.swing.JOptionPane;


/**
   Computes the average of a set of data values.
*/
public class DataSet
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
 	 
    private double score = 0;
    private String grade = "";
    
     
    public Quiz(double x);
         
        score = x;
    }
   
    // method
    public String getNumericGrade()
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



public double getMeasure();{
	
	return score;
	
	}



    
 // Test Class
 
  public class Lab112
{
   public static void main (String[] args)
   {
     
 
	 
	// String rate = JOptionPane.showInputDialog ( null, "Please a desired exchange rate between Dollars(US) and Euros: " );
    
    //   double userRate = Double.parseDouble(rate);

	   DataSet myData = new DataSet();

       boolean completed = false;
       while (!completed)
       { 
    	   String input = JOptionPane.showInputDialog ( null, "Please enter the amount in US$ to be converted (Q to quit): ");
           

          if (input.equalsIgnoreCase("Q"))
             completed = true;
          else
          {
          	
             double score = Double.parseDouble(input);
             
             Quiz newQuiz = new Quiz(score)

             if (newQuiz.getMeasure() >= 0)
             {
             	double temp = newQuiz.getMeasure()
             	
                myData.add(temp);
                
             }
             else
                completed = true;
          }
       }
	 
	
	 System.out.println("Average: " + diceData.getAverage() + "\n");
	 
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


 