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
		int[] totalItemBought = new int[count];
		int[] numberOfCustomerBought = new int[count];
		
		for (int i=0; i<countCustomer; i++) {
			// Read in count of strings to process
			String firstName = scan.next();
			String lastName = scan.next();
			int countItem = scan.nextInt();
			int[] boughtOrNot = new int[count];
			// Create an array to store numbers.
			for (int j=0; j<countItem; j++) {
				int numberOfItem = scan.nextInt();
				String itemName2 = scan.next();
				
				for (int k=0; k<count; k++) {
					int temp = 0;
					if (itemName[k].equals(itemName2)) {
						temp = numberOfItem;
						totalItemBought[k] += temp;
						boughtOrNot[k] = 1;
					} 
				}
			}
			
			for (int l=0; l<count; l++) {
				if (boughtOrNot[l] == 1) {
					numberOfCustomerBought[l]++;
				}
			}
		}
		for (int i=0; i<count; i++) {
			if (numberOfCustomerBought[i] == 0) {
				System.out.println("No customers bought " + itemName[i]);
			} else {
				System.out.println(numberOfCustomerBought[i] + " customers bought " + totalItemBought[i] + " " + itemName[i]);
			}
		}
	}
	
}
