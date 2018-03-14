import java.util.Arrays;
import java.math.BigInteger;

public class Problem_104 {
	
	static BigInteger previous = new BigInteger("1");
	
    static BigInteger next_previous = BigInteger.ZERO;
	
	static String number;
	
	static char[] digits_first;
	
	static char[] digits_last;

	static int counter = 1;
	
	public static void main(String[] args){
		
		System.out.println(previous);
		
		for(BigInteger i = BigInteger.valueOf(1); counter <= Integer.MAX_VALUE; i.add(BigInteger.ONE)){
			
			i = previous.add(next_previous);
			
			next_previous = previous;
			
			previous = i;
			
			counter += 1;
			
		//	System.out.println("counter " + counter + " " + i);
			
			number = i.toString();
			
			if(number.length()>=18){
			
			digits_first = number.substring(0,9).toCharArray();
			
			digits_last = number.substring(number.length()-9, number.length()).toCharArray();
			
			Arrays.sort(digits_first);
			
			Arrays.sort(digits_last);
			
			
			if(Character.getNumericValue(digits_first[0]) == 1 && Character.getNumericValue(digits_first[1]) == 2 && Character.getNumericValue(digits_first[2]) == 3 && Character.getNumericValue(digits_first[3]) == 4 && 
					Character.getNumericValue(digits_first[4]) == 5 && Character.getNumericValue(digits_first[5]) == 6 && Character.getNumericValue(digits_first[6]) == 7 && 
					Character.getNumericValue(digits_first[7]) == 8
					&& Character.getNumericValue(digits_first[8]) == 9
					&& Character.getNumericValue(digits_last[0]) == 1 && Character.getNumericValue(digits_last[1]) == 2 && Character.getNumericValue(digits_last[2]) == 3 && Character.getNumericValue(digits_last[3]) == 4 && 
					Character.getNumericValue(digits_last[4]) == 5 && Character.getNumericValue(digits_last[5]) == 6 && Character.getNumericValue(digits_last[6]) == 7 && 
					Character.getNumericValue(digits_last[7]) == 8
					&& Character.getNumericValue(digits_last[8]) == 9){
				
				System.out.println("found the number: " + i);
				
				System.out.println("at index: " + counter);
				
				break;
				
			}
			
			}
			
		}
		
		
	}
	
}
