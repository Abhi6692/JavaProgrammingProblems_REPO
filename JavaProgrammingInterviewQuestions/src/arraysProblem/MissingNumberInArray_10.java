package arraysProblem;

public class MissingNumberInArray_10 {

	//This logic will work only for the array which are in Sequence / Sequential Order

		public static void main(String[] args) {

			int a [] = {10, 11, 13,14, 15, 16 , 17};

			int sum1 = 0;


			//sum of the array a
			for (int i =0 ; i<a.length ; i++) {

				sum1 = sum1 + a[i];


			}

			int sum2 =0;
			//sum of numbers from 10 to 17
			for(int i = 10 ; i<=17 ; i++) {

				sum2 = sum2 + i;
			}

			//System.out.println(sum2);

			if(sum2-sum1!=0) {
				System.out.println("The missing number is:  "+ (sum2-sum1));
			}
			else {
				System.out.println("There is no number missing");

			}

		}

}
