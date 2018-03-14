
public class Problem_145 {
	
	static String number;

	static String number_rev;

	static int sum;

	static char[] digits;
	
	static int counter;
	
	static int found_number;
	
	static int total;
	
	static int i;
	

	public static void main(String[] args){

	for(i=1; i<=1_000_000_000; i++){

	number = Integer.toString(i);

	number_rev = new StringBuilder(number).reverse().toString();
	
	if(Character.getNumericValue(number_rev.charAt(0))!=0){

	sum = Integer.parseInt(number) + Integer.parseInt(number_rev);

	digits = Integer.toString(sum).toCharArray();
	
	//  System.out.println("number: " + number + " " +  "number_rev: " + number_rev + " " + "sum: " + sum);
	 
	 for(int j=0; j<digits.length; j++){

			if(Character.getNumericValue(digits[j])%2!=0 && Character.getNumericValue(digits[digits.length-1]) != 0){
				
				counter += 1;
				
				if(counter == digits.length){
					
					found_number = i;
					
					total += 1;
					
					 System.out.println("number: " + found_number + " sum: " + sum + " number of digits: " + digits.length + " counter: " + counter + " total: " + total);
					 
					
					break;
					
				}
				

			}
			
			
			else{
				
				counter = 0;
				
				break;
			}

	
			
	}
	

	 }
	
	
	}
	
	
	



	}
	

	

	
	

	}


	


