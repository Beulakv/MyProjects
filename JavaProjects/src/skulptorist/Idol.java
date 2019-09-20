package skulptorist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Idol {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int kg,sum;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the kgs of gold ");
		kg=Integer.parseInt(br.readLine());
		sum=kg;
		while(kg>0)
		{
			kg=kg/5;
			sum=sum+kg;
		}
		
		
		System.out.println("Number of Sculptors can be made is "+sum);
	}

}
