 
public class LabP134
{
	public static void main ( String [ ] args)
	{
		 
		
	  Person p = new Person("Perry", 1959);
      Student s = new Student("Sylvia", 1979, "Computer Science");
      Instructor e = new Instructor("Edgar", 1969, 65000);
      System.out.println(p);
      System.out.println(s);
      System.out.println(e);
		
	}
}



class Student extends Person
{
	String major;
 

	public Student( )
	{
		super();
		major="";
	
	}
	public Student( String newName, int newBirthYear)
	{	super(newName,newBirthYear);
		major="";
		}
		
		public Student(String newName, int newBirthYear, String newMajor)
	{	super(newName,newBirthYear);
		major=newMajor;
	 
		}

	public void setMajor ( String newMajor)
	{
		major = newMajor;
	}
	
	public String getMajor()
	{
		return major;
	}



	
	public String toString()
	{	String answer= super.toString()+ "\nMajor: " + major;
		return answer;
	}
}



class Instructor extends Person
{

	private double salary;
	 
	
	
	public Instructor()
	{
		super ();
		salary = 0;
		
	}
	
	public Instructor(String newName, int newBirthYear )
	{
		super(newName,newBirthYear);
		salary = 0;
	}
	
	public Instructor( String newName, int newBirthYear, double newSalary )
	{	super(newName,newBirthYear);
		salary = newSalary;
	}
	
	 public void setSalary(double newSalary)
	{
		salary = newSalary;
	}
 
 
 public double getSalary()
	{
		return salary;
	}

	
	public String toString()
	{	String answer= super.toString()+ "\nSalary: " + salary;
		return answer;
	}



}

	
		
class Person
{
	private String name;
	private int birthYear;
	
	public Person( )
	{
		name = "No name";
		birthYear = 0;
	}
	
	public  Person (String newName, int newBirthYear)
	{
		name = newName;
		birthYear = newBirthYear;
	}
	
	 
	public void setName( String newName )
	{
		name = newName;
	}

	public String getName()
	{
		return name;
	}
	
	public void setBirthYear(int newBirthYear)
	{
		birthYear = newBirthYear; 
	}
	
	public int getBirthYear()
	{
		return birthYear;
	}

public String toString()
	{   String answer=	"\nName is: "+name;
		return answer;
		
	}





}		 	
		 
		 	   
 