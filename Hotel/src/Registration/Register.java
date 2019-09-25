package Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Register {
	
	public String name;
    String address;
    String contact;
    String email;
    String proofType;
    String proofId;
    int c;
    public static int registerID=0;
    
    public static int regid[]=new int[25];
    public static int index=0;
    
    public static String emailaddr[]=new String[50];
    public static int ei=0;
    
    int id;
    
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static int getRegisterID() {
		return registerID;
	}
	public static void setRegisterID(int registerID) {
		Register.registerID = registerID;
	}

	public static String customers[]=new String[25];
    int pos=0;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
     
	public void reg() throws IOException
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
	      emailaddr[ei]=email;
	      ei++;
	      System.out.println("Enter your prooftype : ");
	      proofType=br.readLine();
	      System.out.println("Enter your proofid : ");
	      proofId=br.readLine();
	      regid[index]=++registerID;
			index++;
	      
	      System.out.println("******* Your details are ******* ");
			System.out.println("Name           : "+name);
			System.out.println("Address        : "+address);
			System.out.println("Contact Number : "+contact);
			System.out.println("E-Mail ID      : "+email);
			System.out.println("Proof type     : "+proofType);
			System.out.println("Proof id       : "+proofId);
			
			System.out.println("Thanks for your registering. Your register id is "+ registerID);
	}
	
	/*public void reg_new()
	{
		System.out.println("******* Your details are ******* ");
		System.out.println("Name           : "+name);
		System.out.println("Address        : "+address);
		System.out.println("Contact Number : "+contact);
		System.out.println("E-Mail ID      : "+email);
		System.out.println("Proof type     : "+proofType);
		System.out.println("Proof id       : "+proofId);
	}*/
	
	public void update() throws IOException
	{
		System.out.println("******* Update Email *******");
		Register cs=new Register();
		System.out.println("Enter your ID");
		id=Integer.parseInt(br.readLine());
		c=--id;
		cs.getRegisterID();
		System.out.println("Enter new email id ");
		email=br.readLine();
		cs.emailaddr[c]=email;
		
		cs.setEmail(email);
		//System.out.println(upEmail);
		cs.Id(1);
		System.out.println("Your email updated");
	}
	
	public void Id(int j)
	{
		int id=0;
		
		if(id==1)
			++registerID;
	}
    
    

}
