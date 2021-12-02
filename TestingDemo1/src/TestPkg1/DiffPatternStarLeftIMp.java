package TestPkg1;

public class DiffPatternStarLeftIMp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int a=1;a<n;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			for(int i=a;i<=n;i++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int a=1;a<=n;a++) {
			for(int b=a;b<=n;b++) {
				System.out.print("*");
				
			}
			for(int i=1;i<=a;i++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
