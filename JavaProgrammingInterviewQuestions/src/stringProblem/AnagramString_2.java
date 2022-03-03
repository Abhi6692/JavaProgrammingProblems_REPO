package stringProblem;

import java.util.Arrays;

public class AnagramString_2 {
	//An anagram of a string is another string that contains same characters, 
		//only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.

		public static void main(String[] args) {


			String str1 = "army"; 
			String str2 = "mary";

			char [] arr1 = str1.toLowerCase().toCharArray(); 
			char [] arr2 = str2.toLowerCase().toCharArray();

			Arrays.sort(arr1); 
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {

				System.out.println("Given Strings are ANAGRAM"); }

			else {

				System.out.println("Given Strings are NOT ANAGRAM"); }


		}
}
