import java.util.ArrayList;
import java.util.Arrays;

public class Problem_43 {
	
	static String pandigital;
	
	static char[] temp;
	
	static char[] numbers;
	
	static int two;
	
	static int three;
	
	static int five;
	
	static int seven;
	
	static int eleven;
	
	static int thirteen;
	
	static int seventeen;
	
	static long sum;
	
	
	
	public static void main(String[] args){
		
		for(long i=1_000_000_000; i<=Long.MAX_VALUE; i++){
			
			pandigital = Long.toString(i);
			
			// System.out.println(pandigital);
			
			if(pandigital.length() == 11){
				
				break;
			}
			
			temp = pandigital.toCharArray();
			
			Arrays.sort(temp);
			
		
			
			if(	
					Character.getNumericValue(temp[0]) == 0
					&& Character.getNumericValue(temp[1])==1
					&& Character.getNumericValue(temp[2])==2
					&& Character.getNumericValue(temp[3])==3
					&& Character.getNumericValue(temp[4])==4
					&& Character.getNumericValue(temp[5])==5
					&& Character.getNumericValue(temp[6])==6
					&& Character.getNumericValue(temp[7])==7
					&& Character.getNumericValue(temp[8])==8
					&& Character.getNumericValue(temp[9])==9){
				
				System.out.println(pandigital);
				
				numbers = pandigital.toCharArray();
				
				
				two = Integer.parseInt(""+numbers[1]+numbers[2]+numbers[3]);
				
				three = Integer.parseInt(""+numbers[2]+numbers[3]+numbers[4]);
				
				five = Integer.parseInt(""+numbers[3]+numbers[4]+numbers[5]);
				
				seven = Integer.parseInt(""+numbers[4]+numbers[5]+numbers[6]);
				
				eleven = Integer.parseInt(""+numbers[5]+numbers[6]+numbers[7]);
				
				thirteen = Integer.parseInt(""+numbers[6]+numbers[7]+numbers[8]);
				
				seventeen = Integer.parseInt(""+numbers[7]+numbers[8]+numbers[9]);
				
				if(two%2==0 && three%3==0 && five%5==0
						&& seven%7==0 && eleven%11 == 0
						&& thirteen%13==0 && seventeen%17==0){
				
				
					sum += Long.parseLong(pandigital);
				
				}
				
			
			}
			
			}
			
		
		System.out.println("The sum equals: " + sum);
		
	}

}
