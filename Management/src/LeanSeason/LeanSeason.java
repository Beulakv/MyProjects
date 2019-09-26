package LeanSeason;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import inheritance.Booking;

public class LeanSeason extends Booking
{
	
	
	public double roomBook(int persons, int total_Days, String roomType, int month, int discount, double tariff) {
		// TODO Auto-generated method stub
		double totpri=super.roomBooking(persons, total_Days, tariff, roomType);
		double dis=totpri*discount/100;
		//double prices=discount*totpri;
		
		
		
		  return totpri-dis;
	}


}

