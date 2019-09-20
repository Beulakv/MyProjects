package prority;

import java.util.Scanner;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int stud,temp;
		int mark[];
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the number of students ");
		stud=st.nextInt();
		mark=new int[stud];
		System.out.println("Enter the marks of students ");
		for(int i=0;i<stud;i++)
		{
			mark[i]=st.nextInt();
		}
		for(int i=0;i<stud;i++)
		{
			for(int j=i;j<stud;j++)
			{
				if(mark[i] < mark[j])
				{
					temp=mark[i];
					mark[i]=mark[j];
					mark[j]=temp;
				}
			}
		}
		System.out.println("The prority of marks is ");
		for(int i=0;i<stud;i++)
		{
			System.out.println(mark[i]);
		}
	}

}
