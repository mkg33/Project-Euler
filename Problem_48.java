import java.math.BigInteger;


public class Problem_48 {
	
	static BigInteger counter = new BigInteger ("0");
	
	static BigInteger number = new BigInteger ("1");
	
	static String counter_text;
	
	public static void main(String[] args){
		
		for(int i=1; i<=1000; i++) {
			
			number = BigInteger.valueOf(i).pow(i);
			
			counter = counter.add(number);
			
		}
		
		counter_text = counter.toString();
		
		System.out.println(counter_text.substring(counter_text.length()-10, counter_text.length()));
	}

}
