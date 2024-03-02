package package_program_practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for checking prime or not : ");
		int number = s.nextInt();
		int isPrime = 0;
		int m = number / 2;
		
		if (number <2) {
			System.out.println("The number "+number+" is not a prime number.");
			
		}
		else {
			
			for (int i=2 ; i<=m ; i=i+1 ) {
				if (number % i ==0) {
					isPrime = 1;
					break;
					
				}
				
			}
			 
			if (isPrime == 1){
				System.out.println(number+" is not a prime number");
				
			}
			else {
				System.out.println(number+" is a prime number");
			}	
			
		
		}

	}

}
