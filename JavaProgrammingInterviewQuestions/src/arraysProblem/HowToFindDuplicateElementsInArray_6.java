package arraysProblem;

public class HowToFindDuplicateElementsInArray_6 {

	public static void main(String[] args) {



		String  progLanguage[] = {"java", "python" , "ruby" , "J", "python", "ruby", "abhishek", "rony"};

		//Brute Force Method
		int arrSize = progLanguage.length;


		for(int i = 0 ; i<arrSize; i++) {

			for(int j=i+1 ; j<arrSize ; j++) {


				if(progLanguage[i]==progLanguage[j]) {



					System.out.println(progLanguage[i]);
                    break;


				}




			}


			//System.out.println("*****************************");
		}

	}}

