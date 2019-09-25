package ViewCustomer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Registration.Register;
import Room.Room;

public class ViewCustomer {
	
	static String id;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	Register reg=new Register();
	Room rb=new Room();
	
	public void viewcus() throws IOException
	{
		System.out.println("All Customers ");
		String names[]=new String[100];
		names[reg.registerID-1]=reg.name;
		System.out.println("Customer Id "+"Customers Name");
		for(int i=0;i<reg.index;i++)
		{
			System.out.println(Register.regid[i]+"   "+Register.customers[i]);
		}
		
		
		
	}

}
