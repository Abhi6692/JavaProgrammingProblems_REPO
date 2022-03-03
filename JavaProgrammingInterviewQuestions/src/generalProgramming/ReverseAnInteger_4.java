package generalProgramming;

public class ReverseAnInteger_4 {
	
	public static int revNumber(int num) {
		
		int rev = 0 , rem = 0;
		
		while (num!=0) {
			
			rem = num%10;
			
			rev = rev *10 + rem;
			
			num = num/10;
		}
		return rev;
		
	}
	
	
public static void main(String[] args) {
		
		System.out.println(revNumber(12345));
		
   
	}
	
}
