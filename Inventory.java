import static java.lang.System.out;

import java.util.InputMismatchException;

public class Inventory {
	  public int inventoryMenu(){
			
		    out.println("\n###################");
		    out.println("#    Inventory    #");
		    out.println("###################");
		      
			out.print(" 1. Add New Inventory Item\n 2. Update Item Record\n 3. Delete Item Record\n 4. Reorder Item\n 5. Inventory Report\n 6. Print (reports/labels)\n 9. Exit\n");
			out.print("\nMake a selection: ");
			try {
				int inventorySelection = ZIS_main.myScanner.nextInt();
							
				return  inventorySelection;
			}
			catch(InputMismatchException e) {
				
				out.println(e); // exception thrown if user input is not a valid integer
				ZIS_main.myScanner.next(); // this reads invalid input from myScanner and disregards it
				return 0; // returning zero from this method will cause the default case to execute
			}
	  }

		  public void addItem(String sqlInsert){
			out.println(">>addItem(sqlInsert)");

		  }

		  public void updateInventory(String sqlUpdate){
		        out.println(">>updateInventory(sqlUpdate)");

		  }

		  public void deleteItem(String sqlDelete){
			out.println(">>deleteItem(sqlDelete)");

		  }

		  public void reorderItem(){
			out.println(">>reorderItem()");

		  }

		  public void runInventoryReport(String sqlQuery){
			out.println(">>runInventoryReport(sqlQuery)");
		  } 
		  
		  public void printJob(){
			out.println(">>printJob()");	
		  }

		} //end Inventory

		class Item extends Inventory{

		  private int itemID;
		  private String description;
		  private double price;
		  private int quantityInStock;
		  private String lastOrderDate;
		  private int reorderPoint;
		  private String supplier;

		  //************Accessor Methods****************

			public void setItemID(int itemID){
				this.itemID = itemID;
			}
			public int getItemID(){
				return itemID;
			}
			//*************************************
			public void setDescription(String description){
				this.description = description;
			}
			public String getDescription(){
				return description;
			}
			//*************************************
			public void setPrice(double price){
				this.price = price;
			}
			public double getPrice(){
				return price;
			}
			//*************************************
			public void setQuantityInStock(int quantity){
				quantityInStock = quantity;
			}
			public int getQuantityInStock(){
				return quantityInStock;
			}
			//*************************************
			public void setLastOrderDate(String lastOrderDate){
				this.lastOrderDate = lastOrderDate;
			}
			public String getLastOrderDate(){
				return lastOrderDate;
			}
			//************************************
			public void setReorderPoint(int reorderPoint){
				this.reorderPoint = reorderPoint;
			}
			public int getReorderPoint(){
				return reorderPoint;
			}
			//************************************
			public void setSupplier(String supplier){
				this.supplier = supplier;
			}
			public String getSupplier(){
				return supplier;
			} 	
		}//end Item
		
		