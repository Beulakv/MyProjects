package examination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examination {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int n,count=0;
		int mark[];
		 System.out.println("Enter the number of students ");
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 n=Integer.parseInt(br.readLine());
		 mark=new int[n];
		 System.out.println("Enter the marks of students ");
		 for(int i=0;i<n;i++)
		 {
			 mark[i]=Integer.parseInt(br.readLine());
		 }
		 for(int i=0;i<n;i++)
		 {
			 if(mark[i]<50)
			 {
				 count++;
			 }
		 }
		 System.out.println("Number of students appearing for retest is "+count);
	}

}
