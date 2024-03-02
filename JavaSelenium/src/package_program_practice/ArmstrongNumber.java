package package_program_practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for checking Armstrong number : ");
		
		int number = s.nextInt();
		String numberlen = String.valueOf(number);
		int length = numberlen.length();
		int real_number = number;
		double  sum = 0;
		
		while(number>0) {
			
			double  reminder = number % 10;
			sum = sum + Math.pow(reminder, length);
			number = number / 10;
		}
		
		if (real_number == (int)sum) {
			System.out.println(real_number+" is a Armstrong Number");
			
		}
		else {
			System.out.println(real_number+" is not a Armstrong Number");
		}

	}

}
