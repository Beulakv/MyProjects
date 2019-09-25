package facefolks;

import java.util.Scanner;
public class RoomBooking {
	String ac,cot,cable,wifi,laundry;
	int date;
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}



	static int roomNumber=0;
	int[] booked=new int[25];
	static int m=0;
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	
	
	
	//Scanner sc=new Scanner(System.in);
	int total;
	void RoomBooking()
	{
	
		if(ac.equals("AC"))
	     {
			total=1000;
	     }
	     else
	     {
	    	 total=750;
	     }
	     if(cot.equals("double"))
	     {
	    	 total=total+350;
	     }
	     else
	     {
	    	 total=total+0;
	     }
	     if(cable.equals("Cable"))
	     {
	    	 total=total+50;
	     }
	     else
	     {
	    	 total=total+0;	     
	     }
	     if(wifi.equals("Wifi"))
	     {
	    	 total=total+200;
	     }
	     else
	     {
	    	 total=total+0;
	     }
	     if(laundry.equals("laundry"))
	     {
	    	 total=total+100;
	     }
	     else
	     {
	    	 total=total+0;
	     }
	     System.out.println("The total charge is "+total);
	     System.out.println("The services choosen are ");
	     System.out.println(cot+" cot"+" "+ac+" room");
	     System.out.println(cable+" connection enabled");
	     System.out.println(wifi+" enabled");
	     System.out.println(laundry+" needed");
	     //System.out.println(date+" date of booking");
	     
		//String registerID=0;
		
	}
	void viewbooking()
	{
	   
	   
	}
	
}
