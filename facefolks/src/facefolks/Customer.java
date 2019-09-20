package facefolks;

public class Customer {

	String name;
	String address;
    String contact;
    String email;
    String proofType;
    String proofId;
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
		System.out.println("Your details are : ");
		System.out.println(name);
		System.out.println(address);
		System.out.println(contact);
		System.out.println(email);
		System.out.println(proofType);
		System.out.println(proofId);
		
		System.out.println("Thanks for your registering. Your register id is ");
	}
}
