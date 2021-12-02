package WeeklyMock;

public class SeprateSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "ajajAls**&^%djdjalGGF";
		
		S = S.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(S);

	}

}
