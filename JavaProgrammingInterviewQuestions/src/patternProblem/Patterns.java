package patternProblem;

public class Patterns {

	//90 degree star pattern
	//*
	//**
	//***
	//****

	public static void statPattern_1(int n) {

		// outer loop to handle number of rows 
		//  n in this case 

		for(int i = 1 ; i <=n ;i++) {

			//this loop controls the column
			for(int j = 1 ; j<=i ; j++) {

				System.out.print('*');
			}
			System.out.println();
		}
	}

	//Reverse 90 degree Star pattern
	//****
	//***
	//**
	//*
	public static void statPattern_2(int n) {

		// outer loop to handle number of rows 
		//  n in this case 

		for(int i = 1 ; i <=n ;i++) {

			//this loop controls the column
			for(int j = n ; j>=i ; j--) {

				System.out.print('*');
			}
			System.out.println();
		}
	}


	
	//1 
	//1 2 
	//1 2 3 
	//1 2 3 4 
	//1 2 3 4 5 
	public static void statPattern_3(int n) {



		// outer loop to handle number of rows 
		//  n in this case 
		for(int i=1; i<=n; i++) 
		{ 
			// initialising starting number 
			int num=1; 

			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for(int j=1; j<=i; j++) 
			{ 
				// printing num with a space  
				System.out.print(num + " "); 

				//incrementing value of num 
				num = num + 1; 
			} 

			// ending line after each row 
			System.out.println(); 
		} 

	}

	
	//1 
	//2 3 
	//4 5 6 
	//7 8 9 10 
	//11 12 13 14 15 
	public static void statPattern_4(int n) {


		// initialising starting number 
		int num=1; 

		// outer loop to handle number of rows 
		//  n in this case 
		for(int i=1; i<=n; i++) 
		{ 

			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for(int j=1; j<=i; j++) 
			{ 
				// printing num with a space  
				System.out.print(num + " "); 

				//incrementing value of num 
				num = num + 1; 
			} 

			// ending line after each row 
			System.out.println(); 
		} 

	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statPattern_1(4);
		System.out.println("-------------------");
		statPattern_2(4);
		System.out.println("-------------------");
		statPattern_3(5);
		System.out.println("-------------------");
		statPattern_4(5);
	}

}
