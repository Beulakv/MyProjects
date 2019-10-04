package Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import Customer.Customer;

public class Register {
	
	
    int c;
    public static int registerID=0;
    
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> addr = new ArrayList<String>();
    public static ArrayList<String> contacts = new ArrayList<String>();
    public static ArrayList<String> emailaddr = new ArrayList<String>();
    public static ArrayList<String> prooftype = new ArrayList<String>();
    public static ArrayList<String> proofid = new ArrayList<String>();
    
    public static int regid[]=new int[25];
    public static int index=0;
    
    String email;
    
    //public static String emailaddr[]=new String[50];
    public static int ei=0;
    
    int id;
    
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
	//Register cs=new Register();
	Customer cus=new Customer();
     
	public void reg(String name,String address,String contact,String email,String proofType,String proofId) throws IOException
	{
		
		  cus.setName(name);
	      names.add(cus.getName());
	      cus.setAddress(address);
	      addr.add(cus.getAddress());
	      cus.setContact(contact);
	      contacts.add(cus.getContact());
	      cus.setEmail(email);
	      emailaddr.add(cus.getEmail());
	      cus.setProofType(proofType);
	      prooftype.add(cus.getProofType());
	      cus.setProofId(proofId);
	      proofid.add(cus.getProofId());
	      
	      this.display();
	}
	
	public void display()
	{
		System.out.println("******* Your details are ******* ");
		System.out.println("Name           : "+cus.getName());
		System.out.println("Address        : "+cus.getAddress());
		System.out.println("Contact Number : "+cus.getContact());
		System.out.println("E-Mail ID      : "+cus.getEmail());
		System.out.println("Proof type     : "+cus.getProofType());
		System.out.println("Proof id       : "+cus.getProofId());
		
		System.out.println("Thanks for your registering. Your register id is "+ ++registerID);
		regid[index]=registerID;
		  index++;
	}
	
	
	public void update() throws IOException
	{
		System.out.println("******* Update Email *******");
		
		System.out.println("Enter your ID");
		id=Integer.parseInt(br.readLine());
		//c=--id;
		//cus.getRegisterID();
		System.out.println("Enter new email id ");
		
		email=br.readLine();
		
		emailaddr.remove(id-1);
		emailaddr.add(id-1,email);
		//cs.emailaddr[c]=email;
		
		//cs.setEmail(email);
		//System.out.println(upEmail);
		//cs.Id(1);
		System.out.println("Your email updated");
		//this.display();
	}
	
	public void Id(int j)
	{
		int id=0;
		
		if(id==1)
			++registerID;
	}
	public void emaildisplay() {
		// TODO Auto-generated method stub
		ListIterator it = emailaddr.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//this.display();
	}
	
	public void viewcustomer()
	{
		System.out.println("All Customers ");
		System.out.println("Customer Id     "+"Customers Name");
		Object[] arr=names.toArray();
		for(int i=0;i<index;i++)
		{
			System.out.println(Register.regid[i]+"                    "+arr[i]);
		}
	}

}
