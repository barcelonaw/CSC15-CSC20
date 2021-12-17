// MICO BARCELONA

package Main;

public class Homework6 {

	public static void main(String[] args) {
		
		// Object		//Default Constructor
		
		Arithmetic ar = new Arithmetic(1,5);
		
		// to string		
				
		ar.toString();
		
			System.out.println(ar.toString());
		
		
				// add the integers
		
		ar.add();
		
			System.out.println(ar.add());
		
				// subtract the integers
		
		
		ar.subtract();
		
			System.out.println(ar.subtract());
		
		
				// Multiply the integers
			
		ar.multiply();
		
		
			System.out.println(ar.multiply());
		
				// Divide the integers
		
		ar.divide();
		
			System.out.println(ar.divide());
				
				//Percent of integers
		
		ar.modulo();
		
			System.out.println(ar.modulo());
				
				// change values to 4 and 8
		
			System.out.println("____________________________________________");
			
		 ar.changeValues(4, 8);
		
		

				// print out integers
		
		ar.toString();
		
			System.out.println(ar.toString());
				
				// add the integers
		
		ar.add();
		
			System.out.println(ar.add());
				
				// subtract the integers
		
		ar.subtract();
		
			System.out.println(ar.subtract());
				
				// Multiply the integers
		
		ar.multiply();
		
			System.out.println(ar.multiply());
				
				// Divide the integers
		
		ar.divide();
		
			System.out.println(ar.divide());
				
				//Percent of integers
		
		ar.modulo();
		
		
			System.out.println(ar.modulo());
			
			
			
			System.out.println("____________________________________________");
				
				// use static method
			
			
		System.out.println(Arithmetic.staticAdd(3,3));
		
		
		
	}

}

