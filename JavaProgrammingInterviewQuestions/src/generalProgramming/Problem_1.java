package generalProgramming;

public class Problem_1 {
	public static void main(String[] args) 
	/*
	 * Write program to display following output:-
	 * 
	 * 1 
	 * 12 
	 * 1234 
	 * 12345 
	 * 123456 
	 * 1234567
	 */
	{

		String a = "";

		for (int i = 1 ; i<10 ; i ++) {


			a = a + String.valueOf(i);
			

			System.out.println(a);

		}

	}
}
