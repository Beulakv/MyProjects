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
		System.out.println("******* Menu ******* \n 1.Booking Room \n 2.Check Room Status \n 3.Exit \n 4.View All Bookings");
	      System.out.println("Enter your choice : ");
	      //System.out.println("Menu \n 1.Book \n 2.Check status \n 3.Exit");
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      //System.out.println("Enter your choice : ");
	      menu=Integer.parseInt(br.readLine());
	      Menu mn=new Menu();
	      RoomBooking rb=new RoomBooking();
	      Main ma=new Main();
	      int room;
	      String ac;
	 	 String cot;
	 	 String cable;
	 	 String wifi;
	 	 String laundry;
	 	 int date;
	 	 
	 	 int start_date;
	 	 int end_date;
	 	 
	      String i;
	      BufferedReader book=new BufferedReader(new InputStreamReader(System.in));
	      switch(menu)
	      {
	         case 1:{
	        	 do {
	        		 
		      		 System.out.println("******** Booking ******** \n *****Please choose the services required *****");
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
		      		 System.out.println("Enter the date of booking ");
		      		 date=book.read();
		      		
		      	    
		      	     rb.setAc(ac);
		      	     rb.setCot(cot);
		      	     rb.setCable(cable);
		      	     rb.setWifi(wifi);
		      	     rb.setLaundry(laundry);
		      	     rb.setDate(date);
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
	         case 4:
	        	 System.out.println("************* View all bookings *************");	
	      	     System.out.println("Enter the start date");
	      	     start_date=book.read();
	      	     System.out.println("Enter the end date");
	      	     end_date=book.read();
	      	   end_date=book.read();
	      	     System.out.println("The bookings made from "+start_date+" to "+end_date+" are");
	      	     
	      	     //for(int i=0;i<reg)
	      	     if(start_date>=end_date)
	      	     {
	      	    	 System.out.println("Room number       Customer ID");
	      	    	 System.out.println("    "+mn.roomnum+"                    "+ma.registerID);
	      	     }
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
