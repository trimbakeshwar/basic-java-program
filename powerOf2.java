package bridgelabz;

import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();

		System.out.println("enter power");
		int pow = sc.nextInt();
		power(num,pow);
		
	}
	public static void power(int num,int pow)
	{ long val=1;
		for(int i=1;i<=pow;i++)
		{
			 val=val*num;
			System.out.println(val+"i="+i);
			 if(i>=31)
			 {
				 System.out.println("overeflow");
				 break;
				 
			 }
		}
		
	}

}
