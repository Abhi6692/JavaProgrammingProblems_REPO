package generalProgramming;

public class Calculator_9 {




	public static void calculator(int number1 , int number2 , String symbol) {

		int result ;
		switch(symbol) {

		case "+": result = number1 + number2;
		System.out.println("The Sum of these two numbers are -- "+ result);
		break;
		
		case "-": result = number1 - number2;
		System.out.println("The Subtraction of these two numbers are -- "+ result);
		break;
		
		case "*": result = number1 * number2;
		System.out.println("The multiplacation of these two numbers are -- "+ result);
		break;
		
		case "/": result = number1 / number2;
		System.out.println("The division of these two numbers are -- "+ result);
		break;
		
		default : System.out.println("Invalid Operatiom -- " + symbol);
			
		}
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator(4,4,"%");
	}

}
