package www.oct;

public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber=0;
		int secondNuber=1;
		int nextnum;
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(firstNumber);
			
			nextnum=firstNumber+secondNuber;
			firstNumber=secondNuber;
			secondNuber=nextnum;
		}
	}

}
