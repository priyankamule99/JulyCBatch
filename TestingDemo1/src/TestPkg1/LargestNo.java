package TestPkg1;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 50;
		int c = 80;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else {
			if (b>c) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}

	}

}
