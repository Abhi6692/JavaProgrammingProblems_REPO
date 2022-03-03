package stringProblem;

public class ReverseASentence_7 {

	
	
	
	public static void reverseASentence(String string) {
		
		String sentenceRev = "";
		
		String [] strArray = string.split(" ");
		
		for (int i = strArray.length -1 ; i>=0 ; i--) {
			
			sentenceRev = sentenceRev + strArray[i]+ " ";
			
			}
		
		System.out.println("The Reverse of the Given sentence --"+ string +"--is---> " + sentenceRev);
		
	}
	
	

	
	public static void main(String[] args) {
		
		reverseASentence("This is Rev of a SENTENCE");
	}

}
