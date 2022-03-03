package generalProgramming;

public class Factorial_2 {


	//Without using recursive --> Normal for  loop
	public static  int factorial(int num) {

		int fact = 1;

		if (num==0) {
			return 1;
		}

		else {

			for (int i = 1 ; i<=num ; i++) {

				fact = fact * i;
			}
		}
		return fact;

	}

	//With recursive

	public static int factorialWithRecursive(int num) {



		if (num == 0) {
			return 1;}

		else {

			return (num * factorialWithRecursive(num-1));

		}
	}

	public static void main(String[] args) {

		System.out.println(factorial(4));

		System.out.println(factorialWithRecursive(8));

	}


}
