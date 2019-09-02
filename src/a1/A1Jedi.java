package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		// Create an array to store strings.
		String[] itemName = new String[count];
		
		// Create an array to store doubles.
		double[] values1 = new double[count];
		
		for (int i=0; i<count; i++) {
		// Read in count of strings to process
			itemName[i] = scan.next();
			
		// Read in count of doubles to process
			values1[i] = scan.nextDouble();
		}
		// Read in count of numbers to process
		int countCustomer = scan.nextInt();
		int[] totalNumber = new int[count];
		int[] total = new int[count];
		
		for (int i=0; i<countCustomer; i++) {
			// Read in count of strings to process
			String firstName = scan.next();
			String lastName = scan.next();
			int countItem = scan.nextInt();
			// Create an array to store numbers.
			int[] countQuantity = new int[countItem];
			String[] itemName2 = new String[countItem];
			int countNumber = 0;
			int countTotal = 0;
			for (int j=0; j<countItem; j++) {
				countQuantity[j] = scan.nextInt();
				itemName2[j] = scan.next();
				if (itemName2[j].equals(itemName[i])) {
					countNumber++;
					countTotal += countQuantity[j];
				}
			}
		totalNumber[i] = countNumber;
		total[i] = countTotal;
		}
		for (int i=0; i<count; i++) {
			if (totalNumber[i] == 0) {
				System.out.println("No customers bought " + itemName[i]);
			} else {
				System.out.println( total[i] + " customers bought " + totalNumber[i] + " " + itemName[i]);
			}
		}
	}
	
}
