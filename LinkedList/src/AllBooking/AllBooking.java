package AllBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Registration.Register;
import Room.Room;

public class AllBooking {
	
	static Register reg=new Register();
	static Room br=new Room();
	
	public void allbook(int rearr[],int index, int roomarr[]) throws NumberFormatException, IOException
	{
		int start_date,end_date;
		System.out.println("Enter the start date");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		start_date=Integer.parseInt(br.readLine());
		System.out.println("Enter the end date");
		end_date=Integer.parseInt(br.readLine());
		System.out.println("The bookings made from "+start_date+" to "+end_date+" are");
		
		//System.out.println(rearr[0]);
		
		System.out.println("Customer ID  "+"     Room No.");
		for(int i=0;i<index;i++)
		{
			//System.out.println(roomarr[i]);
			if(Room.datearr[i] >= start_date && Room.datearr[i]<=end_date)
			{
				System.out.println("  "+rearr[i]+"                 "+roomarr[i]);
			}
			else
			{
				System.out.println("      No Booking");
			}
		}
	}
	

}
