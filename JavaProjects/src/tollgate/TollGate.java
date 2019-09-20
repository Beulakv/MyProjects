package tollgate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TollGate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int veh,heavy=0,light=0;
		int vehicle[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vehicles");
		veh=Integer.parseInt(br.readLine());
		vehicle=new int[veh];
		System.out.println("Enter the fare collected for each vehicles ");
		for(int i=0;i<veh;i++)
		{
			vehicle[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<veh;i++)
		{
			if(vehicle[i]>50)
			{
				heavy++;
			}
			if(vehicle[i]>0 && vehicle[i]<50)
			{
				light++;
			}
		}
		System.out.println("Number of heavy vehicles "+heavy+" and the number of light weight vehicles is "+light);
	}

}
