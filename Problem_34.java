
import java.math.*;


public class Problem_34 {
	
	static String digits;
	
	static int fact = 1;
	
	static int counter = 0;
	
	static int result = 0;
	
	static int i;
	
	public static void main(String[] args){
		
		for(i=3; i<=50000; i++){
			
			digits = Integer.toString(i);

			for(int j=0; j<digits.length(); j++){
				
				for(int a=1; a<=Character.getNumericValue(digits.charAt(j)); a++){
				
					
					fact = fact * a;
					
					
					if(fact==0){
						
						fact = 1;
						
					}
					
			}
			
				counter += fact;
				fact = 1;
			
				
				
			}
			
			
			
			
		
			
			
			
			
			
			if(counter==Integer.parseInt(digits)){
				result += counter;
			}
			
			
			counter = 0;
			
			
			
			
		}
	
		
		
		System.out.println(result);
	
		
	}
	

}
