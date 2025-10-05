package www.oct;

public class LCM {

	public static void main(String[] args) {
		
		int a=36;
		int b=24;
		
		int res=Math.min(a, b);
		
		for(int i=res;i<=a*b;i++) {
			
			if(i%a==0 && i%b==0) {
				
				System.out.println("LCM is of "+a+" and "+b+" is "+i);
				break;
			}
		}

	}

}
