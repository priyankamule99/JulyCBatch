package TestPkg1;

public class DefaultConstValue {
	
	int id;
	String name;
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstValue d1 = new DefaultConstValue();
		DefaultConstValue d2 = new DefaultConstValue();
		d1.display();
		d2.display();

	}

}
