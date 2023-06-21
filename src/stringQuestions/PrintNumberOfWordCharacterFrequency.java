package stringQuestions;

public class PrintNumberOfWordCharacterFrequency {

	public static void main(String[] args) {
		
		// Learn With Krishna Sandeep
		String question  = "Learn With Krishna Sandeep";
		
		System.out.println("Character with white space " + question.length());
		int count = 0;
		
		for(int i =0; i <= question.length()-1;i++) {
		
			char readCahracter = question.charAt(i);
			if(readCahracter!=' ') {
				count++;
			}
		}
	    System.out.println("Character without the Space " +count);
	 
	    
	    String question1 = "Learn With Krishna Sandeep";
	    System.out.println(question1.length());
	    int count2 = 0;
	    for (int i = 0; i < question1.length(); i++) {
 	        char c = question1.charAt(i);
	        if (c != ' ') { // Check if the character is a space
	            count2++;
	        }
	    }

	    System.out.println("Count2: " + count2);
	    
	    
	    //Using inbuilt method isWhiteSpace
	    
	    String question3 = "Learn With Krishna Sandeep";
	    int count3 = 0;
	    
	    for(int i = 0; i< question3.length(); i++) {
	    	char c = question3.charAt(i);
	    	if(!Character.isWhitespace(c)) {
	    		count3++;
	    	}
	    	 
	    }
	    System.out.println("After removing the white space"+ count3);
	    
	    
	}
}

 


/*
 * int lengthQuestion = question.length();
 * System.out.println("total length of the String " +lengthQuestion); int count
 * = 0; for(int i=0;i<=question.length()-1;i++) { char c = question.charAt(i);
 * if(c != ' ') { count ++; //totalCharacter = count; } }
 * System.out.println(count);
 */
