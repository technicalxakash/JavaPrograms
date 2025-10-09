package www.oct;

public class COunt_Char_STring {

	public static void main(String[] args) {

		String name="akash123456";
		
		char[] a=name.toCharArray();
		int count=0;
		
		for(int i=0;i<=a.length-1;i++) {	
			
			if(a[i]>='0' && a[i]<='9') {
				
				 continue;
			}
			else {
				
				count=count+1;
			}
			
			
		}
		
		System.out.println(count);
	}
}