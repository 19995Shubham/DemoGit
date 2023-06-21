package collections;

public class DuplicateArray {

	public static void main(String[] args) {
		
	
	String a[] = {"java","phyton","Ruby","java","Ruby"};
	
	for(int i = 0; i<a.length;i++) {
		
		for(int j =i+1; j< a.length;j++) {
			
			if(a[i].equals(a[j])) {
				System.out.println("Duplicate is "+ a[i]);
			}
			 
		}
		 
	}
}
}