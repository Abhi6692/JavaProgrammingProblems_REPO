package stringProblem;

public class GenericFunctionToIsolateLast4Digit_4 {

	
	public static void genericFunctionToIsolateLast4Digit_4(String string){
		
		String first4Digit = string.substring(0,4);
		
		String last4Digit = string.substring(string.length()-4);
		
		
		System.out.println("The First 4 digit is ---> " + first4Digit);
		System.out.println("The Last 4 digit is ---> " + last4Digit);
	}
	
	
	public static void main(String[] args) {
		genericFunctionToIsolateLast4Digit_4("1234 56 4321");
	}
}
