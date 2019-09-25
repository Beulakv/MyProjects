package CheckStatus;

import java.util.Scanner;

import Room.Room;

public class Check {
	
	static int x=0;
	Room rb=new Room();
	
	public void check()
	{
		int v=0;
		System.out.println("Enter a room number");
		Scanner sc=new Scanner(System.in);
		v=sc.nextInt();
		
		if(rb.booked[v]==1)
		{
			System.out.println("Room number "+v+" is booked");
		}
		else
		{
			System.out.println("Room number "+v+" is not booked");
		}
	}

}
