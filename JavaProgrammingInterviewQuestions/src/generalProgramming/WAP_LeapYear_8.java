package generalProgramming;

public class WAP_LeapYear_8 {
	//Leap Year COndition
	// 1.Divisible by 400
	// 2. Divisible by 4 and not divisible by 100


	public static void isLeapYear(int YEAR) {


		if (YEAR%400==0 || (YEAR%4==0 && YEAR%100!=0)) {

			System.out.println("The year "+ YEAR + " is a Leap Year");
		}	
		else {

			System.out.println("The --> "+ YEAR + " is NOT a Leap Year");

		}

	}

public static void main(String[] args) {
	isLeapYear(2048);
}

}
