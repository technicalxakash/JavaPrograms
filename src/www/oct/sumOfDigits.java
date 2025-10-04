package www.oct;

public class sumOfDigits {

	public static void main(String[] args) {
		
		int num=1234;
		int digi=0;
		int lastdigi=0;		
		int count=0;
		
		
while(num>0) {
	digi=num%10;
	
	lastdigi=lastdigi+digi;

	num=num/10;	
		
}	
System.out.println(lastdigi);
	}
	

}
