package TestPkg1;

public class LargestNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 35;
		int b = 56;
		int c = 20;
		int d = 30;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a is greater");
				}
				else {
					System.out.println("d is greater");
				}
			}
		} else if(b>c) {
			if(b>d) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("d is greater");
			}
		
		} else if(c>d) {
			
			System.out.println("c is greater");
		}
		else {
			System.out.println("d is greater");
		}
		
	}
}
