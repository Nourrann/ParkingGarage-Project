package garageApp;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class ParkOut {

//	vehicle v;
	
	public void captureDepartureTime(VehicleData v)
	{
		int DepH;
		SimpleDateFormat formatter= new SimpleDateFormat("mm");
		Date date = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(date));
		String x = formatter.format(date);
		DepH = Integer.parseInt(x);
//		System.out.println("dep :"+DepH);
		
		v.setdepartureHour(DepH);
	}
	public void Parkingout(int id,Slots s,VehicleData v)
	{
		s.stat[id-1] = false;
		
		captureDepartureTime(v);
		System.out.println("This slot is avalible now..");
		Slots.index--;
	}
}