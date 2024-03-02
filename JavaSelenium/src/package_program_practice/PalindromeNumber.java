package package_program_practice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for checking palindrome number : ");
		int number = s.nextInt();
		int reverse = 0;
		int real_number = number;
		
		while(number>0) {
			int reminder = number % 10;
			reverse = reverse*10 + reminder;
			number = number /10;
		}
		
		if (real_number == reverse){
			System.out.println(real_number+" is a palindrome number");
			
		}
		else {
			System.out.println(real_number+" is not a palindrome number");
		}
		

	}

}
