package garageApp;

import java.sql.Date;
import java.text.SimpleDateFormat;

public abstract class ParkIn {
//	vehicle v=new vehicle();
//	Slots s= new Slots();
	totalVehicls t =new totalVehicls();
	public  void captureArrivalTime(VehicleData v){
//		int ArrH;
		SimpleDateFormat formatter= new SimpleDateFormat( "mm");
		Date date = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(date));
		String x = formatter.format(date);
		int i=Integer.parseInt(x);  
//		System.out.println("arr :"+i);
		v.setarrivalHour(i);
	}
	
	public abstract void park(Garage obj,Slots obj2,VehicleData v);
}