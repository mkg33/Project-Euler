
public class Problem_6 {
	
	static int squared;
	static int squared_sum;
	
	public static void main(String[] args){
		
		int[] numbers = new int[101];
		int[] squared_num = new int[101];
		
		for(int i=1; i<=100; i++){
			numbers[i]=i;
			squared_num[i] = i*i;
			
			squared_sum += numbers[i];
			squared += squared_num[i];
		}
			
		
		System.out.println(squared);
		System.out.println(squared_sum);
		
		squared_sum = squared_sum * squared_sum;
		
		System.out.println(squared_sum);
		
		int difference = squared_sum - squared;
		
		System.out.println(difference);
	
	}

}
