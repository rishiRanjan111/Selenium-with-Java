package pkg1;

public class Google {
	public Google() {
		this(3,4,6);
		System.out.println("Parent default constructor");
	}
	public Google(int a) {
		this();
		System.out.println("Parent One Parameterized constructor");
	}
	public Google(int a, int b) {
		this(3);
		System.out.println("Parent two Parameterized constructor");
	}
	public Google(int a, int b, int c) {
		System.out.println("Parent three Parameterized constructor");
	}


}
