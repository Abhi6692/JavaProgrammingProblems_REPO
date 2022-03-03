package sortingAlgorithms;

public class Bubble_Sort_String_2 {

	/*
	 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
	 * swapping the adjacent elements if they are in wrong order
	 * 
	 * Key Points:
	 * 
	 * 1. Number of Rounds = Number of Elements - 1
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] stringArray = {"Abhi" , "A", "Bittu", "AAA"};

		for(String a :stringArray) {

			System.out.print(a + " ");
		}


		//This loop is for number of Rounds
		for (int i = 0; i<stringArray.length; i++) {

			String temp = "";
			int flag = 0;

			for(int j = 0 ; j<stringArray.length-1-i; j++) {

				if(stringArray[j].compareTo(stringArray[j+1])>0) 

				{
					temp = stringArray[j];
					stringArray[j] = stringArray[j+1];
					stringArray[j+1] = temp;
					flag = 1;
				}


			}
			if(flag == 0) {

				break;
			};
		}
		System.out.println("");

		for(String a : stringArray) {

			System.out.print(a + " ");
		}

	}
}
