package pkg.string;

public class StringAssignment3 {
// Assignement 3 -->my name is rishi-------------ym enam si ihsir

	public static void main(String[] args) {
		String s ="my name is rishi";
		String[] s1 = s.split(" ");
		int len = s1.length;
		String newstr="";
		for (int i=0; i<len; i=i+1) {
			String item = s1[i];
			newstr = item+" "+newstr;
		}
		
		
		int len1=newstr.length();
		String reverse="";
		for (int i=0;i<len1;i=i+1) {
			char ch = newstr.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println(reverse.trim());

	}

	

}
