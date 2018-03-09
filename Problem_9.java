
import java.lang.Math;

public class Problem_9 {
	
	
	public static void main(String[] args){
		
		for(int i=0; i<1000; i++){
			
			for(int j=0; j<1000; j++){
				
				for(int a=0; a<1000; a++){
					
					if(Math.pow(i,2)+Math.pow(j, 2)==Math.pow(a, 2) && i+j+a==1000 && i<j && j<a){
						
						System.out.println(i*j*a);
						
					}
					
				}
				
			}
			
		}
		
	}

}
