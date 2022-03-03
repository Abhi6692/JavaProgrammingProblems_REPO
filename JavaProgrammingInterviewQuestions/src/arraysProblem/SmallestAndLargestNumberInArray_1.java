package arraysProblem;

public class SmallestAndLargestNumberInArray_1 {

	public static void main(String[] args) {

		int numbers[] = {1,-1000 ,20 , -90 , 100, 10001};

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i =0 ; i<numbers.length; i++)
		{
			if (numbers[i] > largest) {
				largest = numbers[i];

			}

			else if (numbers[i] < smallest){
				smallest = numbers[i];

			}
		}

		System.out.println("The largest Number is  "+ largest );
		System.out.println("The smallest Number is  "+ smallest);



	}

}
