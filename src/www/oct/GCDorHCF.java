package www.oct;

import java.util.Scanner;

public class GCDorHCF {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a : ");	
int a= sc.nextInt();
System.out.println("enter b : ");
int b=sc.nextInt();

int min=0;
if(a<b) {
	min=b;
}
else {
	min=a;
}
		
	
		for(int i=min;i>=1;i--) {
			
			if(a%i==0 && b%i==0 ) {
				
				System.out.println("the hcf is "+i);
				break;
			}
		}

	}

}
