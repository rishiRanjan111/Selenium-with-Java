package pkg1;

public class Microsoft extends Google {
	
	public Microsoft() {
		super(2,4);
		System.out.println("Child default constructor");
	}
	

	public Microsoft(int a) {
		this(2,3,5);
		System.out.println("Child One parameterized constructor");
	}
	public Microsoft(int a, int b) {
		this();
		System.out.println("Child two parameterized constructor");
	}
	public Microsoft(int a, int b, int c) {
		this(3,4);
		System.out.println("Child three parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Microsoft soft1 = new Microsoft(2);

	}

}
