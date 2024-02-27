package pkg1;

public class Samsung extends Apple{
	public void method1() {
		System.out.println("Child default method");
	}
	public void method2(int a) {
		System.out.println("Child one parameterized method");
	}
	public void method3(int a, int b) {
		super.m2(4);
		System.out.println("Child two parameterized method");
	}
	public void method4(int a, int b, int c) {
		this.method3(3, 5);
		this.method2(4);
		this.method1();
		System.out.println("Child three parameterized method");
	}
	
	
	public static void main(String[] args) {
		
		Samsung sam = new Samsung();
		sam.method4(4, 4, 4);
		

	}

}
