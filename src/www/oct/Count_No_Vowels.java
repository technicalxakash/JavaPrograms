package www.oct;

public class Count_No_Vowels {

	public static void main(String[] args) {
		
		
		String str="aeiouqwrtyai";
		
		char[] a=str.toCharArray();
		int count =0;
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
