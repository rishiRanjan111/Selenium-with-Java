package package_program_practice;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for finding up to fabnocci series : ");
		int number = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.println("Bleow are the Fibonacci Series up to "+number+" digit:");
		System.out.print(n1+" "+ n2);
		
		for (int i = 1; i<=number-2; i++) {
			n3 = n1 + n2;
			n1= n2;
			n2 = n3;
			System.out.print(" "+n3);
		}
		

	}

}
