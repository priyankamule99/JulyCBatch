package WeeklyMock;

import java.util.Arrays;

public class ArrayEqualProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = { 10, 20, 30 };
		int ar2[] = { 40, 50, 60 };
		int ar3[] = { 40, 50, 60 };
		System.out.println(Arrays.equals(ar1, ar2)); //false
		System.out.println(Arrays.equals(ar1, ar3));// false
		System.out.println(Arrays.equals(ar2, ar3)); //true

		
		//Arrays.deepEquals(arg0, arg1);
        //use to compare 2 multi dimentional array

	}

}
