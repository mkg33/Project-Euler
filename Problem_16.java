import java.math.BigInteger;


public class Problem_16 {
	
	static BigInteger b2= new BigInteger("2");
	
	static BigInteger result = b2.pow(1000);
	
	public static void main(String[] args){
		
		String[] digits = result.toString().split("(?!^)");
				
		int sum = 0;
		
		for(int i=0; i<digits.length; i++){
			
			sum += Integer.parseInt(digits[i]);
			
		 
		}
		
		System.out.print(sum);
		
	}

}
