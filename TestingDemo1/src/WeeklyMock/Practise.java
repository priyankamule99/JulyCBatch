package WeeklyMock;

import java.util.Arrays;

public class Practise {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String s3="JournalDev";
//		int start=1;
//		char end=5;
//		System.out.println(start+end);
//		System.out.println(s3.substring(start, end));
//	}
//	OutPut: 
//		6
//	    ourn
//public static void main(String[]args) {
//	String str=null;
//	String str1="abc";
//	System.out.println(str1.equals("abc"));
//	System.out.println(str1.equals(null));
//	
//}
//Output: true
//false
//public static void main(String[]args) {
//	String s1 = new String("abc");
//	String s2 = new String("abc");
//	System.out.println(s1==s2);
//	System.out.println(s1.equals(s2));
//	
//}
//Output:
//	false
//	true
public static void main(String[]args) {

	int ar1[] = { 10, 20, 30 };
	int ar2[] = { 40, 50, 60 };
	int ar3[] = { 40, 50, 60 };
	System.out.println(Arrays.equals(ar1, ar2));
	System.out.println(Arrays.equals(ar1, ar3));
	System.out.println(Arrays.equals(ar2, ar3));

}
}
