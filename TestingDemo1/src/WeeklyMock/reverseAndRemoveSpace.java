package WeeklyMock;

public class reverseAndRemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I like automation";
		s = s.replaceAll("\\s","");
		String rev = "";
		for(int i = s.length()-1; i>=0;i--)
		{
		rev = rev + s.charAt(i);
		}
		System.out.println(rev);

	}

}