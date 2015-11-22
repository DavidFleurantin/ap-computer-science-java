  
  
  import javax.swing.JOptionPane; 
  
 class MultiplicationTable {

	private int row;
	private int column;
	private int table [][];
	 
	
	public MultiplicationTable(){
	
		row = 0;
		column = 0;  
		
		 table = new int[row][column];
		
	}
	public MultiplicationTable(int userRow){
		
		row = userRow;
		column = userRow;
		
		 table = new int[row][column];
		
		
	}
	public MultiplicationTable(int userRow,int userColumn){
		
		row = userRow;
		column = userColumn; 
		
		
		 table = new int[row][column];
	}
	
	 
		
	
	public void display()
	{
		 
		  for(int i=0; i < table.length; i++) {
			    for (int j=0; j < table[i].length; j++) {
			      table[i][j] = (i+1)*(j+1); 
 
			        System.out.print(" "+(table[i][j])+"\t");
			    }
			  System.out.println("");
		  }
		 
	}
	
	public String toString()
	
	{  
		
		 String answer = "\n";
		 for(int i = 0; i<table.length;i++)
		 {
		 	for(int j = 0; j<table[i].length;j++)
		 	{      //System.out.print(table[i][j] + "\t");
		 		answer += table[i][j] + "\t"; 
		 	}
		 	answer += "\n";
		 }
		 
		 return answer;
	} 
}  

 public class MultiplicationTableTest{
 
     public static void main(String args[])  throws Exception
      {            
      
     
                 
                  MultiplicationTable t1=new MultiplicationTable();
                  MultiplicationTable t2=new MultiplicationTable(8);;
                  MultiplicationTable t3=new MultiplicationTable(3,8);
 
                 
                  //Write a void method to print the MultiplicationTable
           
                  System.out.print("Printing with display()\n\n");
                  t1.display(); 
                   
                  t2.display();
                  System.out.print("\n\n\n");
                  t3.display();
                  System.out.print("\n\n\n");
               
 
                  System.out.print("Printing with toString()\n");
                  System.out.println(t1);
                   
                  System.out.println(t2);
                  System.out.print("\n\n\n");
                  System.out.println(t3);
                  System.out.print("\n\n\n");
                  
                  
                 
                  
                  
                  
       JOptionPane.showMessageDialog(null, "Now Try Creating Your Own Table");
       
       
       String userRow = JOptionPane.showInputDialog(null, "Enter a Row ");
	   int row = Integer.parseInt(userRow);

       String userColumn = JOptionPane.showInputDialog(null, "Enter a Column");
	   int column = Integer.parseInt(userColumn);

           System.out.print("Your Table Row: " + row + " Column: " + column + "\n");        
          MultiplicationTable t4=new MultiplicationTable(row,column);           
                     System.out.print("\n\n\n");
                     t4.display();
                     System.out.println(t4);
                    
                  
 }
 }