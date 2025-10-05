package www.oct;

public class trailingZeroInFact {

	public static void main(String[] args) {
		
		int num=6;
int count=1;
		
		for(int i=1;i<=num;i++) {
			
			count=count*i;
			
		}
		System.out.println(count);
	
		int numm=0;
		
		while(count%10==0) {
			
			numm++;
			
			count = count / 10; 
		}
	
		System.out.println("Number of trailing zeros = " + numm);
	
	}
	

	}


