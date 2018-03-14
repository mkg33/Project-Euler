import java.lang.Math;

import java.util.ArrayList;

public class Problem_125 {

	static String number;
	
	static String number_rev;
	
	static int consecutive;
	
	static int counter;
	
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void main(String[] args){
		
		for(int i=1; i<1000; i++){
			
			number = Integer.toString(i);
			
			number_rev = new StringBuilder(number).reverse().toString();
			
			if(number.equals(number_rev)){
				
				numbers.add(Integer.parseInt(number));
				
			}
			
		}
			
			for(int j=2; j<14; j++){
				
				consecutive += Math.pow(j, 2);
				
				counter += 1;
				
				for(int a=0; a<numbers.size(); a++){
					
					if(consecutive == (int) numbers.get(a) && counter>=2){
						
						System.out.println(numbers.get(a));
						
						break;
						
					}
				
				
					
				}
				
			
				
			}
			
			
		}
		
	}
	

