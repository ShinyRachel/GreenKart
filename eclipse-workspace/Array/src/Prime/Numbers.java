package Prime;

import java.util.Arrays;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Prompt the user to enter the numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Close the scanner
        sc.close();

	        for (int i = 0; i < array.length; i++) 
	        {      
	            int num = array[i];
	            boolean isPrime = true;

	            if (num <= 1) {
	                isPrime = false; // Numbers less than or equal to 1 are not prime
	            } else {
	                for (int j = 2; j <= Math.sqrt(num); j++) {
	                    if (num % j == 0) {
	                        isPrime = false;
	                        break; // No need to check further if a divisor is found
	                    }
	                }
	            }

	            if (isPrime) {
	                System.out.println(num + " is a prime number");
	            }
	        }
	    }
	}
