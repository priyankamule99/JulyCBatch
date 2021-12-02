package MethodOverloadingPkg;

public class OverloadMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Method");
		main(9);
	}
	public static void main(int args) {
		System.out.println("int main method");
	}

}
