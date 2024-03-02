package package_program_practice;

import java.util.Scanner;

public class SwappingUisngExtraVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a for swapping: ");
		int a = s.nextInt();
		System.out.println("Enter the value of b for swapping: ");
		int b = s.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping the value of a is: "+a);
		System.out.println("After swapping the value of b is: "+b);
		

	}

}
