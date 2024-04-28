package pkg.string;

public class StringAssignement2 {
		//Assignment 2 -> my name is rishi-------------rishi is name my
	public static void main(String[] args) {
		
		String s ="my name is rishi";
		String[] s1 = s.split(" ");
		int len = s1.length;
		String newstr="";
		for (int i=0; i<len; i=i+1) {
			String item = s1[i];
			newstr = item +" "+ newstr;
		}
		System.out.println(newstr);

	}

}
