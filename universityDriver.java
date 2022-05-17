package Assignment7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class universityDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Universities 
		ArrayList<University> universitiesArray = new ArrayList<>();
		
		universitiesArray.add(new University("NUI Galway", "University Road, Galway") );
		universitiesArray.get(0).addDiscipline("History", 15);
		universitiesArray.get(0).addDiscipline("Philosophy", 3);
		universitiesArray.get(0).addDiscipline("Classics", 5);
		
		universitiesArray.add(new University("NUI Maynooth", "University Road, Maynooth") );
		universitiesArray.get(1).addDiscipline("Maths", 20);
		universitiesArray.get(1).addDiscipline("Husbandry", 8);
		universitiesArray.get(1).addDiscipline("Dressage", 35);
		
		universitiesArray.add(new University("NUI Dublin", "University Road, Dublin") );
		universitiesArray.get(2).addDiscipline("Engineering", 12);
		universitiesArray.get(2).addDiscipline("Law", 3);
		universitiesArray.get(2).addDiscipline("English", 42);
		
		for (University p : universitiesArray) { // for loop
        	System.out.println(p.toString()); // Overridden toString()	
        		
        } // end for loop
		
		System.out.println("Serializing . . .\n"); 
		serialize(universitiesArray); // 
		
		System.out.println("\n\nDeserializing . . .\n");
		deserialize(universitiesArray);
	}	
	
	// SERIALISE
	public static void serialize(ArrayList<University> universitiesArray) {
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(universitiesArray);
			out.close();
			//fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (Exception i) {
			i.printStackTrace();
		}
	}
	
	// DESERIALIZE
	public static void deserialize(List<University> universitiesArray) {
		try {
	         FileInputStream fileIn = new FileInputStream("employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         ArrayList<University> List = (ArrayList<University>) in.readObject();
	         for (University u: List) {
	        	 System.out.println(u.toString());
	         }
	         in.close();
         
	     } catch (Exception e) {
	         e.printStackTrace();
	    
	      } 
	}
		
} // end class
