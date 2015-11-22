    /**
    This class is used to calculate the average and standard deviation
    of a data set.
    */

     class DataSet{

        private double sum;
        private double sumSquare;
        private int count;

        /**Constructs a DataSet ojbect to hold the
         * total number of inputs, sum and square
         */

        public DataSet(){

            sum = 0;
            sumSquare = 0;
            count = 0;
        }

        /**Adds a value to this data set
         * @param x the input value
         */

        public void add(double x){

            sum = sum + x;
            sumSquare = sumSquare + x * x;
            count++;

        }

        /**Calculate average fo dataset
         * @return average, the average of the set
         */

        public double getAverage(){

            double avg = sum/count;

            return avg;

        }

        /**Get the total inputs values
         * @return count, the total number of inputs
         */

        public int getCount(){

        	return count;
        }
        
        /**Get the total inputs values
         * @return count, the total number of inputs
         */

        public double getStandardDeviation(){

        	double StandardDeviation =  Math.sqrt(((sumSquare) - (sum) / count)/(count - 1));
        	
        	return StandardDeviation;
        }

    }
public class LabP76 {
	 public static void main(String[] args)
	   {
	      DataSet a = new DataSet();
	      a.add(5);
	      a.add(6);
	      a.add(8);
	      a.add(9);
	      System.out.println("count: " + a.getCount());
	      System.out.println("Expected: 4");
	      System.out.println("average: " + a.getAverage());
	      System.out.println("Expected: 7");
	      System.out.println("standard deviation: " + a.getStandardDeviation());
	      System.out.println("Expected: 1.83");
	   }

}
