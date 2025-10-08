package www.oct;

public class Palindomee {

	
	public static void main(String[] args) {
		
	String name="racecar";
	
	char[] a=name.toCharArray();
	
	String rev="";
	
	for(int i=a.length-1;i>=0;i--) {
		
		rev=rev+a[i];
		
	}
	
	if(name.equals(rev)) {
		
		System.out.println(name+" is a plaindrome");
	}
	
	else {
		System.out.println(name+" is not a plaindrome");
		
	}
		
	}

}
