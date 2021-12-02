package TestPkg1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+"\n"+n2);
		for(i=2;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
//Output: 0
//1
//1
//2
//3
//5
//8
//13
//21
//34

//
//package TestPkg1;
//
//public class Fibonacci {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a=0,b=1,c,i,n=10;
//		System.out.println(a+"\n"+b);
//		for(i=0;i<n;i++) {
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
//
//	}
//
//}
//Output:
//	0
//	1
//	1
//	2
//	3
//	5
//	8
//	13
//	21
//	34
//	55
//	89