package stringProblem;

import java.nio.file.spi.FileSystemProvider;

public class ReverseTheCharacterOfEachWord_8 {

	
public static void revCharOfWord(String string) {	
	
	String [] strArray = string.split(" ");
	String finalString = "";
	
	for(String W : strArray ) {
		
		String revWord = "";
		
		for(int i = W.length()-1; i>=0; i--) {
			
			revWord = revWord + W.charAt(i);
		}
		
		//System.out.println(revWord);
		
		 finalString = finalString + revWord + " ";
	}
	
	System.out.println("The reverse of each word of the string "+string+ " is -->"+ finalString);
	
}

public static void main(String[] args) {
	revCharOfWord("Abhi Rony Bittu");
}

// So after reversing the each character of the original string , repeat the simple reverse of srting. 
/*
 * String [] s1 = finalResult.split(" ");
 * 
 * String allRev = "";
 * 
 * for(int i = s1.length - 1 ; i>=0 ; i--) {
 * 
 * allRev = allRev + s1[i] + " ";
 */



}