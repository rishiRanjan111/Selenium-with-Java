package pkg1;

public class Assignment1 {

//((((10+2)+2)-2)*2)/2)
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	public int multiply(int a, int b) {
		int c = a*b;
		return c;
	}
	public void divide(int a, int b) {
		int c = a/b;
		System.out.println("Final Result of expression ((((10+2)+2)-2)*2)/2): "+ c);
	}
	public static void main(String[] args) {
		
		Assignment1 obj1=new Assignment1();
		int sumResult = obj1.add(10, 20);
		int sumResult1 = obj1.add(sumResult, 2);
		int subResult = obj1.sub(sumResult1, 2);
		int multResult = obj1.multiply(subResult, 2);
		obj1.divide(multResult, 10);
	}

}
