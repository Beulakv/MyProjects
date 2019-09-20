package addfactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int num,sum=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.println("Enter a number ");
			num=Integer.parseInt(br.readLine());
			for(int i=0;i<=num;i++)
			{
				sum=sum+i;
			}
			
		}while(num<0);
		System.out.println("The sum is "+sum);
	}

}
