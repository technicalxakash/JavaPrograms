package www.oct;

public class CountNoDigit {

	
	static void countt(int num) {
		int i=0;
		int count=0;
		while(i<num) {
			
			num=num/10;
			count=count+1;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
    
		countt(1234567);
		
	}

}
