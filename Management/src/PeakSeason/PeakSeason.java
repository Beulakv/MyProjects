package PeakSeason;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import inheritance.Booking;

public class PeakSeason extends Booking
{
	
	int month;
	int peakcharge;
	//int mon,peak;
	
	Booking bk=new Booking();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	


	public double roomBook(int persons, int total_Days, String roomType, int month,int peakcharge,double tariff) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double totpri=super.roomBooking(persons, total_Days, tariff, roomType);
		
		double prices=peakcharge*totpri;
		
		
		
		  return prices;
	}


}
