package garageApp;

import java.util.Arrays;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class BestFit extends ParkIn{
	
	
	@Override
	public void park(Garage obj,Slots obj2,VehicleData v)
	{
		boolean status =true;
		double areaOFvehicle = v.getWidth() * v.getdipth();
		double areaOfSlot=1;
		double arr[];
		double arr2[];
		arr= new double[obj.getmaxNumberOfSlots()];
		arr2= new double[obj.getmaxNumberOfSlots()];
		for(int i=0;i<obj.getmaxNumberOfSlots();i++)
		{
			for(int j=0;j<2;j++)
			{
				areaOfSlot*=obj2.dim[i][j];
				arr[i]=areaOfSlot;
				arr2[i]=areaOfSlot;
			}
			areaOfSlot=1;
		}
		
		Arrays.sort(arr);
		if(checkAvailableSlots(obj2))
		{
			int i=0;
			for( i=0;i<obj.getmaxNumberOfSlots();i++)
			{
//				System.out.print(obj2.stat[i]);
				if(areaOFvehicle<=arr[i] && obj2.stat[i] == false)
				{
					for(int x=0;x<obj.getmaxNumberOfSlots();x++)
					{
						if(arr[i]==arr2[x])
						{
							System.out.print("Slot avalible no "+(x+1) );
							break;
						}
					}
					
					System.out.println("\nThe driver parked in..");
					System.out.println("Number of Vehicle Now "+t.getTotalVehicls());
					obj2.stat[i] = true;
					captureArrivalTime(v);
					status =false;			
				}
				if(status==false)
				{
					break;
				}
				
				
				System.out.println();
			}
			if(i==obj.getmaxNumberOfSlots())
			{
				System.out.println("No Slot avalible for this vehicle..!");
			}
		}
	}
	public boolean checkAvailableSlots(Slots obj2)
	{

		if(obj2.index > 0)
		{

			return true;
			
		}else
		{
			System.out.println("Not Available Slots");
			return false;
		}
	}

}