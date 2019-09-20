package championship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Championship {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int player,min,pos=0;
		System.out.println("Enter the number of players ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		player=Integer.parseInt(br.readLine());
		int fouls[];
		fouls=new int[player];
		
		System.out.println("Enter the number of fouls made by each player ");
		for(int i=0;i<player;i++)
		{
			fouls[i]=Integer.parseInt(br.readLine());
		}
		min=fouls[0];
		for(int i=0;i<player;i++)
		{
			if(fouls[i]<min)
			{
				min=fouls[i];
				
			}
		}
		for(int i=0;i<player;i++)
		{
			if(fouls[i] == min)
			{
				pos=i+1;
				break;
				
			}
		}
		System.out.println("The eligible player is player no: "+pos+"("+min+" fouls)");
	}

}
