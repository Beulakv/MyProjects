package leapyear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int year;
		System.out.println("Enter a year ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		year=Integer.parseInt(br.readLine());
		if(year%400==0 && year%100==0 || year%4!=0)
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}

}
