package stringQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		//using the algorithm
		System.out.println("this is before reverse"+num);
		/*int rev =0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}*/
		
		//using stringbuffer
		
		/*
		 * StringBuffer rev; StringBuffer sb = new StringBuffer(String.valueOf(num));
		 * rev = sb.reverse();
		 */
		
		//String builder
		
		/*
		 * StringBuilder sbl = new StringBuilder(); sbl.append(num); StringBuilder rev
		 * =sbl.reverse();
		 * 
		 * System.out.println("Reversed number is "+rev);
		 */
		
	}
}
