package Programs;

import java.util.Scanner;

public class MissingnoArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n=");

		int n=sc.nextInt();
		
		System.out.println("enter n-1 numbers to find missing no");

		int num[]= new int[n];
	
		for(int i=0;i<=n-2;i++)
		{
			num[i]	= sc.nextInt();
			}
		int sum=n*(n+1)/2;//actual sum of n nos
		int newsum=0;
		for(int j=0;j<=n-2;j++)
		{
			newsum=newsum+num[j];//sum of nos with n-1 numbers
		}
		int missno=sum-newsum;
		System.out.println("missing number="+missno);
	
	}
}

	
