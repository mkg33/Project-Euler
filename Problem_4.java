import java.util.ArrayList;
import java.util.Collections;

public class Problem_4 {
	
		
	
	static boolean isPalindrome(String s){
		
		int n= s.length();
		
		for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void main(String[] args){
		
		
		for(int i=100; i<=999; i++){
			
			for(int j=999; j>=100; j--){
				
				
				
				String palindrome = Integer.toString(j*i);
				
				if(isPalindrome(palindrome)){
					
					numbers.add(Integer.parseInt(palindrome));
				}
			
				
				
				}
		
			
		}
		
		int result = Collections.max(numbers);
		
		System.out.println(result);
		
	}
				
			}
		
			
		
		
		
		
	
		
	


