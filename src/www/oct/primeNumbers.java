package www.oct;

public class primeNumbers {

	 static void prime(int n) {
		
		 for(int i=2;i<=n/2;i++) {
			 if(n%i==0) {
				 System.out.println(n+" is not a prime number");
				 System.exit(0);
			 }
			 
		 }
		System.out.println(n+" is a prime number");
	}
	
	public static void main(String[] args) {
	
		prime(3);

	}

}
