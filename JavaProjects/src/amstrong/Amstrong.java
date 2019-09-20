package amstrong;
import java.util.Scanner;
import java.lang.Math;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int num,count=0,rem;
		double sum=0;
		double cube;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		
		int n=num;
		int n1=num;
		while(num > 0)
		{
			count++;
			num=num/10;
		}
		while(n > 0)
		{
			rem=n%10;
			cube=Math.pow(rem, count);
			n=n/10;
			sum=sum+cube;
		}
		if(sum==n1)
		{
			System.out.println("The given number is amstrong");
		}
		else
		{
			System.out.println("The given number is not amstrong");
		}

	}

	

}
