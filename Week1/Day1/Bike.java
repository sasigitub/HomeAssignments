package week1Day1Assignments;

public class Bike {
	
	// Create 2 objects - one from Car class and another from Bike class
	
	// new method for Bike class
	void BikeClass( ) {
		
		System.out.println("Bike Started");
		
	}

	public static void main(String[] args) {
		
		Car ob1 = new Car() ;
		ob1.applyBreak();
		ob1.soundHorn();
		
		Bike ob2 = new Bike() ;
		ob2.BikeClass();

	}

}
