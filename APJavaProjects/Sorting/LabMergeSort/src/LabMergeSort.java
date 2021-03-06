 // LabSortingST.java
//  This is the file supplied to students, write 3 versions .
//Save As LabSelectionSort.java, LabInsertionSort.java, LabMergeSort.java

import java.io.*;
import java.util.Random;
 
public class LabMergeSort{
 public static void main(String args[]) throws IOException {
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
  System.out.print("\nEnter list size      ===>>  ");
  int listSize = Integer.parseInt(input.readLine());
  List2 array  = new List2(listSize);
  
  array.display();
  array.pause();
  mergeSort(array.getArray(), 0, listSize - 1);
        
  array.display();
  array.pause();
 }
 
 
   
       private static void DoMerge(int [] numbers, int left, int mid, int right)
       {
         int [] temp = new int[100000];
         int i, left_end, num_elements, tmp_pos;
     
         left_end = (mid - 1);
         tmp_pos = left;
         num_elements = (right - left + 1);
     
         while ((left <= left_end) && (mid <= right))
         {
             if (numbers[left] <= numbers[mid])
                 temp[tmp_pos++] = numbers[left++];
             else
                 temp[tmp_pos++] = numbers[mid++];
         }
     
         while (left <= left_end)
             temp[tmp_pos++] = numbers[left++];
  
         while (mid <= right)
             temp[tmp_pos++] = numbers[mid++];
  
         for (i = 0; i < num_elements; i++)
         {
             numbers[right] = temp[right];
             right--;
         }
     }
  
     public static void mergeSort(int [] numbers, int left, int right)
     {
       int mid;
     
       if (right > left)
       {
         mid = (right + left) / 2;
         mergeSort(numbers, left, mid);
         mergeSort(numbers, (mid + 1), right);
     
         DoMerge(numbers, left, (mid+1), right);
       }
     }
  
 }


class List2{
 private static int intArray[]; // stores array elements
 private int size;     // number of elements in the array
  
   
public List2(int s) {
size=s;
Random rand = new Random(12345);
intArray=new int[s];
 
for ( int i=0; i<s;i++){
intArray[i]=rand.nextInt(10000);
 
}
 
}

public int[] getArray(){
 
 return intArray;
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
  
}

 

 
   