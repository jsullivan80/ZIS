import static java.lang.System.out;

import java.time.*;
import java.util.InputMismatchException;
//import java.util.Scanner;


public class Ticketing {
	
	LocalTime dateTime = LocalTime.now();
	
	public int ticketingMenu() {
		
		out.println("\n###################");
		out.println("#    Ticketing    #");
		out.println("###################");
	
		out.println(" 1. Senior\n 2. Adult\n 3. Child\n 4. General Admission \n 5. Special Event\n 9. Checkout & Exit\n");
		out.print("What type of ticket would you like to sell? ");
		
		try {
			
			int ticketSelection = ZIS_main.myScanner.nextInt();
				
			return ticketSelection;
		}
		catch(InputMismatchException e) {
			out.println(e); // exception thrown if user input is not a valid integer
			ZIS_main.myScanner.next(); // this reads invalid input from myScanner and disregards it
			return 0; // returning zero from this method will cause the default case to execute
		}
	}
	
	public class SpecialEventTicket {
	
		private double seniorPrice;
		private double adultPrice;
		private double childPrice;
		private double discount;
		
		private String eventName;
		
		//*********Accessor methods:********************
		public void setSeniorPrice(double price) {
			seniorPrice = price;
		}
		public double getSeniorPrice() {
			return seniorPrice;
		}
		public void setadultPrice(double price) {
			adultPrice = price;
		}
		public double getadultPrice() {
			return adultPrice;
		}
		public void setChildPrice(double price) {
			childPrice = price;
		}
		public double getChildPrice() {
			return childPrice;
		}
		public void setDiscount(double discountPrice) {
			discount = discountPrice;
		}
		public double getDiscount() {
			return discount;
		}
		public void setEventName(String e_Name) {
			eventName = e_Name;
		}
		public String getEventName() {
			return eventName;
		}
		//**********************************************

		public void getCalendarEvents() {
			
		}		
   }  // end SpecialEventTicket class
	

    public class GeneralAdmissionTicket {

    	private double gaPrice;
    	
    	//*************************************
    	public void setGaPrice(double price) {
    		gaPrice = price;
    	}
    	public double getGaPrice() {
    		return gaPrice;
    	}
    	//**************************************
    	
    	public void selectDateTime() {
    		
    	} 	    	
    }  // end GeneralAdmissionTicket
    
    public void calculateAdmissionFee() {
    	out.println(">>calculateAdmissionFee()");
		
	}
	public void processPayment() {
		out.println(">>processPayment()");
		
	}
	public void printAdmissionPass() {
		out.println(">>printAdmissionPass()");
		
	}

}
