package generalProgramming;

public class PrimeNumber_3 {
	// Prime Number :  a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).		
	// 2 is the lowest prime number


	public static void isPrime(int num) {

		int temp = 0;
		for(int i = 2; i<num;i++) {

			if(num%i==0) {
				temp = temp+1;
			}
		}

		if (temp>0) {

			System.out.println("The Given number " + num + " is not Prime");

		}

		else {
			System.out.println("The Given number " + num + " is  Prime");
		}
	}


	public static void main(String[] args) {

		isPrime(9);

	}
}