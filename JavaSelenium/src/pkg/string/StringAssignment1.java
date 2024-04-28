package pkg.string;

import java.util.Scanner;

public class StringAssignment1 {
	//Assignement - >  A String is palindrome or not?

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check , is it palindrome or not?");
		String s = sc.next();
		int len = s.length();
		String reverse = "";
		for (int i=0;i<len; i=i+1) {
			char s1=s.charAt(i);
			reverse=s1 + reverse;
		}
//		System.out.println(reverse);
		
		if (s.equals(reverse)) {
			System.out.println("It is palindrome String.........");
		}
		else {
			System.out.println("It is not palindrome String.........");
		}

	}

}
