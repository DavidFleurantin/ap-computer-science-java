
// Programmer: David Fleurantin
// Date:       October 17, 2014


 /**
   A Product has a name and price
*/
class Product
{  
   /**
      Constructs an Product with an unnassigned name and price of 0
   */
    private String name;
    private double price;
     
   
   public Product()
   {   
      name = "unassigned";
      price = 0; 
                                 
       
   }

   /**
      Constructs a Product account with a given name and price
      @param initialBalance 
   */
   public Product(String productName, double productPrice)
   {   
        name = productName;
        price = productPrice; 
         
       
   }

     
   public String getName()                         // Retrieves Name of Product
   {   
      return name;
   }
   
    public double getPrice()              // Retrieves Price of Product
   {   
      return price;
   }


  public void reducePrice(double priceReduction)              //  Reduces price by given ammount
   {   
       
       price = price - priceReduction;
       
   }
    
  
}


// Class Product Test (Public)

public class LabP38 {

	public static void main(String[] args) {
		 Product oven = new Product("KitchenAid Oven",99.95);         
		 																		// Instantiates 2 Products with Names and Prices Respectively
	      Product toaster = new Product("General Electric Toaster",34.99);  
	      
	      
	      System.out.println("Holiday Day Deals");
	      
	      System.out.println("Product 1:    " + oven.getName());
	      System.out.println("Product 1 Price : $" + oven.getPrice());          // Original Product Information
	      System.out.println("Product 2:    " + toaster.getName());
	      System.out.println("Product 2 Price : $" + toaster.getPrice());
	      
	      
	      oven.reducePrice(5.0);
	      toaster.reducePrice(5.0);                             // Reduces Price of both products by $5
	                                
	      
	      String myOvenName     = oven.getName(); 
	      String myToasterName   = toaster.getName();                  // retrieves new Product Info
	      double myOvenPrice     = oven.getPrice(); 
	      double myToasterPrice   = toaster.getPrice();
	          
	          
	      System.out.println("Product 1:    " + myOvenName);
	      System.out.println("Product 1 Price ($5 off original): $" + myOvenPrice);
	      System.out.println("Product 2:    " + myToasterName);                                // New Product Info
	      System.out.println("Product 2 Price ($5 off original): $" + myToasterPrice);

	}

}
