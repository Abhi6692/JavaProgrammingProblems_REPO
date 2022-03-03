package arraysProblem;

public class Bubble_Sort_Array__Ascendiing_4 {



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

		int [] numArray = {1,12, 3, 1, 30, 34, 76, 98};

		for(int a :numArray) {

			System.out.print(a + " ");
		}


		//This loop is for number of Rounds
		for (int i = 0; i<numArray.length; i++) {

			int temp = 0;
			int flag = 0;

			for(int j = 0 ; j<numArray.length-1-i; j++) {

				if(numArray[j] > numArray[j+1]) 

				{
					temp = numArray[j];
					numArray[j] = numArray[j+1];
					numArray[j+1] = temp;
					flag = 1;
				}


			}
			if(flag == 0) {

				break;
			};
		}
		System.out.println("");

		for(int a :numArray) {

			System.out.print(a + " ");
		}

	}

}
