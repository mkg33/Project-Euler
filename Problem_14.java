
public class Problem_14 {
	
	static long n;
	
	static int counter = 0;
	
	static int longest = 0;
	
	static int number = 0;
	
	public static void main(String[] args){
		
		for(int i=1; i<=1000000; i++){
			
			n = i;
			
			while(n!=1){
				
				if(n%2==0){
					
					n = n/2;
					
				}
				
				else{
					
					n = 3*n +1;

					
				}
				
			
			counter += 1;
			
	
			
			}
			
	if(longest < counter){
				
				longest = counter;
				
				number = i;
				
				}
		
			counter = 0;
		}
		
		
		System.out.println(longest);
		System.out.println(number);
		
	}
	

}
