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
      
      
      int menu;
      
      //menu=Integer.parseInt(br.readLine());
      Menu mn=new Menu();
      mn.menu();
      
 
      //mn.setRoomnumber(roomNumber);
	}
	 
	 
	

}
