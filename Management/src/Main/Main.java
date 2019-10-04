package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.AbstractDocument.LeafElement;

import LeanSeason.LeanSeason;
import PeakSeason.PeakSeason;
import inheritance.Booking;

public class Main {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 int p;
		 int total_Days;
		 double tariff;
		 String roomType;
		 double total_price = 0;
		 int peakcharge;
		 int discount;
		
		int month;
		
		//static Booking b=new Booking();
		 //Main m=new Main();
		 PeakSeason ps=new PeakSeason();
		 LeanSeason ls=new LeanSeason();
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("************* Booking *************");
		System.out.println("Enter the number of persons");
		p=Integer.parseInt(br.readLine());
	
		//b.setPersons(persons);
		System.out.println("Enter the number of days");
		total_Days=Integer.parseInt( br.readLine());
		//b.setTotal_days(total_Days);
		System.out.println("Enter the room type (AC/nAC)");
		roomType=br.readLine();
		//b.setRoomtype(roomType);
		
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
		
		if(month==4||month==5||month==6||month==9||month==11||month==12)
		{
			System.out.println("Enter the peakcharge");
			peakcharge=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Double.parseDouble(br.readLine());
			//b.setTariff(tariff);
			total_price=ps.roomBook(p,total_Days,roomType,month,peakcharge,tariff);
		}
		if(month==1||month==2||month==3||month==7||month==8||month==10)
		{
			System.out.println("Enter the discount");
			discount=Integer.parseInt(br.readLine());
			System.out.println("Enter the tariff for single person");
			tariff=Double.parseDouble(br.readLine());
			//b.setTariff(tariff);
			total_price=ls.roomBook(p,total_Days,roomType,month,discount,tariff);
		}
		
		//f=b.roomBooking(persons, total_Days, tariff, roomType);
		System.out.println("Total price "+total_price);
		//System.out.println("Total price "+lean);

	}

}
