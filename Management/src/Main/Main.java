package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.AbstractDocument.LeafElement;

import LeanSeason.LeanSeason;
import PeakSeason.PeakSeason;
import inheritance.Booking;

public class Main {
	
	static int persons;
	static int total_Days;
	static double tariff;
	static String roomType;
	static double f,total_price,lean;
	static int peakcharge;
	static int discount;
	
	public static int month;
	
	static Booking b=new Booking();
	static Main m=new Main();
	static PeakSeason ps=new PeakSeason();
	static LeanSeason ls=new LeanSeason();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of persons");
		persons=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of days");
		total_Days=Integer.parseInt( br.readLine());
		System.out.println("Enter the room type (AC/nAC)");
		roomType=br.readLine();
		
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
		if(month==4||month==5||month==6||month==9||month==11||month==12)
		{
			System.out.println("Enter the peakcharge");
			peakcharge=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Double.parseDouble(br.readLine());
			b.setTariff(tariff);
			total_price=ps.roomBook(persons,total_Days,roomType,month,peakcharge,tariff);
		}
		if(month==1||month==2||month==3||month==7||month==8||month==10)
		{
			System.out.println("Enter the discount");
			discount=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Double.parseDouble(br.readLine());
			b.setTariff(tariff);
			total_price=ls.roomBook(persons,total_Days,roomType,month,discount,tariff);
		}
		
		//f=b.roomBooking(persons, total_Days, tariff, roomType);
		System.out.println("Total price "+total_price);
		//System.out.println("Total price "+lean);

	}

}
