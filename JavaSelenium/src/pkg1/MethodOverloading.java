package pkg1;

public class MethodOverloading {
	
	public void sum(int a, int b) {
		int c ;
		c = a + b;
		System.out.println("Result: "+c);
	}
	
	public void sum(int a, int b, int c) {
		int result = a+ b+c;
		System.out.println("Result: "+result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading ob=new MethodOverloading();
		ob.sum(56, 89);
		ob.sum(89, 56, 5);

	}

}
