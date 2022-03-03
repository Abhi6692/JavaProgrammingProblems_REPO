package generalProgramming;

public class SwapTwoInteger_7 {

	public static void main(String[] args) {
		
	    
		//3 Ways 
		// 1. Using a third variable
		// 2. Without using a third variable (two ways , via + and * Operator)
		
		
		//Using a third variable 
		
		
		int x = 10;
		int y = 20;
		
		int z;
		
		z = x; // z=10
		x = y;// x= 20
		y = z; // y==10
		
		
		// Without using a third variable . Using '+'
		
		int a = 10;
		int b = 20 ;
		
		a = a + b; // a= 30	
		b = a - b;
		a = a - b;
		
		System.out.println("The Swap value of a  "+a);
		System.out.println("The Swap value of b  "+b);
		
		
		// Without using a third variable. Using  '*'
		
		int d = 10;
		int e = 20;
		
		d = d * e;
		e = d / e;
		d = d / e;
		
		System.out.println("The Swap value of d  " + d);
		System.out.println("The Swap value of e  " + e );
			
	}
	
	
}
