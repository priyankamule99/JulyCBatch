package TestPkg1;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "The best of both worlds";
		int count = 0;
		for(int i =0;i<string.length();i++) {
			if(string.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total no. of character in a string " + count);

	}

}
