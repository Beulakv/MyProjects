package bid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contract {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int bid;
		int contract[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of applications ");
		bid=Integer.parseInt(br.readLine());
		contract=new int[bid];
		System.out.println("Enter the amount(in crores) ");
		for(int i=0;i<bid;i++)
		{
			contract[i]=Integer.parseInt(br.readLine());
		}
		int max=contract[0];
		for(int i=0;i<bid;i++)
		{
			if(contract[i]>max)
			{
				max=contract[i];
			}
		}
		System.out.println("The winning bid is "+max+" crores");
	}

}
