package TestPkg1;

public class RightSideStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int a=1;a<=n;a++) {
			for(int b=a;b<=n;b++) {
				System.out.print(" ");
			}
			for(int i=1;i<=a;i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
