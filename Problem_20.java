
import java.math.BigInteger;

public class Problem_20 {
	
	static BigInteger n = new BigInteger("1");
	
	static int counter = 0;
	
	public static void main(String[] args){
		
		
		for(int i=1; i<=100; i++){
			
			n = n.multiply(BigInteger.valueOf(i));
			
		}
		
		
		
		String result = n.toString();
		
		for(int j=0; j<result.length(); j++){
			
			counter += Character.getNumericValue(result.charAt(j));
			
			
		}
		
		System.out.println(result);
		System.out.println(counter);
		
	}

}
