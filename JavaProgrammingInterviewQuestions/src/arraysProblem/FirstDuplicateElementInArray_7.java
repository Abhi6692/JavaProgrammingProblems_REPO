package arraysProblem;

public class FirstDuplicateElementInArray_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 14,12, 15, 12, 13, 14};
		
		for  (int i = 0; i <a.length ; i++) {
			
			int flag = 0 ;
			for (int j = i+1 ; j<a.length; j++) {
				
				if (a[i] == a[j]) {
					
					System.out.println("The First Duplicate element of the Array is -- "+ a[i]);
					flag = flag+1;
					break;
				}
			}
			
			if (flag>0) {
				
				break;
			};
		}
		
		
		
		
	}

}
