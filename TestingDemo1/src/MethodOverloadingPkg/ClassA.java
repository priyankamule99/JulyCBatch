package MethodOverloadingPkg;

public class ClassA {

	//method overloading
	public static void test() {
		System.out.println("Static Method Test");
	}
	public void test(int a) {
		System.out.println("Non-Static Method test");
	}
	private int test(char g) {
		System.out.println("Char Type Method");
		return 0;
	}
	public static void main(String[] args) {
		ClassA.test();
//		ClassA.test(8);
		ClassA a = new ClassA();
		a.test(9);
		a.test('@');
		
	}
}
