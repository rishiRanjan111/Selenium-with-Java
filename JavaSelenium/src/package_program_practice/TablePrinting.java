package package_program_practice;

import java.util.Scanner;

public class TablePrinting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for you want to print table : ");
		int number = s.nextInt();
		System.out.println("Table of "+number+" is printed below: ");
		for(int i = 1; i<=10; i++) {
			int result = number*i;
			System.out.println(number+" * "+i+" = "+result);
		}

	}

}
