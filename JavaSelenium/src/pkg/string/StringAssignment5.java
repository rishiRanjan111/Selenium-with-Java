package pkg.string;

public class StringAssignment5 {
	//Assignment5 ->my name is rishi-----------occurence of character i here

	public static void main(String[] args) {
		String s="my name is rishi";
		int len = s.length();
		char expected = 'i';
		int count =0;
		for(int i=0; i<len; i=i+1) {
			char ch = s.charAt(i);
			if (ch == expected) {
				count = count+1;
				
			}
		}
		System.out.println("Total occurence of i are : "+count);

	}

}
