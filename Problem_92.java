import java.lang.Math;

public class Problem_92 {
	
	static char[] digits;
	
	static long sum;
	
	static int counter_1;
	
	static int counter_89;
	
	static long number;
	
	static long total;
	
	public static void main(String[] args){
		
		for(long i=1; i<Long.MAX_VALUE; i++){
		
			number = i;
			
			if(number==10_000_000){
				break;
				
			}
			
			System.out.println("start: " + number);
			
			while(counter_89!=2){
			
			digits = Long.toString(number).toCharArray();
			
		//	 System.out.println("length: " + digits.length);
			
			
			for(int a=0; a<digits.length; a++){
				
				sum += (int) Math.pow(Character.getNumericValue(digits[a]), 2);
				
				// System.out.println("digit: " + digits[a] + " squared: " + (int) Math.pow(Character.getNumericValue(digits[a]), 2));
				
			//	 System.out.println("Inter sum: " + sum);
				
			}
			
			if(number == 1){
				
				counter_1 += 1;
				
			}
				
			if(counter_1 == 2){
					
					counter_1 = 0;
					
					// System.out.println("ending because one");
					
					sum = 0;
					
					break;
			}
				
			
			
			if(number == 89){
				
			
				
				counter_89 += 1;
				
			}
				
				
				
				if(counter_89 == 2){
					
					counter_89 = 0;
					
					total+= 1;
					
				//	 System.out.println("ending " + total);
					 
					 sum = 0;
					
					
					
					break;
					
				}
				
			
				number = sum;
				
			//	 System.out.println("final sum: " + sum);
				
				sum = 0;
			
			
			
				
			}
			
		
			
			
			}
		
		System.out.println("There are " + total + " starting numbers below ten million that arrive at 89.");
			
		}
		
	}


