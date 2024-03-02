package pkg1;

public class MethodOverridingB extends MethodOverridingA {
	
	public void arithmatic(int a ,int b) {
		int result = a-b;
		System.out.println("Result: "+result);
	}

	public static void main(String[] args) {
		
		MethodOverridingB ob = new MethodOverridingB();
		ob.arithmatic(89, 79);
	}

}
