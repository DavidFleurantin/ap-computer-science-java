
public class LabP136 {

	public static void main (String [] args){
		
	  SalariedWorker s = new SalariedWorker("Sally", 40);
      HourlyWorker h = new HourlyWorker("Harry", 40);
      System.out.println(s.getName()+ "  "+computePay(s, 30));
      System.out.println(h.getName()+ "  "+computePay(h, 30));
      System.out.println(s.getName()+ "  "+computePay(s, 50));
      System.out.println(h.getName()+ "  "+computePay(h, 50));
   }
 
   public static double computePay(Worker w, int hours)
   {
      return w.computePay(hours);
   }
		
	}


  abstract class Worker
{
    protected String name;
    protected double salaryRate;
    
    public Worker( )
	{
		name = "No name";
		salaryRate = 0;
	}

    Worker(String workerName, double payPerHour)
    {
        name = workerName;
        salaryRate = payPerHour;
    }

    public abstract double computePay(int hours);

    public String getName()
    {
        return name;
    }
    
    public void setName( String newName )
	{
		name = newName;
	}

    public double getSalaryRate()
    {
        return salaryRate;
    }
    
    public void setSalaryRate(double newSalaryRate)
	{
		salaryRate = newSalaryRate; 
	}
    
}



 class HourlyWorker extends Worker
{
    public HourlyWorker(String workerName, double payPerHour)
    {
        super(workerName, payPerHour);
    }

    public double computePay(int hours)
    {
        if (hours <= 40)
        {
            return (salaryRate * hours);
        } else
        {
            int hoursOverForty = hours - 40;
            double overTime = (salaryRate * 1.5 * hoursOverForty);
            return (salaryRate * 40) + overTime;
        }
    }
}

 class SalariedWorker extends Worker
{

    public SalariedWorker(String workerName, double payPerHour)
    {
        super(workerName, payPerHour);
    }

    public double computePay(int hours)
    {
        return salaryRate * 40;
    }
}
