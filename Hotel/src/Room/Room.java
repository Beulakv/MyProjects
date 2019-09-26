package Room;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Room {
	
	String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	public static int datearr[]=new int[25];
	public static int roomarr[]=new int[25];
	public static int ind=0;
	int book;
	 
	 public static int q=0;
	 public static int roomnum=0;
	// public static int booked[]=new int[25];
	//public static int[] datearr;
	 
	 String i,s,d,e,f;
	 int total=0;
	 
	 public void roombooking() throws IOException
	 {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 do
		 {
		
			 System.out.println("******** Booking ******** \n *****Please choose the services required *****");
      		 System.out.println("Do you want AC/non-AC(Y/N)");
      		 ac=br.readLine();
      		 System.out.println("Do you want cot(S/D)");
      		 cot=br.readLine();
      		 System.out.println("Do you need With cable connection/without cable connection(Y/N)");
      		 cable=br.readLine();
      		 System.out.println("Do you need Wi-Fi or not(Y/N)");
      		 wifi=br.readLine();
      		 System.out.println("Do you need laundry service or not(Y/N)");
      		 laundry = br.readLine();
      		 System.out.println("Enter the date of booking (DD/MM/YY)");
      		 book=Integer.parseInt(br.readLine());
      		 
      		datearr[q]=book;
      		 ++q;
      		 if(ac.equalsIgnoreCase("Y"))
      			 total=total+1000;
      		 else
      			 total=total+750;
      		 if(cot.equalsIgnoreCase("S"))
      			 total=total+350;
      		 else
      			 total=total+0;
      		 if(wifi.equalsIgnoreCase("Y"))
      			 total=total+200;
      		 else
      			 total=total+0;
      		 if(laundry.equalsIgnoreCase("Y"))
      			 total=total+100;
      		 else
      			 total=total+0;
      		 
      		 System.out.println("Total Price "+total);
      		 System.out.println("Enable Services ");
      		 if(ac.equalsIgnoreCase("Y"))
      			 System.out.println("Single coat ac room");
      		 else
      			 System.out.println("Non ac room");
      		 if(cot.equalsIgnoreCase("S"))
      			 System.out.println("Single cot enable");
      		 else
      			 System.out.println("Double cot enable");
      		 if(cable.equalsIgnoreCase("Y"))
      			 System.out.println("Cable enabled");
      		 else
      			 System.out.println("Cable not enabled");
      		 if(wifi.equalsIgnoreCase("Y"))
      			 System.out.println("WiFi enabled");
      		 else
      			 System.out.println("WiFi not enabled");
      		 if(laundry.equalsIgnoreCase("Y"))
      			 System.out.println("Laundry available");
      		 else
      			 System.out.println("Laundry not available");
      		 System.out.println("Do you proceed (Y/N)");
      		 i=br.readLine();
			 
		 }while(i.equalsIgnoreCase("N"));
		 
		 int r=roomnum;
		 roomarr[ind]=++roomnum;
		 ind++;
		 
		 System.out.println("Thank you for booking......Your room number is "+ roomnum);
		// booked[rmn]=1;
		// rmn++;
	 }

}
