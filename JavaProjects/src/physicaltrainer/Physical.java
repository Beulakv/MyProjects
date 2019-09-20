package physicaltrainer;

import java.util.Scanner;

public class Physical {

	public static void main(String[] args){
		// TODO Auto-generated method stub
 
		int a;
		float temp;
		float arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sum of the students ");
		a=sc.nextInt();
		arr=new float[a];
		System.out.println("Enter the heights of the students ");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextFloat();
		}
		
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]>arr[j])
				{
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				}
			}
		}
		System.out.println("The heights in order are ");
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
