package stringProblem;

public class ReverseAString_3 {

	public static void revString(String string) {
		
		String rev = "";
		
		for(int i = string.length()-1; i>=0; i--) {
			
			rev = rev + string.charAt(i);
		}
		System.out.println("The String reverse or the given string " +"<"+string+">" + " is -->  " + rev);
	}
	
	
	
	
	
	public static void main(String[] args) {
		revString("RONY");
	}
}
