package knightingale;

import java.util.Scanner;


public class PrintANumber {

	public static void main(String[] args) {
		// create a reader instance which takes 
		// input from standard input - keyboard
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		// nextInt() read the next integer from the keyboard
		int number = reader.nextInt();
		
		// print() prints the following line to the output screen
		System.out.println("you entered: " + number);

	}

}
