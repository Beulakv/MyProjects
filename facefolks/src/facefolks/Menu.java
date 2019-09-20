package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	//int booked[]=new int[25] ;
	//booked=new int[25];
  // static int roomNumber=0;
   static int m=0;
	
	void menu() throws NumberFormatException, IOException
	{
		int menu;
		System.out.println("Menu \n 1.Book \n 2.Check status \n 3.Exit");
	      System.out.println("Enter your choice : ");
	      //System.out.println("Menu \n 1.Book \n 2.Check status \n 3.Exit");
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      //System.out.println("Enter your choice : ");
	      menu=Integer.parseInt(br.readLine());
	      Menu mn=new Menu();
	      RoomBooking rb=new RoomBooking();
	      int room;
	      String ac;
	 	 String cot;
	 	 String cable;
	 	 String wifi;
	 	 String laundry;
	      String i;
	      BufferedReader book=new BufferedReader(new InputStreamReader(System.in));
	      switch(menu)
	      {
	         case 1:{
	        	 do {
	        		 
		      		 System.out.println("Booking : \n Please choose the services required ");
		      		 System.out.println("Do you want AC/non-AC(AC/nAC)");
		      		 ac=book.readLine();
		      		 System.out.println("Do you want cot(single/double)");
		      		 cot=book.readLine();
		      		 System.out.println("Do you need With cable connection/without cable connection(C/nC)");
		      		 cable=book.readLine();
		      		 System.out.println("Do you need Wi-Fi or not(W/nW)");
		      		 wifi=book.readLine();
		      		 System.out.println("Do you need laundry service or not(L/nL)");
		      		  laundry = book.readLine();
		      		
		      	    
		      	     rb.setAc(ac);
		      	     rb.setCot(cot);
		      	     rb.setCable(cable);
		      	     rb.setWifi(wifi);
		      	     rb.setLaundry(laundry);
		      	     rb.RoomBooking();
		      	 System.out.println("Do you want to proceed?");
		         i=br.readLine();
	        	 }while(i.equalsIgnoreCase("n"));
	        	// booked[m]=++roomNumber;
	        	 //m++;
	        	 
	        	 System.out.println("Thank you for booking . Your room number is "+ mn.room());
	        	
	        	 mn.menu();
	        	 break;
	      }
	         case 2:
	         {
	        	// Menu mn=new Menu();
	        	 System.out.println("Enter room number ");
	     		//int i1;
	     		room=Integer.parseInt(br.readLine());
	     		
	    			if(booked[room]==1)
	    			{
	    				System.out.println("Room number "+room+" is booked.");
	    			}
	    			else
	    			{
	    				System.out.println("Room number "+room+" is not booked.");
	    			}
	    		//}
	    			mn.menu();
	        	 break;
	         }
	         case 3:
	        	 System.out.println("Exit");
	        	 System.exit(0);
	        	 
	        	 break;
	         default :
	        	 break;
	      }
	    	  
	      
		
	}
	
	static int roomnum=0;
	static int booked[]=new int[25];
int room() {
	roomnum++;
	booked[roomnum]=1;
	
	return roomnum;
}
	private void RoomBooking() {
		// TODO Auto-generated method stub
		
	}
	
}
