package pkg1;

public class ConstructerTest {
	
	public ConstructerTest() {
		this(2,3,4);
		System.out.println("Default Constructor");
	}
	public ConstructerTest(int a) {
		this();
		System.out.println("One Parameterized Constructor");
	}
	public ConstructerTest(int a, int b) {
		this(2);
		System.out.println("Two Parameterized Constructor");
	}
	public ConstructerTest(int a, int b, int c) {
		System.out.println("Three Parameterized Constructor");
	}
	public ConstructerTest(int a, int b, int c, int d) {
		this(2, 3);
		System.out.println("Four Parameterized Constructor");
	}
	public void display()
	{
		System.out.println("-------------All The Constructures are printed successfully ---------------");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructerTest resv = new ConstructerTest(2,3,4,5);
		resv.display();

	}

}
