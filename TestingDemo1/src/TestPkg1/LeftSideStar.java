package TestPkg1;

public class LeftSideStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int a=1;a<=n;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
				
			}
			for(int i=a;i<=n;i++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}

	}

}
