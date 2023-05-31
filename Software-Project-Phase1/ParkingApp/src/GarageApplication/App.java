package GarageApplication;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class App {
	private int  arrivalHour;
	private int departureHour;
	
	
	
	public void captureArrivalTime()
	{
		SimpleDateFormat formatter= new SimpleDateFormat(" HH ");
		Date date = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(date));
		String x = formatter.format(date);
		arrivalHour = Integer.parseInt(x);
	}
	public void captureDepartureTime()
	{
		SimpleDateFormat formatter= new SimpleDateFormat(" HH ");
		Date date = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(date));
		String x =formatter.format(date);
		departureHour = Integer.parseInt(x);
	}
	public int calculateFees()
	{
		return Math.abs((departureHour - arrivalHour)*5);
	}
}