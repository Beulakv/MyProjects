package fibonacciseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int num,f=0;
		int a=0,b=1,c;
		System.out.println("Enter a number ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(br.readLine());
		System.out.print("The fibonacci series is "+a+" "+b);
		for(int i=0;i<=num;i++)
		{
			f=a+b;
			a=b;
			b=f;
			System.out.print(" "+f);
		}
		
	}

}
