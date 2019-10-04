package inheritance;

public class Booking {
	private int persons;
	private int total_days;
	private double tariff;
	private String roomtype;
	
	private double price;
	
	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
		//System.out.println(persons);
	}

	public int getTotal_days() {
		return total_days;
	}

	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}

	public double getTariff() {
		return tariff;
	}

	public void setTariff(double tariff) {
		this.tariff = tariff;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}


	
	public double roomBooking(int persons, int total_Days, double tariff, String roomType) {
		// TODO Auto-generated method stub
		price=persons*total_Days*tariff;
		return price;
	}
	
}
