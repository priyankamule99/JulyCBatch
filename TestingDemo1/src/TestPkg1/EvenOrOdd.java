package TestPkg1;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();

	    if ( num % 2 == 0 ) {
	        System.out.println("Entered number is even");
	    }
	     else {
	        System.out.println("Entered number is odd");
	     }

	}

}
