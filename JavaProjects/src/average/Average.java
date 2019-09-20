package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stud,sum=0,avg;
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students ");
		stud=sc.nextInt();
		arr=new int[stud];
		System.out.println("Enter the marks of students ");
		for(int i=0;i<stud;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<stud;i++)
		{
			sum=sum+arr[i];
		}
		//avg=sum/stud;
		System.out.println("The average is "+sum/stud);
		
	}

}
