import java.util.Arrays;


public class Problem_52 {
	
	static char[] digits;
	
	static char[] digits_2;
	
	static char[] digits_3;
	
	static char[] digits_4;
	
	static char[] digits_5;
	
	static char[] digits_6;
	
	static String number;
	
	static String number_2;
	
	static String number_3;
	
	static String number_4;
	
	static String number_5;
	
	static String number_6;

	
	public static void main(String[] args){
		
		for(long i=1; i<Integer.MAX_VALUE; i++){
			
			number = Long.toString(i);
			
			number_2 = Long.toString(i*2);
			
			number_3 = Long.toString(i*3);
			
			number_4 = Long.toString(i*4);
			
			number_5 = Long.toString(i*5);
			
			number_6 = Long.toString(i*6);
			
			digits = number.toCharArray();
			
			Arrays.sort(digits);
			
			digits_2 = number_2.toCharArray();
			
			Arrays.sort(digits_2);
			
			digits_3 = number_3.toCharArray();
			
			Arrays.sort(digits_3);
			
			digits_4 = number_4.toCharArray();
			
			Arrays.sort(digits_4);
			
			digits_5 = number_5.toCharArray();
			
			Arrays.sort(digits_5);
			
			digits_6 = number_6.toCharArray();
			
			Arrays.sort(digits_6);
			
			
			if(Arrays.equals(digits, digits_2) && Arrays.equals(digits, digits_3) && Arrays.equals(digits, digits_4) &&
					Arrays.equals(digits, digits_5) && Arrays.equals(digits, digits_6)){
				
				System.out.println(i);
				break;
				
			}
			
			else{
				
				digits = null;
				
				digits_2 = null;
				
			}
			
			
			
			
			
		}
		
	}

}
