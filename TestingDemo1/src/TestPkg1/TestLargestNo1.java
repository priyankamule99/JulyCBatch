package TestPkg1;

public class TestLargestNo1 {
	
	public static void main(String[] args) {
		int a = 25;
		int b = 30;
		int c = 50;
		int d = 70;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a is greater");
				}
				else {
					System.out.println("d is greater");
				}
			}
			else {
				if(b>c) {
				    System.out.println("b is greater");
				}
				else {
					System.out.println("c is greater");
				}
			}
		} else {
			  if(c>d) {
					System.out.println("c is greater");
			 } 
			  else {
					System.out.println("d is greater");
					}
			  }
		}
}
