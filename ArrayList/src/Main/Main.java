package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import AllBooking.AllBooking;
import CheckStatus.Check;
import Registration.Register;
import Room.Room;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
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
	  	 // ViewCustomer vc=new ViewCustomer();
	      Register r1=new Register();
	      Room rb=new Room();
	  	  AllBooking ab=new AllBooking();
	  	Check ch=new Check();
	      
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
	 	    	 System.out.println("*********** Registration ***********");
	 		      System.out.println("Enter your name : ");
	 		      name=br.readLine();
	 		     System.out.println("Enter your address : ");
	 		      address=br.readLine();
	 		      System.out.println("Enter your contact : ");
	 		      contact=br.readLine();
	 		      System.out.println("Enter your email : ");
	 		      email=br.readLine();
	 		     System.out.println("Enter your prooftype : ");
	 		      proofType=br.readLine();
	 		      System.out.println("Enter your proofid : ");
	 		      proofId=br.readLine();
	 		      
	 		      r1.reg(name, address, contact, email, proofType, proofId);
	 		      
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
	 	    
	 	    	r1.viewcustomer();
	 	    	break;
	 	    }
	 	    case 7:
	 	    {
	 	    	System.out.println("Exit");
	        	System.exit(0);
	 	    }
	 	    case 8:
	 	    {
	 	    	r1.emaildisplay();
	 	    }
	 	    	
	 	  }
	     }while(w1.equalsIgnoreCase("y"));
		
	}

}