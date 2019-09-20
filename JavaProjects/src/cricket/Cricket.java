package cricket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cricket {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int bowlers,i,j,count=0;
		double over;
		System.out.println("Enter the number of bowlers");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		bowlers=Integer.parseInt(br.readLine());
		double runs[],bowler[],sum=0,eco[];
		runs=new double[bowlers];
		bowler=new double[bowlers];
		eco=new double[bowlers];
		System.out.println("Enter the runs conceded by the bowlers ");
		for(i=0;i<bowlers;i++)
		{
			runs[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the number of balls for each bowler");
		for(j=0;j<bowlers;j++)
		{
			bowler[j]=Integer.parseInt(br.readLine());
		}
		System.out.println("Economy of the bowlers is ");
		for(j=0;j<bowlers;j++)
		{
			over=bowler[j]/6.0;
			double e=runs[j]/over;
			eco[j]=e;
			System.out.println(e);
			sum=sum+e;
		}
		double avg=sum/bowlers;
		System.out.println("The overall economy of the team is "+avg);
		for(j=0;j<bowlers;j++)
		{
			if(eco[j] < avg)
			{
				count++;
			}
		}
		
		System.out.println("The number of bowlers eligible are "+count);
	}

}

