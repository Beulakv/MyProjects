package jumbled;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jumbled {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int num,fact=1;
		System.out.println("Enter the number of alphabets in your name ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The number of combination is "+fact);
	}

}
