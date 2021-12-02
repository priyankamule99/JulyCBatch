package TestPkg1;

public class LargestNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 95;
		int b = 56;
		int c = 20;
		int d = 30;
		int e = 85;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					if(a>e) {
						System.out.println("a is greater");
					}
				else {
					System.out.println("e is greater");
				}
			} 
				else if(b>c) {
			    if(b>d) {
				if(b>e) {
					System.out.println("b is greater");

				}
			else {
				System.out.println("e is greater");
			}
		
		} else {
			System.out.println("b is greater");

		}
		}
		else if(c>d) {
			if(c>e) {
				System.out.println("c is greater");

			} else {
				System.out.println("d is greater");

			}
		} 
				else if(d>e){
			System.out.println("e is greater");
		}
			}
		}
	}
}
