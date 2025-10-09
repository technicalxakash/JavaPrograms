package www.oct;

public class NumbersOFPrime {

	static void prime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				return;
			}
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {


for(int i=2;i<=20;i++) {
			
	prime(i);
			
		}
		

	}

}




//Keyword	      	Effect
//return	        Exits the method completely (used here correctly)
//continue			Skips to the next iteration of the loop (wrong here)
//break				Exits only the loop, not the method (also possible alternative here)