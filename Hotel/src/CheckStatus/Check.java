package CheckStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Room.Room;

public class Check {
	
	//static int x=0;
	Room rb=new Room();
	
	public void check(int booked[]) throws NumberFormatException, IOException 
	{
		int v;
		System.out.println("Enter a room number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		v=Integer.parseInt(br.readLine());
		
		//for(int i=0;i<=rb.ind;i++)
			
		if(booked[v-1]==1)
		{
			System.out.println("Room number "+v+" is booked");
		}
		else
		{
			System.out.println("Room number "+v+" is not booked");
		}
	}

}
