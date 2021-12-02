package TestPkg1;

public class Starpattern {
	
//***
//***
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<5; i++) {
//			for(int j=1; j<4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}

//***
//***
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for (int i=0;i<4;i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		
//		}
//	}
	
//*
//**
//***
//****
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for (int j=0;j<4;j++) {
//			System.out.println();
//			System.out.print("*");
//
//			for(int i=0; i<j; i++) {
//				System.out.print("*");
//			}
//		
//		}
//	}
	
//****
//***
//**
//*
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int line=5;
//		for(int i=line;i>=1;i--) {
//				for(int j=(line-i); j>=1; j--) {
//					System.out.print("");
//				}
//				for(int a=1; a<=i;a++) {
//					System.out.print("*");
//					}
//				System.out.println();
//
//			}
//	}
	
// space on left side and then print * one to 4 star pyramid type
//	public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	int line=5;
//	for(int i=1;i<=line;i++) {
//			for(int j=(line-i); j>=1; j--) {
//				System.out.print(" ");
//				//above line for giving space on left side
//			}
//			for(int a=1; a<=i;a++) {
//				System.out.print("*");
//				}
//			System.out.println();
//
//		}
//}
	
// from down it will print one star to up 4 star	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int line=5;
//		for(int i=line;i>=1;i--) {
//				for(int j=(line-i); j>=1; j--) {
//					System.out.print(" ");
//					//above line for giving space on left side
//				}
//				for(int a=1; a<=i;a++) {
//					System.out.print("*");
//					}
//				System.out.println();
//	
//			}
//	}
	
//*
//* *
//* * *
//* * * * it will print give space on left and it will print on middle
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int line=5;
//		for(int i=1;i<=line;i++) {
//				for(int j=(line-i); j>=1; j--) {
//					System.out.print(" ");
//					//above line for giving space on left side
//				}
//				for(int a=1; a<=i;a++) {
//					System.out.print("* ");
//					//above line give space after *
//					}
//				System.out.println();
//	
//			}
//	}
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int line=5;
			for(int i=line;i>=1;i--) {
					for(int j=(line-i); j>=1; j--) {
						System.out.print(" ");
						//above line for giving space on left side
					}
					for(int a=1; a<=i;a++) {
						System.out.print("* ");
						//above line give space after *
						}
					System.out.println();
		
				}
		}
	
	
//	public static void main(String args[])
//	{
//	int n, i, j, space = 1;
//	n = 5;
//	space = n - 1;
//	for (j = 1; j<= n; j++)
//	{
//		
//		for (i = 1; i<= space; i++)
//		{
//			System.out.print(" ");
//		}
//		space--;
//		
//		for (i = 1; i <= 2 * j - 1; i++)
//		{
//			System.out.print("*");
//		}
//		System.out.println("");
//		
//	}
//	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=7;
//		for(int i=1;i<=n;i++) {
//			
//				for(int j=n; j>i; j--) {
//					System.out.print(" ");
//					//above line for giving space on left side
//				}
//				for(int a=1; a<=(2 *i)-1;a++) {
//					System.out.print("*");
//					
//					}
//				System.out.println();
//	
//			}
//	}
}

	

		
	
	


