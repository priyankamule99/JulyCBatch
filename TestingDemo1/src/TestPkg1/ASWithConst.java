package TestPkg1;

public class ASWithConst {
	
	public static int a = 45;
	int b =67;
	private static int c =34;
	protected static int d = 98;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(a);
//     System.out.println(b); // private variable value we cannot access getting error output will be 45,34,98
     System.out.println(c);
     System.out.println(d);
		
		
	}

}
