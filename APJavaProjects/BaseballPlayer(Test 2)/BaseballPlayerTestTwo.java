// Programmer: David Fleurantin 


import java.lang.Math.*;
import java.text.DecimalFormat;



public class BaseballPlayerTestTwo{ 
  
   public static void main (String [] args)
    {//in BaseballPlayer constructor and updateStats -- the last 3 parameters are hits, atBats, and walks
      BaseballPlayer joe=new BaseballPlayer("Joseph", "11");//default constructor
      BaseballPlayer frank=new BaseballPlayer("Frank","5",10,17,2, 3, 5 );
      BaseballPlayer mike=new BaseballPlayer("Michael","7",9,18,2, 5, 7 );
      System.out.println("    Print from main      ");
   System.out.println("    Number of Athletes: "+Athlete.getNumberOfAthletes());
      //print objects
      System.out.println("\n");
      joe.showData();
      System.out.println("\n");
   frank.showData();
   System.out.println("\n");
   mike.showData();
   System.out.println("\n");
   //compare Mike to Frank
   System.out.println("Is frank's average > mike?  answer: "+frank.compareTo(mike));
   mike.updateStats(4,10,2);
   System.out.println("\n");
    //show object after change to mike
       mike.showData();
      System.out.println("\n");
       
   System.out.println("Is frank the same baseball player as mike?  answer: "+frank.equals(mike));
   
   System.out.println("\n");
   
   //Class BaseballPlayer implements Comparable
System.out.println("Is frank's average > mike?  answer: "+frank.compareTo(mike));

System.out.println("\n");

      
   BaseballPlayer joe2=new BaseballPlayer("Joseph","00",0,0,0,0,0);
   System.out.println("    Number of Athletes: "+Athlete.getNumberOfAthletes()); 
   System.out.println("\n");
    
   System.out.println("Printing joe2"+ joe2);
   System.out.println("Is joe the same baseball player as joe2?  answer "+joe.equals(joe2));
   System.out.println("Is joe's average > joe2?  answer: "+joe.compareTo(joe2));
   joe2.updateStats(3,4,1);
 System.out.println("\n");
 
   System.out.println("Printing joe2 after update");
    System.out.println(joe2);
    System.out.println("Is joe the same baseball player as joe2?  answer: "+ joe.equals(joe2));
   System.out.println("Is joe's average > joe2?  answer: "+joe.compareTo(joe2));
 
   System.out.println("Is joe2's average > joe?  answer: "+joe2.compareTo(joe));
           }
           
}  



class BaseballPlayer extends Athlete implements Comparable{
 
 private int numHits; 
 private int numAtBats; 
 private int numWalks;
 private String uniformNum;
 private int battingHours;
 private int fieldingHours;
 
 
 public BaseballPlayer(String userName, String userUniformNum )
 {
  super( userName, "Baseball");
    numHits      = 0; 
    numAtBats    = 0; 
    numWalks     = 0;
      uniformNum   = userUniformNum;
      battingHours = 0;
  fieldingHours   = 0;
    
 }
 
 public BaseballPlayer(String userName, String userUniformNum, int userhits, int userAtBats, int userWalks, int userBattingHours, int
  userFieldingHours)
 {
  super(userName, "Baseball");
    numHits      = userhits; 
    numAtBats    = userAtBats; 
    numWalks     = userWalks;
      uniformNum   = userUniformNum;
      battingHours = userBattingHours;
  fieldingHours   = userFieldingHours;
    
 }
 
 public int getHits()
 {
  return numHits;
 }

 
 public int getAtBats()
 {
  return numAtBats;
 }
 
 
 public int getWalks()
 {
  return numWalks;
 }
 
 
 public String getUniformNum()
 {
  return uniformNum;
 }
 
 
 public void updateStats(int newNumHits, int newNumAtBats, int newNumWalks)
 {
   numHits   += newNumHits;
   numAtBats += newNumAtBats;
   numWalks  += newNumWalks;
 }
 
 
 public double getBattingAvg()
 {
  double batAvg;
  
    if((numAtBats - numWalks) <= 0)
    
    {
     batAvg = 1; 
     batAvg = (double)Math.round(batAvg * 1000) / 1000 -1;
      
    }
    
    else
    {
     batAvg = ( (double) numHits ) / ( (double) (numAtBats - numWalks) );
     
     batAvg = (double)Math.round(batAvg * 1000) / 1000;
    }
    
    return batAvg;
 }
 
 
 public String toString()
 {
   String answer= super.toString() + "\nUniformNumber: "+uniformNum + "\nHits: "+numHits + "\nAtBats: "+numAtBats + "\nWalks: "+numWalks
   + "\nBatting Hours: "+ battingHours + "\nFielding Hours: "+ fieldingHours + "\nBatting Avg: "+ this.getBattingAvg();
  return answer;
 }
 
 
 public void showData()
 {
   System.out.println(this.toString());
 }
 
 
 public void updateBattingPractice(int x)
 {
  battingHours += x;
  this.train(x);
 }
 
 
 public void updateFieldPractice(int x)
 {
  fieldingHours += x;
  this.train(x);
 }
 
 
 public int compareTo(Object obj){
  
  
  final double EPSILON = 1.0e-15;
  
  
  BaseballPlayer temp = (BaseballPlayer) obj;
  
  double diff = this.getBattingAvg() - temp.getBattingAvg();
  
  if(Math.abs(diff) <= EPSILON )
  
   {return 0;}
  
  else if (diff < 0)
  
   {return -1;}
   
  else
  
   return 1; 
  
  
 } 
 
}


class Athlete
{
 private String name;
 private String sport;
    private int trainingHours;
    //class variable 
    private static int numberOfAthletes;
    
    
    //class methods
    
    public static  void setNumberOfAthletes(int x)
    {numberOfAthletes=x;
       }
       
       
       
   // Satic Method     
       public static int getNumberOfAthletes()
    {    return numberOfAthletes;
       }
       
            
       
 public Athlete(String x, String y)
 {
  System.out.println("Athlete Parameter Constructor");
  name = x;
  sport=y;
  trainingHours=0;
  numberOfAthletes++;
 } 

 public int getData()
 {
  return trainingHours;
 }
 
 
 public String getSport()
 {
  return sport;
 }
 public String getName()
 {
  return name;
 }
 protected void train( int x)
  {System.out.println("Assign Training Hours from the Athlete Class");
  trainingHours=trainingHours+x;
  }
 public String toString(){
  return (this.getSport() + " " + this.getName()+ "\nTraining hours: " + this.getData());
  }
 }
 
 
