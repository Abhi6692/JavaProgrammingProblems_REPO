package generalProgramming;

import java.util.Scanner;

public class GetUserInput_00 {

	
	
	public static void getUserInput() {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter Your Name - ");
		String name = S.next();
		
		System.out.println("Enter Your Gender - ");
		char gender = S.next().charAt(0);
		
		System.out.println("Enter your age - ");
		int age = S.nextInt();
		
		System.out.println("Enter your number - ");
		long number = S.nextLong();

		System.out.println("----------") ;
		System.out.println("Name Enterted is -- "+ name) ;
		System.out.println("Gender Enterted is -- "+ gender) ;
		System.out.println("Age Enterted is -- "+ age) ;
		System.out.println("Number Enterted is -- "+ number) ;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		getUserInput();
	}

}
