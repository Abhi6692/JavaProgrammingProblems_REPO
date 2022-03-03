package arraysProblem;

import java.util.ArrayList;

public class PrintOddEvenSumCount_9 {

	public static void main(String[] args) {
		
	
		int [] a = {1,2,3};

		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		for (int i =0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				evenList.add(a[i]);
				
			}
			else 
			{
				oddList.add(a[i]);
			}
		}
		
		System.out.println("The size of Even List is : " +evenList.size() );
		System.out.println("The size of Odd List is : " +oddList.size());
		
		
		int evnListSum = 0;
		int oddListSum  = 0;
		
		
		for (int i = 0 ; i<evenList.size(); i++) {
			evnListSum = evnListSum + evenList.get(i);
			
		}
		
		for (int i = 0 ; i<oddList.size(); i++) {
			oddListSum = oddListSum + oddList.get(i);
			
		}
		
		System.out.println("The Even list sum is : " +evnListSum );
		System.out.println("The Odd list sum is : " +oddListSum );

	}

}
