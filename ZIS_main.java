import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;




	
	public class ZIS_main {

		public static Scanner myScanner;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		out.println("##############################################");
		out.println("#       ____        ____                     #");
		out.println("#          /    |   |       ZOO              #");
		out.println("#         /     |   |___    INFORMATION      #");
		out.println("#        /      |       |   SYSTEM           #");
		out.println("#       /___    |   ____|                    #");
		out.println("#                                            #");
		out.println("#   Select an option below to start...       #");
		out.println("#                                            #");
		out.println("##############################################");
				
		String response;
		
	    int mainMenuSentinal = 1;
	    
	    while (mainMenuSentinal == 1) { // This way we stay in the ZIS system until user chooses to exit
		 switch(mainMenu()) {
		  case 1: // Ticketing

		      Ticketing myTicket = new Ticketing();
		      
		      int ticketingSentinal = 1;
		      
			  while (ticketingSentinal == 1) { //this way we stay in the ticketing module until checkout
				  
		        switch(myTicket.ticketingMenu()) {
		      		case 1: //Senior
		      			out.println("Senior tickets are $5.00");
		      			out.print("Would you like to sell more tickets (Y/N)? ");
		      			response = myScanner.next();
		  
		      			if (response.toUpperCase().matches("Y")) {
		      				break;
		      			}
		      			else {
		      				myTicket.calculateAdmissionFee();
		      				myTicket.processPayment();
		      				myTicket.printAdmissionPass();
		      				ticketingSentinal = 0;
		      				break;
		      			}
		      			      			
		      		case 2: //Adult
		      			out.println("Adult tickets are $15.00");
		      			out.print("Would you like to sell more tickets (Y/N)? ");
		      			response = myScanner.next();
		  
		      			if (response.toUpperCase().matches("Y")) {
		      				break;
		      			}
		      			else {
		      				myTicket.calculateAdmissionFee();
		      				myTicket.processPayment();
		      				myTicket.printAdmissionPass();
		      				ticketingSentinal = 0;
		      				break;
		      			}
		      			
		      		case 3://Child
		      			out.println("Children tickets are $8.00");
		      			out.print("Would you like to sell more tickets (Y/N)? ");
		      			response = myScanner.next();
		  
		      			if (response.toUpperCase().matches("Y")) {
		      				break;
		      			}
		      			else {
		      				myTicket.calculateAdmissionFee();
		      				myTicket.processPayment();
		      				myTicket.printAdmissionPass();
		      				ticketingSentinal = 0;
		      				break;
		      			}
		      	
		      		case 4://General admission 
		      			out.println("General Admission tickets are $10.00");
		      			out.print("Would you like to sell more tickets (Y/N)? ");
		      			response = myScanner.next();
		  
		      			if (response.toUpperCase().matches("Y")) {
		      				break;
		      			}
		      			else {
		      				myTicket.calculateAdmissionFee();
		      				myTicket.processPayment();
		      				myTicket.printAdmissionPass();
		      				ticketingSentinal = 0;
		      				break;
		      			}
		      		case 5://Special Event 
		      			out.println("Special Event tickets are $20.00");
		      			out.print("Would you like to sell more tickets (Y/N)? ");
		      			response = myScanner.next().toUpperCase();
		  
		      			if (response.toUpperCase().matches("Y")) {
		      				break;
		      			}
		      			else {
		      				
		      				myTicket.calculateAdmissionFee();
		      				myTicket.processPayment();
		      				myTicket.printAdmissionPass();
		      				ticketingSentinal = 0;
		      				break;
		      			}
		      		case 9: //exit
		      			myTicket.calculateAdmissionFee();
	      				myTicket.processPayment();
	      				myTicket.printAdmissionPass();
		      			ticketingSentinal = 0;
		      			break;
		      		default:
		      			invalidInput();
		      			break;
			  			
		      	  }//end switch
		      	
			  }//end while
			  break; // end case 1
			  
		  case 2: //Point of Sale
				  
			  SalesAssociate myAssociate = new SalesAssociate();
			  
			  out.print("Login to continue. Employee ID: ");
			  String loginID = myScanner.next();
			  
			  myAssociate.setEmployeeNumber(loginID);
			  PointOfSale menuSelection = new PointOfSale();
			  
			  
			 int POSSentinal = 1;
		      
			  while (POSSentinal == 1) { 
				  switch(menuSelection.POSMenu()) {
				  case 1: //Sell Product
					  Product myProduct = new Product();
					  out.print("Enter product ID: ");
					  myProduct.productID = myScanner.nextInt();
					  out.println("[get item price info from Inventory DB]");
					  
					  Transaction myTransaction = new Transaction();
					  myTransaction.calculateTotal();
					  
					  out.print("Will this be cash or credit? ");
					  myTransaction.paymentType = myScanner.next();
					  
					    if (myTransaction.paymentType.toUpperCase().matches("CREDIT")) {
					    	myTransaction.authorizePayment();
					    }
					    
					    myTransaction.printReceipt();
					    break;
				  case 2: //Update product details
					  //enter product ID to update product details
					  Product updateMyProduct = new Product();
					  out.print("Enter product ID to update item details: ");
					  updateMyProduct.productID = myScanner.nextInt();
					  updateMyProduct.updatePrice();
					  updateMyProduct.updateDescription();
					  break;
				 
				  case 9: // Exit - go back to main menu
					  POSSentinal = 0;
					  break;
				  default:
					    invalidInput();
		      			break;
				  
				  }//end switch
				
			  }//end while
		    break;
		  case 3:
			  
				Inventory myInventory = new Inventory();

				int inventorySentinal = 1;
				while(inventorySentinal == 1){
				
				  switch(myInventory.inventoryMenu()){
					case 1:
						myInventory.addItem("");
						break;
					case 2:
						myInventory.updateInventory("");
						break;
					case 3:
						myInventory.deleteItem("");
						break;
					case 4:
						myInventory.reorderItem();
						break;
					case 5:
						myInventory.runInventoryReport("");
						break;
					case 6:
						myInventory.printJob();
						break;
					case 9:
						inventorySentinal = 0;
						break;
					default:
						invalidInput();
		      			break;
				  } // end switch
				}//end while
		    break;//end case 3
		  case 4:
		
			  Health myHealthObj = new Health();
			  
			  int medicalSentinal = 1;
				while(medicalSentinal == 1){
					
					switch(myHealthObj.medicalMenu()) {
						case 1://add new resident record
							myHealthObj.addNewResident("");
							break;
						case 2://update resident wellness record
							myHealthObj.updateWellnessDescription("");
							break;
						case 3://print wellness record details
							myHealthObj.printJob();
							break;
						case 9://exit to main menu
							medicalSentinal = 0;
							break;
						default:
							invalidInput();
			      			break;
					}//end switch
				}//end while
			break;//end case 4
		  case 5:
			
			  Payroll myPayroll = new Payroll();
			  
			  int payrollSentinal = 1;
				while(payrollSentinal == 1){
					switch(myPayroll.payrollMenu()) {
					case 1://add new Employee
						myPayroll.addEmployee("");
						break;
					case 2://delete Employee
						myPayroll.deleteEmployee("");
						break;
					case 3://Begin payroll processing
						myPayroll.processPayroll();
						break;
					case 4://print check
						myPayroll.printCheck();
						break;
					case 9://exit to main menu
						payrollSentinal = 0;
						break;
					default:
						invalidInput();
		      			break;
					
					}//end switch
					
				}//end while
		    break;//end case 5
		  case 9:
			  mainMenuSentinal = 0;
			  break;
		  default:
			invalidInput();
		    break;
		    
		  }//end switch
	    } // end while
		  
		out.println("Exiting ZIS System.");
		myScanner.close();
	
	} // end main()
	
		public static int mainMenu() {
			out.println("\n###################");
			out.println("#    Main Menu    #");
			out.println("###################");
			out.print(" 1. Ticketing\n 2. Point of Sale\n 3. Inventory\n 4. Medical H&W\n 5. Payroll\n 9. Exit/Quit\n");
			out.println();
			
			out.print("Enter module number: ");
			try {
					
				myScanner = new Scanner(System.in);
				int moduleSelection = myScanner.nextInt();
					
				return moduleSelection;
			}
			catch(InputMismatchException e) {
				out.println(e);
				return 0;
			}
			
		}// end mainMenu()
		
		public static void invalidInput() {
			out.println("Oh no! :( \nSorry, ZIS didn't recognize your selection. Try again.");
		}
	
} // end ZIS_main
