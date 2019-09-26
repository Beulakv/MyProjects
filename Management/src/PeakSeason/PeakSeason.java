package PeakSeason;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import inheritance.Booking;

public class PeakSeason extends Booking
{
	
	
	public double roomBook(int persons, int total_Days, String roomType, int month,int peakcharge,double tariff) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double totpri=super.roomBooking(persons, total_Days, tariff, roomType);
		
		double prices=peakcharge*totpri;
		
		
		
		  return prices;
	}


}
