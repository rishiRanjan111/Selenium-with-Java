package pkg1;

public class Apple {
	
	public void m1() {
		System.out.println("Parent class default Method");
	}
	public void m2(int a) {
		this.m3(5, 5);
		this.m1();
		this.m4(4, 32, 4);
		System.out.println("Parent class one parameterized  Method");
	}
	public void m3(int a, int b) {
		System.out.println("Parent class two  parameterized  Method");
	}
	public void m4(int a, int b, int c) {
		System.out.println("Parent class three parameterized  Method");
	}


}
