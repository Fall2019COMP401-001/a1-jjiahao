package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Read in count of numbers to process
		int count = scan.nextInt();
		
		for (int i=0; i<count; i++) {
		// Read in count of strings to process
			String first = scan.next();
			String last = scan.next();
			
		// Read in count of numbers to process
			int noOfItem = scan.nextInt();
		// Calculate the total price
			double priceTotal = 0;
			String priceTotalFinal = "";
			for (int j=0; j<noOfItem; j++) {
				int number = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				priceTotal += price * number;
				priceTotalFinal = String.format("%.2f", priceTotal);
			}
		
		// Take the first letter initial of the first name
		char firstLetter = first.charAt(0);
		// Print results
		System.out.println(firstLetter + ". " + last + ": " + priceTotalFinal);
		}
	}
}
