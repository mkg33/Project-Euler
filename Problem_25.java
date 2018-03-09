import java.math.BigInteger;


public class Problem_25 {
	
	static BigInteger previous = new BigInteger("1");
	
	static BigInteger next_previous = new BigInteger("1");
	
	static BigInteger next = BigInteger.ZERO;
	
	static int counter = 2;
	
	public static void main(String[] args){
	
		
		while(next.toString().length()<=999){
			
			next = next_previous.add(previous);
			
			next_previous = previous;
			
			previous = next;
			
			counter += 1;
			
		}
		
		System.out.println(counter);
		
		System.out.println(next);
		
		
	}

}
