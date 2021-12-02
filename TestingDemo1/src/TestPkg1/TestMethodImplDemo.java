package TestPkg1;

public class TestMethodImplDemo {
	static int add(int a, int b) {
		int c = a+b;
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result= add(38,90);
		System.out.println(result);
		result= add(89,90);
		System.out.println(result);

	}

}
