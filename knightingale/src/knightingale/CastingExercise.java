package knightingale;

public class CastingExercise {
//	Dont run this program - just type and understanding how casting works
	public static void main(String[] args) {
		byte b=10;
		
		int i=b;  // will accept - automatic type promotion
		
		byte c=i; // will not accept - because lower type cannot be put in higher
		
		byte d=(byte)i; // Type casting makes it possible to store compatible types.
		
		byte x=10;
		byte y=20;
		
		nyte sum=x*y; // Error is thrown when two bytes are used in a
		                //arthmetic operation, the result will be integer 
		

	}

}
