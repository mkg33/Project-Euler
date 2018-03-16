import java.util.*;

public class Problem_23 {
	
	static ArrayList<Long> numbers = new ArrayList<Long>();
	
	static ArrayList<Long> allSums = new ArrayList<Long>();
	
	static ArrayList<Long> found = new ArrayList<Long>();
	
	static long sum;
	
	static long all;
	
	static long total;
	
	public static void main(String[] args){
		
		for(long i=1; i<28123; i++){
			
			
			for(long j=1; j<i; j++){
				
				if(i%j==0){
					
					sum += j;
					
				}
			
				
			}
			
			if(sum>i){
				
			//	System.out.println("found the number: " + i + " and the sum: " + sum);
				
				numbers.add(i);
				
				sum = 0;
				
			}
			
			else{
				
				sum = 0;
				
			}
			
			
			
		}
		
		
		for(int a=0; a<numbers.size(); a++){
			
			for(int b=0; b<numbers.size(); b++){
				
					
					all = numbers.get(a) + numbers.get(b);
					
			
					if(all>=28123){
						
						all = 0;
						
						break;
						
					}
					
					if(!allSums.contains(all)){
						
				//		System.out.println(numbers.get(a) + " + " + numbers.get(b) + " = " + all);
					
					allSums.add(all);
					
				//	System.out.println(all);
					
					all = 0;
					
					}
					
					
					else{
						
						all = 0;
						
					}
				}
				
			}
			
		
		
		
		for(long j=1; j<28123; j++){
			
		for(int a=0; a<allSums.size(); a++){
			
			if(!allSums.contains(j) && !found.contains(j)){
				
				found.add(j);
				
				total += j;
				
				System.out.println("Found this number: " + j);
			}
			
		}
	}
		
	System.out.println("The sum is: " + total);
		


	}
	
}
