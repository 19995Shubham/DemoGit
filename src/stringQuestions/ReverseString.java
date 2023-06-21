package stringQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
	
	String str = "Reverse String";
	
	//Using concatenation method
	
	String rev = "";
   
	
	/*
	 * for(int i =0; i<= str.length()-1;i++) {
	 * 
	 * rev = str.charAt(i)+ rev; } System.out.println(rev + "main");
	 */
	
	
	String output = "";
	for(int j =str.length()-1; j >= 0;j--) {
		
	output = output+str.charAt(j);
	}
	System.out.println(output);
	
	
	String output2 = "";
	for(int i = 0; i<=str.length()-1;i++) {
	
		output2 = str.charAt(i)+output2;
	}
	
	
}
	
	 
}