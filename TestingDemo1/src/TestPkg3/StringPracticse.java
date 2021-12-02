package TestPkg3;

public class StringPracticse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "Velocity";
//		String b = "Velocity";
		String a = "Veliocityilio";
		String b = "Velocity Class Batch 2021";
//		String c = new String("Velocity");
//		String d = new String("Velocity");
//		
//		System.out.println(a==b);
//		System.out.println(c==d);
//		System.out.println(a==d);
//		
//		System.out.println("-------------------");
//		b = "Class";
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a==b);
//		
//		System.out.println("------------------");
//		b = "Velocity";
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a==b);
//		
//		boolean v = a.equals(b);
//		System.out.println(v);
//        
//		v=a.equals("Velocity");
//		System.out.println(v);
//		
//		v=a.equalsIgnoreCase("Velocity");
//		System.out.println(v);
//		
//		a=a.toUpperCase();
//		System.out.println(a);
//		
//		b=b.toLowerCase();
//		System.out.println(b);
//		
//		int i=a.length();
//		System.out.println(i);
//		
		System.out.println(b.charAt(0));
		System.out.println(b.indexOf('i') );
		System.out.println(b.lastIndexOf('i'));
		
		System.out.println(a.indexOf("lio"));
		System.out.println(a.lastIndexOf("lio"));
		
		System.out.println(a.startsWith("Veli"));
		System.out.println(a.endsWith("ity"));

		System.out.println(b.substring(3));
		System.out.println(b.substring(10, 17));
		
		b = "  Velocity 24July Batch C  ";
		System.out.println(b);
		System.out.println(b.trim());
		
		String e = "Velocity Batch 24July 2021";
		System.out.println(e);
		String x[] = e.split(" ");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		System.out.println(b.replace('t', 'G'));
		System.out.println(b.replace("ity", "ABC"));

	}

}
