package TestPkg1;

public class ParameterConstr {
	
	int id;
	String name;
	
	ParameterConstr(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterConstr p1 = new ParameterConstr(11,"priya");
		ParameterConstr p2 = new ParameterConstr(55,"paju");
		p1.display();
		p2.display();

	}

}
