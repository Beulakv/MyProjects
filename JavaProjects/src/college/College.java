package college;

public class College {

	String name;
    
	int age;
    String degree;
    String branch;
    String contactNumber;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void College()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Degree : "+degree);
		System.out.println("Branch : "+branch);
		System.out.println("Contact : "+contactNumber);
	}
}
