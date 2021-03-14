import static java.lang.System.out;

import java.util.InputMismatchException;


public class Payroll {
	
	public int payrollMenu() {
		
	  out.println("\n###################");
	  out.println("#     Payroll     #");
	  out.println("###################");
	  
	    out.print(" 1. Add New Employee\n 2. Delete Employee\n 3. Begin Payroll Processing\n 4. Print Check\n 9. Exit\n");
		out.print("\nMake a selection: ");
		
		try {
			int payrollSelection = ZIS_main.myScanner.nextInt();
	  
			return payrollSelection;
		}
		catch(InputMismatchException e) {
		  
			out.println(e); // exception thrown if user input is not a valid integer
			ZIS_main.myScanner.next(); // this reads invalid input from myScanner and disregards it
			return 0; // returning zero from this method will cause the default case to execute
		}
	}//end payrollMenu()
	
	  public void printCheck(){
			out.println(">>printCheck()");	
		  }
	
	  public void addEmployee(String sqlInsert){
		  
		  out.println(">>addEmployee()");
	  
	  }
	  public void deleteEmployee(String sqlDelete){
		  
		  out.println(">>deleteEmployee()");
	  
	  }
	  
	  public void processPayroll() {
		  out.println(">>processPayroll()");
	  }


}//end Payroll class

class Employee extends Payroll{
	/*
	 *    employeeID
    firstName
    lastName
    streetAddress
    withholdingAmount
    wage
    grossIncomeYTD
    hoursWorkedYTD
    paidTimeOffBalance
    sickTimeBalance
    
      calculateCompensationYTD()
    calculatePTOBalance()
    calculateSickBalance()	
	 * 
	 * 
	 */
	
}//end Employee class

class Paycheck extends Payroll{
	
	/*
	 * calendarWeek 
    hoursWorkedThisPayPeriod
    vacationTimeUsed
    sickTimeUsed
    taxWithheld
    total
    
        calculatePaycheckTotal()
    printCheck() 
	 * 
	 */
	
}//end Paycheck class
