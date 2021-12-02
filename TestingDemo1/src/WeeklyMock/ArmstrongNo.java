package WeeklyMock;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 153; 
		int arm =0; 
		int rem,c;
		c=n;
		 	while(n>0)
		 	{
		       	rem = n%10;/// 3--5--1
		       	arm = (rem*rem*rem)+arm;
		       	 n = n/10;  /// 15----1--0
		 	}
		 	if(c==arm)
		 	{
		       	System.out.println("Number is armstrong number");
		 	}
		 	else
		       	System.out.println("Number is not an armstrong number");
		}

	}


