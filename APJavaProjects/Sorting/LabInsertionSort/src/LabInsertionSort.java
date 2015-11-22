// LabSortingST.java
//  This is the file supplied to students, write 3 versions .
//Save As LabSelectionSort.java, LabInsertionSort.java, LabMergeSort.java

import java.io.*;
import java.util.Random;
 
public class LabInsertionSort{
 public static void main(String args[]) throws IOException {
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
  System.out.print("\nEnter list size      ===>>  ");
  int listSize = Integer.parseInt(input.readLine());
  List array = new List(listSize);
  array.display();
  array.pause();
  array.sortList();
  array.display();
  array.pause();
 }
}

class List1{
 private int intArray[]; // stores array elements
 private int size;     // number of elements in the array
  
   
public List1(int s) {
size=s;
Random rand = new Random(12345);
intArray=new int[s];
 
for ( int i=0; i<s;i++){
intArray[i]=rand.nextInt(10000);
 
}
 
}

  
 

 public void display()
 {
  System.out.println("\nDISPLAYING ARRAY ELEMENTS");
  for (int k = 0; k < size; k++)
   System.out.print(intArray[k] + "\t");
 }   
 public void pause() throws IOException
 {   
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
  String dummy;
  System.out.print("\nPress <Enter> to continue  ===>>  ");      
  dummy = input.readLine();        
 }
   

   
 public void sortList(){
  
    
  System.out.println("\nPERFORMING SORTING ALGORITHM");
 
  for (int i = 1; i < intArray.length; i++) {
      int j = i;
      int B = intArray[i];
      while ((j > 0) && (intArray[j-1] > B)) {
                 
          intArray[j] = intArray[j-1];
          j--;
           }
      intArray[j] = B;
                }

  
 }
}   
