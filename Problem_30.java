import java.lang.Math;


public class Problem_30 {
	
	static char[] digits;
	
	static int sum = 0;
	
	static int counter = 0;
	
	static int total = 0;
	
	static int end = 0; // I'm making an unqualified assumption here based on computation time (i.e., I'm assuming that there are only six such numbers).
	
	public static void main(String[] args){
		
		for(int i=2; i<Integer.MAX_VALUE; i++){
			
			digits = Integer.toString(i).toCharArray();
			
			
			for(int j=0; j<digits.length; j++){
				
				sum = (int) Math.pow(Character.getNumericValue(digits[j]), 5);

				counter += sum;
				
			}
			
				
				if(counter == i){
					
					System.out.println(i);
					
					total += i;
					
					end += 1;
					
					if(end == 6){
					
						break;
						
					}
				
					
				}
				
				counter = 0;
				
				sum = 0;
				
			}
		
		System.out.println("sum of those numbers is " + total);
		
		}
		
		
	}


