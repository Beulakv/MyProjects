package puzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Puzzle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int num,sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		num=Integer.parseInt(br.readLine());
		System.out.print("The divisors of the number are ");
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.print(" "+i);
				sum=sum+i;
			}
		}
		System.out.println("\nThe sum of the divisors are "+sum);
		if(sum==num)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
		
	}

}
