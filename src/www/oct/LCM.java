package www.oct;

public class LCM {

	public static void main(String[] args) {
		
		int a=36;
		int b=24;
		int min=0;
		
	if(a<b) {
		min=a;
	}
	else {
		min=b;
	}

	for(int i=1;i<=a*b;i++) {
		
		if(i%a==0 && i%b==0) {
			System.out.println("LCM is of "+a+" and "+b+" is "+i);
			break;
		}
	}
	
	}

}
