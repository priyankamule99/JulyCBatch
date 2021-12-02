package TestPkg1;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=29,i=2;
		boolean flag= false;
		while(i<=num/2) {
			if(num%i==0) {
				flag= true;
				break;
			}
			++i;
		}
		if(!flag) {
			System.out.println(num + " Prime no");
		}else {
			System.out.println(num + " Not a prime no");
		}

	}

}
