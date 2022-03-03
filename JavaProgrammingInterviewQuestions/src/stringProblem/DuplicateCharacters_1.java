package stringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters_1 {

	//This program finds the duplicate character and their count in a given string
	public static void duplicateChars_A(String string) {

		System.out.println("This is Method A");
		
		//edge cases
		if(string==null) {
			System.out.println("NULL String");
		}

		if(string.isEmpty()) {

			System.out.println("EMPTY String");
		}

		if(string.length()==1) {
			System.out.println("Single Character String");
		}


		char[] chars = string.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for(Character C : chars) {

			if(!charMap.containsKey(C)) {

				charMap.put(C, 1);
			}

			else {

				charMap.put(C, charMap.get(C)+1);
			}

		}

		//Print the Map , Iterate using the Entry Interface

		for(Entry<Character, Integer> entry :charMap.entrySet()) {

			if (entry.getValue()>1) {

				System.out.println("The reapeating character is --> " +entry.getKey() +" The Repeat count is --> " + entry.getValue());
			}

			


		}	
	}
	//#########################################################################################

	public static void duplicateChars_B(String string) {

		System.out.println("This is Method B");
		//edge cases
		if(string==null) {
			System.out.println("NULL String");
		}

		if(string.isEmpty()) {

			System.out.println("EMPTY String");
		}

		if(string.length()==1) {
			System.out.println("Single Character String");
		}

		char[] arr = string.toLowerCase().toCharArray(); //toCharArray() returns the array of char , breaks the given string into its chars 


		Map<Character, Integer> map = new HashMap<Character, Integer>();


		for (int i = 0 ; i<arr.length ; i++) {

			if(!map.containsKey(arr[i])) {

				map.put(arr[i], 1);
			}

			else {

				map.put(arr[i], map.get(arr[i])+1);


			}

		}


		for(Entry<Character, Integer> e : map.entrySet()) {

			//System.out.println(e.getKey()+"--"+ e.getValue());



			if (e.getValue()>1) {
				System.out.println("The repeated character is  -- "+e.getKey()+ "  "  + "The Count is--> " + e.getValue());

			}
			
		}


	}	



	public static void main(String[] args) {
		duplicateChars_A("");
		duplicateChars_B("aaabbcdd");


	}
}