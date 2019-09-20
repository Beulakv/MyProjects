package college;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Resume {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    String name;
    int age;
    String degree;
    String branch;
    String contactNumber;
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter your name ");
    name=br.readLine();
    System.out.println("Enter your age ");
    age=br.read();
    System.out.println("Enter your degree ");
    degree=br.readLine();
    degree=br.readLine();
    System.out.println("Enter your Branch ");
    branch=br.readLine();
    System.out.println("Enter your contact number ");
    contactNumber=br.readLine();
    
    College col=new College();
    col.setName(name);
    col.setAge(age);
    col.setDegree(degree);
    col.setBranch(branch);
    col.setContactNumber(contactNumber);
    col.College();
	}

}
