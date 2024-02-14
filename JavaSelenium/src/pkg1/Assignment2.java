package pkg1;

public class Assignment2 {
//	((((10/2)-2)+2)-2)/2)
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public int divide(int a, int b) {
		int c = a/b;
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 obj1 =new Assignment2();
		
		int divResult1=obj1.divide(10, 2);
		int subResult = obj1.sub(divResult1, 2);
		int sumResult = obj1.add(subResult, 2);
		int subResult2 = obj1.sub(sumResult, 2);
		int divResult2 = obj1.divide(subResult2, 2);
		System.out.println("Final Result of expression ((((10/2)-2)+2)-2)/2): " + divResult2);

	}

}
