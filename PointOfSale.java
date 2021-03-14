import static java.lang.System.out;
import java.time.*;
import java.util.InputMismatchException;

public class PointOfSale {
	
	LocalTime dateTime = LocalTime.now();
	
	
	
	public int POSMenu() {
		
		out.println("\n###################");
		out.println("#  Point of $ale  #");
		out.println("###################");
		
		out.print("\n 1. Sell Product\n 2. Update Product Details\n 9. Exit\n");
		out.print("What would you like to do? ");
		
		try {
			int POSselection = ZIS_main.myScanner.nextInt();
		
			return POSselection;
		}
		catch(InputMismatchException e) {
			out.println(e); // exception thrown if user input is not a valid integer
			ZIS_main.myScanner.next(); // this reads invalid input from myScanner and disregards it
			return 0; // returning zero from this method will cause the default case to execute
		}
	}


}//end PointOfSale

class SalesAssociate extends PointOfSale {
	
	private String employeeName;
	private String employeeNumber;
	
	public void setEmployeeName(String name) {
		employeeName = name;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeNumber(String id) {
		employeeNumber = id;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
}//end SalesAssociate class

class Product extends PointOfSale{
	
	public int productID;
	private String productDescription;
	private double productPrice;
	
	public String getProductDescription(String sqlQuery) {
		
		 out.println(">>getProductDescription()");
		 return this.productDescription;
	}
	
	public double getProductPrice(String sqlQuery) {
		
		 out.println(">>getProductPrice()");
		 return this.productPrice;
	}
	

	public void updatePrice() {
		out.println(">> updatePrice()");
	}
	public void updateDescription() {
		out.println(">> updateDescription()");
	}
}//end Product class

class Transaction extends PointOfSale{
	
	public String paymentType;
	
	public void calculateTotal() {
		out.println(">> calculateTotal()");
		
	}
	public void authorizePayment() {
		out.println(">> authorizePayment()");
		
	}
	public void printReceipt() {
		out.println(">> printReceipt()");
		
	}
	
	
}




