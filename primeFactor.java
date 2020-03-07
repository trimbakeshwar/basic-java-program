package basic;

import java.util.Scanner;

public class primeFactor {
	public static int prime_or_not(int n)
	{
		int flag=1;
				for(int i=2;i<n/2;i++)
				{
					if(n%i==0)
					{
						flag=0;
					}
					return flag;
				}
				return flag;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=3;i<n;i++)
		{
		if(prime_or_not(i)==1)
		{
			if(prime_or_not(n-i)==1)
			{  
				System.out.println(n-i+"*"+i);
			}
		}
		}
		
		
	}

}
