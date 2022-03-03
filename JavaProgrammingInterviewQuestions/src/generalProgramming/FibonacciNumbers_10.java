package generalProgramming;

public class FibonacciNumbers_10 {


//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
	//The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	public static void fibonaccinumbers() {

		int a = 0 , b = 1, c, loopCount=0;;

		while(loopCount<10) {

			c= a + b;
			System.out.println(c);
			a=b;
			b=c;
			loopCount++;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonaccinumbers();
	}

}
