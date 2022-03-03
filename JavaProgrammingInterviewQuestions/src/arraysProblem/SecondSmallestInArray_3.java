package arraysProblem;

public class SecondSmallestInArray_3 {

	public static void main(String[] args) {



		int [] a = {100, 300 , 300 , 400 , 500, 600,1,2};

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for(int i = 0 ; i<a.length; i++) {

			if(a[i] < smallest) {

				secondSmallest = smallest;
				smallest = a[i];				
			}

			else if(a[i] < secondSmallest && a[i]!=smallest	) {
				secondSmallest = a[i];

			}
		}

		System.out.println("The Second Largest in the given array is ---> " + secondSmallest );

	}
}

