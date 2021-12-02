//package TestPkg3;
//
//public class ReverseArray {
//    public static void main(String[] args) {  
//
//	int [] arr = new int [] {1, 2, 3, 4, 5};  
//    System.out.println("Input: ");  
//    for (int i = 0; i < arr.length; i++) {  
//        System.out.print(arr[i] + " ");  
//    }  
//    System.out.println();  
//    System.out.println("Output: ");  
//    //Loop through the array in reverse order  
//    for (int i = arr.length-1; i >= 0; i--) {  
//        System.out.print(arr[i] + " ");  
//    }  
//
//
//}
//
//}


//package TestPkg3;
//
//public class ReverseArray {
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int [] a= {34,67,89,99,25};
//		int b[]=new int[a.length];
//
//		for(int i=0;i<a.length;i++) {
//			b[(a.length-1)-i]=a[i];
//			System.out.println(b[i]);
//			}
//	}
//
//}

package TestPkg3;

public class ReverseArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {34,67,89,99,25};
		int b[]=new int[5];

//		for(int i=0;i<a.length;i++) {
//			b[(a.length-1)-i]=a[i];
//			System.out.println();
//			}
		for(int c=(b.length-1); c>=0;c--) {
			System.out.println(a[c]+" ");
		}
	}

}