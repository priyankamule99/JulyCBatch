package TestPkg1;

public class ConstructorOverloading {
	
	int id;
	String name;
	int age;
	ConstructorOverloading(int i, String n){
		id= i;
		name= n;
	}
	ConstructorOverloading(int i, String n, int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading c1 = new ConstructorOverloading(234,"priya");
		ConstructorOverloading c2 = new ConstructorOverloading(111,"prasad",45);
		c1.display();
		c2.display();

	}

}
