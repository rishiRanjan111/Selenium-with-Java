package package_program_practice;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for finding factorial : ");
		int number = s.nextInt();
		int fact = 1;
		
		for(int i = 1; i<=number; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of "+number+" is : "+fact);
	}

}
