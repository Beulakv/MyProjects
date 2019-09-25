package facefolks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	String name;
	String address;
    String contact;
    String email;
    String proofType;
    String proofId;
    
    String upEmail;
    
    static int registerID=0;
    
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
	void register() {
		// TODO Auto-generated method stub
		System.out.println("******* Your details are ******* ");
		System.out.println("Name           : "+name);
		System.out.println("Address        : "+address);
		System.out.println("Contact Number : "+contact);
		System.out.println("E-Mail ID      : "+email);
		System.out.println("Proof type     : "+proofType);
		System.out.println("Proof id       : "+proofId);
		
		System.out.print("Thanks for your registering. Your register id is ");
	}
	void register1() {
		// TODO Auto-generated method stub
		System.out.println("******* Your details are as follows *******");
		System.out.println("Name           : "+name);
		System.out.println("Address        : "+address);
		System.out.println("Contact Number : "+contact);
		System.out.println("E-Mail ID      : "+email);
		System.out.println("Proof type     : "+proofType);
		System.out.println("Proof id       : "+proofId);
		
		//System.out.print("Thanks for your registering. Your register id is ");
	}
	void update() throws IOException
	{
		BufferedReader book=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("******* Update Email *******");
		System.out.println("Enter new email id ");
		email=book.readLine();
		Customer cs=new Customer();
		cs.setEmail(email);
		//System.out.println(upEmail);
	}
}
