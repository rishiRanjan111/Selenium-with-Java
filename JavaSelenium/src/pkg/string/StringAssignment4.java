package pkg.string;

public class StringAssignment4 {
	//Assignement4 ->  my name is rishi------------ihsir si eman ym
	public static void main(String[] args) {
		 String s = "my name is rishi";
		 int len = s.length();
		 String newstr = "";
		 for(int i=0; i<len;i=i+1) {
			 char ch = s.charAt(i);
			 newstr = ch + newstr;
		 }
		 System.out.println(newstr);

	}

}
