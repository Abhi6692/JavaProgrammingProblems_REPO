package arraysProblem;

public class Merge2Arrays_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 2, 3, 4};

		int b[] = {5,6,7,8,9,0,13,11,12};

		int c_length = a.length + b.length;

		int c [] = new int[c_length];

		for(int i=0 ;i<a.length; i++ ) {

			c[i]=a[i];
		}

		for(int i=0 ;i<a.length; i++ ) {

			c[i]=a[i];
		}

		for(int i=0;i<b.length;i++) {
			
			c[a.length+i] = b[i];
			
		}
	
		System.out.println("The third array c elements are  ");
	for(int i = 0; i<c.length;i++) {
		
		System.out.print(c[i]+"|");
	}
	
	
	}

}
