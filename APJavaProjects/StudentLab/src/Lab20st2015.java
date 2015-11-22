// Lab20st.java
// This is the student version of the Lab 20 assignment.


import java.io.*;
import java.util.ArrayList;

      
public class Lab20st2015
{
 public static void main(String args[]) throws IOException
 {
  System.out.println("Lab 20A");
  ClassList list = new ClassList();
  list.getList();
  list.pause();
 list.computeStudentMean();
  list.computeTestMean();  //uncomment the next 3 lines
  list.computeClassMean();
  list.displayMeans();  
  System.out.println();
 }
}



class ClassList
{
 
 class Student
 {
  private String name;
  private ArrayList grades;//YOU NEED TO  Type THIS
  protected double mean;
   
  public Student(String n, int g1, int g2, int g3, int g4)
  {
   name = n;
   grades = new ArrayList();//need to type
   grades.add(new Integer(g1));
   grades.add(new Integer(g2));
   grades.add(new Integer(g3));
   grades.add(new Integer(g4));
  }
 /* public ArrayList<Integer> getGrades()
  {
   return grades;
  }
*/
  public ArrayList<Integer> getGrades()
  {
   return grades;
  }
  
  public void setMean(double x){
   
   mean = x;
   
  }
  
 public String getName(){
   
   return name;
  
  }
  
  
  public double getMean(){
   
   return mean;
   
  }
 }
 
 private ArrayList<Student> students;
 private int studentCount; 
 private ArrayList <Double>testMean;
 private int testCount;
    private double classMean;
    
 public ClassList()
 {
  students = new ArrayList <Student> ();  //Need type
  testMean = new ArrayList <Double>();  //Need type
  studentCount = 0;
  testCount = 4;          
 }


 public void getList() throws IOException
 {
  System.out.println("\nRetrieving Grades.dat\n");
  FileReader inFile = new FileReader("Grades.dat"); 
  BufferedReader inStream = new BufferedReader(inFile);      
  String s1,s2,s3,s4,s5;

  while(  ((s1 = inStream.readLine()) != null) && 
    ((s2 = inStream.readLine()) != null) &&
    ((s3 = inStream.readLine()) != null) &&
    ((s4 = inStream.readLine()) != null) &&
    ((s5 = inStream.readLine()) != null)   )
  {
   System.out.println(s1 + "\t\t" + s2 + "\t" + s3 + "\t" + s4 + "\t" + s5); 
   String name = s1;
   int g1 = Integer.parseInt(s2);
   int g2 = Integer.parseInt(s3);
   int g3 = Integer.parseInt(s4);
   int g4 = Integer.parseInt(s5);
   students.add(new Student(name,g1,g2,g3,g4));       
  }   
  inStream.close();        
  studentCount = students.size();
 }
 
 
  
 
 
 public void pause() throws IOException
 {  
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
  String dummy;
  System.out.print("\nPress <Enter> to continue  ===>>  ");      
  dummy = input.readLine();        
 }
 
 
 public void displayData()
 {
  System.out.println("\nDISPLAYING STUDENT DATA");
    
  System.out.println("\n\n");
 }   
 
 public void computeStudentMean()
 {
  
  double sum = 0;
   for (int i = 0; i<students.size(); i++)
   {
   
   for(int j=0;j<4;j++){
    sum = sum + students.get(i).getGrades().get(j);
    students.get(i).mean = sum/4;
   }
   
  sum = 0;
   }      
 
 }
 
 public void computeTestMean()
 {
  
   double test1 = 0;
   double test2 = 0;
   double test3 = 0;
   double test4 = 0;
   
   for (int i = 0; i<students.size(); i++)
   {
   
   
    test1 += students.get(i).getGrades().get(0);
    test2 += students.get(i).getGrades().get(1);
    test3 += students.get(i).getGrades().get(2);
    test4 += students.get(i).getGrades().get(3);
   }    
  
   testMean.add(test1 / studentCount);
   testMean.add(test2 / studentCount);
   testMean.add(test3 / studentCount);
   testMean.add(test4 / studentCount);
 }
 
 
 public void computeClassMean()
 {
  double sum = 0; 
  int testCount = 4;
  
   for (int i = 0; i < testMean.size(); i++)
   {
    sum += testMean.get(i); 
   }
  
   classMean = sum / (testCount);
 }
  

   public void displayMeans() throws IOException
 {
    System.out.println("\nDISPLAYING MEANS DATA" + "\n");
    
    for(int i = 0; i < students.size(); i++)
   
  {
   System.out.println(students.get(i).getName() + "\t" + "\t" + "Grade mean: " + students.get(i).getMean());
   
  }
    
    System.out.print("\n");
    
    System.out.print("Test Means: ");
    
   
   for (int i = 0; i < testMean.size(); i++)
   {
    System.out.print(testMean.get(i) + "    ");
   }
   
    
    System.out.print("\n\n");
    
    System.out.print("Class mean: ");
    
   
    System.out.print(classMean);
    
    
 }   
  

 

}    
