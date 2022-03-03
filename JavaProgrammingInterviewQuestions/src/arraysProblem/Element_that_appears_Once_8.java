package arraysProblem;

import java.util.HashMap;
import java.util.Map.Entry;

public class Element_that_appears_Once_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,1,1, 2,2,3,4,5,6,7,8,1};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<a.length;i++) {
			
			if(!map.containsKey(a[i])) {
				
				map.put(a[i], 1);
			}
			else {
				map.put(a[i], map.get(a[i])+1);
			}
		}
		
		
		System.out.println(map);
		
		for (Entry<Integer, Integer> e : map.entrySet()) {
			
			if(e.getValue()==1) {
				
				System.out.println("Unique Elements is/are --- " + e.getKey());
			}
			
			
		}
		
	}

}
