package Assignment7;

// inmport utils
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class University implements Serializable { // class

protected String name;
protected String address;
protected List<Discipline> disciplines = new ArrayList<Discipline>(); // Create an ArrayList object creates array list

	// constructor
	public University() {  
		this.name = "";
		this.address = "";
	}
	
	// overloaded constructor
	public University(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// GETTERS
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public List<Discipline> getDisciplines() {
		return disciplines;
	}
	// END GETTERS 
	
	// ADD Discipline method
	public void addDiscipline(String name, int numEmployees) {
		disciplines.add(new Discipline(name, numEmployees));
	}
	
	
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nDisciplines: " + getDisciplines()+"\n";
	}
	
		// DISCIPLINE CLASS (INNER)
		public class Discipline implements Serializable {
			
			private String name;
			private int numEmployees;
			
			// Constructor
			public Discipline() {
				this.name = "";
				this.numEmployees = 0;
			}
			
			// Overloaded Constructor
			public Discipline(String name, int numEmployees) {
				this.name = name;
				this.numEmployees = numEmployees;
			}
			
			// GETTERS
			public String getName() {
				return name;
			}
	
			public int getNumEmployees() { 
				return numEmployees;
			}
			
			// ToSTRING
			public String toString() { 
				return "\n  Name: "+ this.name + "\n  Number of Employees: " + this.numEmployees;
			   }
			
		} // END DISCIPLINE CLASS (INNER)


} // END UNIVERSITY CLASS
