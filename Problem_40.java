/* It's a very inefficient solution. */


public class Problem_40 {
	
	static String fraction = "1";
	
	static int total;
	
	static int counter = 0;
	
	public static void main(String[] args){
		
		for(long i=2; i<=1000000; i++){
			
			fraction = fraction + Long.toString(i);
			
			counter += 1;
			
			System.out.println(counter);
			
			
		}
		
		total = Character.getNumericValue(fraction.charAt(0)) * Character.getNumericValue(fraction.charAt(9)) * Character.getNumericValue(fraction.charAt(99)) * 
				Character.getNumericValue(fraction.charAt(999)) * Character.getNumericValue(fraction.charAt(9999)) * Character.getNumericValue(fraction.charAt(99999)) * 
				Character.getNumericValue(fraction.charAt(999999)); 
		
		System.out.println(total);
		
	}
	

}
