package facefolks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

   
	 static int registerID=0;
	 static int roomNumber=0;
	 
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String name;
      String address;
      String contact;
      String email;
      String proofType;
      String proofId;
      String i;
     
 	 
 	String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
 	 
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      do
      {
    	  
      
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
      
      Customer cus=new Customer();
      cus.setName(name);
      cus.setAddress(address);
      cus.setContact(contact);
      cus.setEmail(email);
      cus.setProofType(proofType);
      cus.setProofId(proofId);
     // Main customer=new Main(name,address,contact,email,proofType,proofId);
      cus.register();
      System.out.println(++registerID);
      
      
 	 //void RoomBooking(String ac, String cot, String cable, String wifi, String laundry, String date) throws IOException
 	// {
 		 
 	     
 	// }
      
      System.out.println("Do you want to continue (Y/N)");
      i=br.readLine();
	}while(i.equalsIgnoreCase("Y"));
      
      do
      {
    	  BufferedReader book=new BufferedReader(new InputStreamReader(System.in));
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
  		
  	     RoomBooking rb=new RoomBooking();
  	     rb.setAc(ac);
  	     rb.setCot(cot);
  	     rb.setCable(cable);
  	     rb.setWifi(wifi);
  	     rb.setLaundry(laundry);
  	     
  	   System.out.println("Do you want to proceed (Y/N)");
       i=br.readLine();
       rb.RoomBooking();
      }while(i.equalsIgnoreCase("n"));
	
	}
	 
	 
	

}
