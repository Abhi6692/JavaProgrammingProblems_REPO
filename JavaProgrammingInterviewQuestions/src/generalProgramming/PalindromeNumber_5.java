package generalProgramming;

public class PalindromeNumber_5 {
	
	public static void isPalindrome(int num) {

		int originalNum  = num;	

		int rem, rev = 0 ; 


		while (num!=0) {
			
			rem = num % 10;
			rev = rev * 10  + rem;
			num = num/10;
		}

		if (rev == originalNum) {

			System.out.println("The Number is Palindrome");

		}

		else {
			System.out.println("The number is not palindrome");

		}

	}
	
	
	
	public static void main(String[] args) {


        isPalindrome(1011);

}
}