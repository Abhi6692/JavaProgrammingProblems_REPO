package arraysProblem;

public class CommonElementin2Arrays_11 {

	public static void main(String[] args) {
		
		int [] array1 = {4,3,2,1};
		int [] array2 = {8,7,6,5,4,3,1};
		
		
		for (int i= 0 ; i<array1.length;i++) {
			
			for(int j = 0; j<array2.length;j++) {
				
				
				if(array1[i]==array2[j]) {
					
					System.out.print(array1[i]+" ");
				}
			}
		}
	}

}
