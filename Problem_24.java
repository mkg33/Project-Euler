import java.util.ArrayList;

public class Problem_24 {

	static String digits;
	
	static ArrayList<String> numbers = new ArrayList<String>();
	
	public static void main(String[] args){
		
	
		
		for(int i=0; i<=9; i++){
			
			for(int j=0; j<=9; j++){
				
				for(int a=0; a<=9; a++){
					
					for(int b=0; b<=9; b++){
						
						for(int c=0; c<=9; c++){
							
							for(int d=0; d<=9; d++){
								
							for(int e=0; e<=9; e++){
								
								for(int f=0; f<=9; f++){
								
									for(int g=0; g<=9; g++){
										
										for(int h=0; h<=9; h++){
							
							if(i!=j && i!=a && i!=b && i!=c && i!=d && i!=e && i!=f && i!=g && i!=h
									&& j!=a && j!=b && j!=c && j!=d && j!=e && j!=f && j!=g && j!=h
									&& a!=b && a!=c && a!=d && a!=e && a!=f && a!=g && a!=h
									&& b!= c && b!=d && b!=e && b!=f && b!=g && b!=h
									&& c!=d && c!=e && c!=f && c!=g && c!=h
									&& d!=e && d!=f && d!=g && d!=h
									&& e!=f && e!=g && e!=h
									&& f!=g && f!=h
									&& g!=h){
							
							digits = "" + i + j + a + b + c + d + e + f + g + h;
							
							if(numbers.size()<1_000_000){
							numbers.add(digits);
							
							System.out.println(digits);
							
							}
							
							}
							
						}
						
					}
					
				}
				
			}
			
		}
					
	
			
		
			}
			}
		
	}
			}
			
			
		}
		
		
	

	}
	
	
	
}

