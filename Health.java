import static java.lang.System.out;
import java.util.InputMismatchException;

public class Health {
	
	 public int medicalMenu(){
			
		    out.println("\n###################");
			out.println("#   Medical H&W   #");
			out.println("###################");
		      
			out.print(" 1. Add New Resident\n 2. Update Wellness Record\n 3. Print Record Details\n 9. Exit\n");
			out.print("\nMake a selection: ");
			
				try {
					int medicalSelection = ZIS_main.myScanner.nextInt();
			
					return  medicalSelection;
				}
				catch(InputMismatchException e) {
					
					out.println(e); // exception thrown if user input is not a valid integer
					ZIS_main.myScanner.next(); // this reads invalid input from myScanner and disregards it
					return 0; // returning zero from this method will cause the default case to execute
				}
			
	  }
	

    public void addNewResident(String sqlInsert) {
    	
    	out.println(">>addNewResident(sqlInsert)");
    	
    }
    public void updateWellnessDescription(String sqlUpdate) {
    	
    	  
		out.println(">>updateWellnessDescription(sqlUpdate)");
   	
    }
    public void printJob(){
		out.println(">>printJob()");	
	  }

} // end Health class

class Resident extends Health{
	
	
	    private int id;
	    private int age;
	    private String name;
	    private String species;
	    private String gender;  
	    private double height;
	    private double weight;
	    private String wellnessDescription;
	    
	    public void setID(int id) {
	    	this.id = id;
	    }
	    public int getID() {
	    	return id;
	    }
	    public void setAge(int age) {
	    	this.age = age;
	    }
	    public int getAge() {
	    	return age;
	    }
	    public void setName(String name) {
	    	this.name = name;
	    }
	    public String getName() {
	    	return name;
	    }
	    public void setSpecies(String species) {
	    	this.species = species;
	    }
	    public String getSpecies() {
	    	return species;
	    }
	    public void setGender(String gender) {
	    	this.gender = gender;
	    }
	    public String getGender() {
	    	return gender;
	    }
	    public void setHeight(double height) {
	    	this.height = height;
	    }
	    public double getHeight() {
	    	return height;
	    }
	    public void setWeight(double weight) {
	    	this.weight = weight;
	    }
	    public double getWeight() {
	    	return weight;
	    }
	    public void setWellnessDescription(String description) {
	    	this.wellnessDescription = description;
	    }
	    public String getWellnessDescription() {
	    	return wellnessDescription;
	    }
}// end Resident class

