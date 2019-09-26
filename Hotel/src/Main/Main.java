package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import AllBooking.AllBooking;
import CheckStatus.Check;

import Registration.Register;
import Room.Room;
import ViewCustomer.ViewCustomer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  String name;
	      String address;
	      String contact;
	      String email;
	      String proofType;
	      String proofId;
	      String w1 = null,r,e;
	      int choice=0,rmn=0;
	       int booked[]=new int[25];
	  	  ViewCustomer vc=new ViewCustomer();
	      Register r1=new Register();
	      Room rb=new Room();
	  	  AllBooking ab=new AllBooking();
	      
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     do
	     {
	      System.out.println("Enter your choice ");
	      System.out.println(" 1.Registration \n 2.Room Booking \n 3.Check Status \n 4.Email Updation \n 5.All Bookings \n 6.All Customers \n 7.Exit ");
	      Scanner sc=new Scanner(System.in);
	 	  choice=sc.nextInt();
	 	  switch(choice)
	 	  {
	 	    case 1:
	 	    {
	 	    	r1.reg();
	 	    	System.out.println("Do you want to continue (Y/N)");
	 	    	w1=br.readLine();
	 	    	break;
	 	    }
	 	    case 2:
	 	    {
	 	    	
	 	    	rb.roombooking();
	 	    	booked[rmn]=1;
	 	    	rmn++;
	 	    	break;
	 	    }
	 	    case 3:
	 	    {
	 	    	Check ch=new Check();
	 	    	ch.check(booked);
	 	    	break;
	 	    }
	 	    case 4:
	 	    {
	 	    	
	 	    	r1.update();
	 	    	//r1.reg_new();
	 	    	break;
	 	    }
	 	    case 5:
	 	    {
	 	    
	 	    	ab.allbook(Register.regid,Register.index,Room.roomarr);
	 	    	break;
	 	    }
	 	    case 6:
	 	    {
	 	    
	 	    	vc.viewcus();
	 	    	break;
	 	    }
	 	    case 7:
	 	    {
	 	    	System.out.println("Exit");
	        	System.exit(0);
	 	    }
	 	   /* case 8:
	 	    {
	 	    	for(int i=0;i<r1.ei;i++)
	 	    	{
	 	    		System.out.println(r1.emailaddr[i]);
	 	    	}
	 	    	break;
	 	    }*/
	 	    	
	 	  }
	     }while(w1.equalsIgnoreCase("y"));
		
	}

}
