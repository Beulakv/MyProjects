package ncr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NcrFactor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		long num,num1,fact=1,fac=1,fnr=1;
		long i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n ");
		num=Long.parseLong(br.readLine());
		System.out.println("Enter the value of r ");
		num1=Long.parseLong(br.readLine());
		for( i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		for( i=1;i<=num1;i++)
		{
			fac=fac*i;
		}
		long nr=num-num1;
		for(i=1;i<=nr;i++)
		{
			fnr=fnr*i;
		}
		long factor=fac*fnr;
		long factorial=fact/factor;
		System.out.println("The NCR factor for given values is "+factorial);
	}

}
