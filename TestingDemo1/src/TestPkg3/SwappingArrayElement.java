package TestPkg3;

public class SwappingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,40,60,80,100};
		int temp;
		int n=a.length;
		for(int i=0;i<(n/2);i++)
		{
			temp=a[i];
			a[i]=a[(n-1)-i];
			a[(n-1)-i]=temp;
		}

		for(int i=0;i<n;i++)
		{
			System.out.println(a[i] + " ");
		}
	}

}
