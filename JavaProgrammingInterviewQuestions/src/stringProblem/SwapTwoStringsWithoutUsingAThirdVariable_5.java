package stringProblem;

public class SwapTwoStringsWithoutUsingAThirdVariable_5 {
	public static void main(String[] args) {

		String a = "Abhishek";
		String b = "Sarkar";

		
	 // 1) Concat a and b
		
		a = a + b; // a= AbhishekSarkar
		
		b = a.substring(0, 8); // End index is exclusive, so end Index + 1 
		 
		// Can be made Dynamic instead of hardcode // refer  to the video 
		
		a = a.substring(8, 14);
		
		System.out.println(a);
		System.out.println(b);
		

	}
}
