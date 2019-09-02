package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers to process
		int count = scan.nextInt();
		
		// Create an array to store strings.
		String[] values = new String[count];
		
		// Create an array to store doubles.
		double[] values1 = new double[count];
		
		for (int i=0; i<count; i++) {
		// Read in count of strings to process
			values[i] = scan.next();
			
		// Read in count of doubles to process
			values1[i] = scan.nextDouble();
		}
		// Read in count of numbers to process
		int count1 = scan.nextInt();
		
		// Create an array to store doubles.
		double[] values2 = new double[count1];
		
		// Create an array to store strings.
		String[] firstName = new String[count1];
		String[] lastName = new String[count1];
		
		for (int i=0; i<count1; i++) {
		// Read in count of strings to process
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int count2 = scan.nextInt();
			double totalPrice = 0;
			
			for (int j=0; j<count2; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = 0;
				
				for (int k=0; k<values.length; k++) {
					if (name.equals(values[k])) {
						price = values1[k];
					}
				}
				totalPrice += price * quantity;
			}
			// Read values into the array
			values2[i] = totalPrice;
		}
		
		// Use helper functions to calculate sum, min, and max		
		double max = 0;
		String maxFirst = "";
		String maxLast = "";
		for (int i=0; i<count1; i++) {
			if (values2[i] > max) {
				max = values2[i];
				maxFirst = firstName[i];
				maxLast = lastName[i];
			}
		}
		String maxString = String.format("%.2f", max);
		System.out.println("Biggest: " + maxFirst + " " + maxLast + " (" + maxString + ")");
		
		double min = values2[0];
		String minFirst = firstName[0];
		String minLast = lastName[0];
		for (int i=0; i<count1; i++) {
			if (values2[i] < min) {
				min = values2[i];
				minFirst = firstName[i];
				minLast = lastName[i];
			}
		}
		String minString = String.format("%.2f", min);
		System.out.println("Smallest: " + minFirst + " " + minLast + " (" + minString + ")");
		
		double totalPrice = 0;
		for (int i=0; i<count1; i++) {
			totalPrice += values2[i];
		}
		double average = totalPrice / count1;
		String averageString = String.format("%.2f", average);
		System.out.println("Average: " + averageString);
	}

}
