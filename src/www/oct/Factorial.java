package www.oct;

public class Factorial {

	static void fact( int num) {
		int count=1;
		
		for(int i=1;i<=num;i++) {
			
			count=count*i;
			
		}
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		
		fact(5);
	}

}
