package TestPkg3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//normal call
		System.out.println(ClassA.a);
		ClassA.test();
		
		ClassA a1 = new ClassA();
	    System.out.println(a1.b);
	    a1.test1();
	    
	    //inheritance
		System.out.println(ClassB.c);
		ClassB.method1();

		ClassB b1 = new ClassB();
		System.out.println(b1.d);
		b1.method2();
		
		//normal call
		ClassB.method1();
		System.out.println(ClassB.c);
		b1.method2();
		System.out.println(b1.d);
		
		//inheritance
		System.out.println(ClassC.e);
		ClassC.test3();
		
		ClassC c1 = new ClassC();
		c1.method3();
		System.out.println(c1.f);
		
		//normal call
		System.out.println(ClassC.e);
		ClassC.test3();
		System.out.println(c1.f);
		c1.method3();

		
		
	}

}
