package TestPkg1;

public class ClassB {
	public static int a = 45;
	int b =67;
	private static int c =34;
	protected static int d = 98;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println(ASWithConst.a);
//	     System.out.println(ASWithConst.b);  this b & c not accepting in class B output will be 45,98
//	     System.out.println(ASWithConst.c);
	     System.out.println(ASWithConst.d);

	}

}
