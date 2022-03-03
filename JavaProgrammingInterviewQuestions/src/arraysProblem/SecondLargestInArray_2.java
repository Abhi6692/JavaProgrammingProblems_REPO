package arraysProblem;

public class SecondLargestInArray_2 {

	public static void main(String[] args) {
		

		
		int [] a = {100, 200 , 300 , 400 , 500, 600};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0 ; i<a.length; i++) {
			
			if(a[i] > largest) {
				
				secondLargest = largest;
				largest = a[i];				
			}
			
			else if(a[i] > secondLargest && a[i]!=largest	) {
				secondLargest = a[i];
				
			}
		}
		
		System.out.println("The Second Largest in the given array is ---> " + secondLargest );
		
	}

}
