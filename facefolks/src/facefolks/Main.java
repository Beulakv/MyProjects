package facefolks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

   
	 static int registerID=0;
	 static int roomNumber=0;
	// int room[]=new int[25];
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String name;
      String address;
      String contact;
      String email;
      String proofType;
      String proofId;
      String i,r,e;
     
      String[] customers=new String[25];
      int pos=0;
 	 
 	String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	 int date;
	 
	 Customer cus=new Customer();
	 RoomBooking rb=new RoomBooking();
	 
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      do
      {
    	  
      System.out.println("*********** Registration ***********");
      System.out.println("Enter your name : ");
      name=br.readLine();
      customers[pos]=name;
      pos++;
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
      
      
      cus.setName(name);
      cus.setAddress(address);
      cus.setContact(contact);
      cus.setEmail(email);
      cus.setProofType(proofType);
      cus.setProofId(proofId);
     
      System.out.println("Thanks for your registering. Your register id is "+ ++registerID);
      System.out.println("Do you want to book room (Y/N)");
      r=br.readLine();
      if(r.equalsIgnoreCase("y"))
      {
    	  System.out.println("******** Booking ******** \n *****Please choose the services required *****");
   		 System.out.println("Do you want AC/non-AC(AC/nAC)");
   		 ac=br.readLine();
   		 System.out.println("Do you want cot(single/double)");
   		 cot=br.readLine();
   		 System.out.println("Do you need With cable connection/without cable connection(C/nC)");
   		 cable=br.readLine();
   		 System.out.println("Do you need Wi-Fi or not(W/nW)");
   		 wifi=br.readLine();
   		 System.out.println("Do you need laundry service or not(L/nL)");
   		  laundry = br.readLine();
   		 System.out.println("Enter the date of booking ");
   		 date=br.read();
   		 
   		 rb.setAc(ac);
 	     rb.setCot(cot);
 	     rb.setCable(cable);
 	     rb.setWifi(wifi);
 	     rb.setLaundry(laundry);
 	     rb.setDate(date);
 	    rb.RoomBooking();
     	 //System.out.println("Do you want to proceed?");
        //i=br.readLine();
      }
      
      /*System.out.println("Do you want to update your email id ");
      e=br.readLine();
	  //Customer c=new Customer();
      if(e.contentEquals("y"))
      {
	  cus.update();
	  //cus.setEmail(e);
	  cus.register1();
      }*/
      System.out.println("Do you want to proceed?");
      //i=br.readLine();
      
      System.out.println("Do you want to continue (Y/N)");
      i=br.readLine();
	}while(i.equalsIgnoreCase("Y"));
      
      if(i.contentEquals("n"))
      {
    	  
    	  
    	  //System.out.println(e);
    	  System.out.println("************** Customers list **************");
          System.out.println("**** The registered customers are ****");
          System.out.println("Customer ID  "+"   Customer name");
          int p=0;
          for(int n=1;n<=registerID;n++)
          {
        	  System.out.println("  "+n+"                "+customers[p]);
        	  p++;
          }
          
          System.out.println("       Thank You         ");
      }
      
      int menu;
      
      //menu=Integer.parseInt(br.readLine());
      Menu mn=new Menu();
      mn.menu();
      
 
      //mn.setRoomnumber(roomNumber);
	}
	 
	 
	

}
