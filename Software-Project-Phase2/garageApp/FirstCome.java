package garageApp;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class FirstCome extends ParkIn{
	
	
	public FirstCome()
	{
		
	}
	@Override
	public void park(Garage obj,Slots obj2,VehicleData v)
	{
		boolean status =true;
		if(checkAvailableSlots(obj2))
		{
			for(int i=0;i<obj.getmaxNumberOfSlots();i++)
			{
				
				for(int j=0;j<2;j++)
				{
//					System.out.println(getWidth());
//					System.out.println(dim[i][j]);
//					System.out.println(v.getWidth());
					if(v.getWidth()<=obj2.dim[i][j] && obj2.stat[i] == false)
					{
						j++;
//						System.out.println(v.getdipth()+" "+obj2.dim[i][j]);
						if(v.getdipth()<=obj2.dim[i][j])
						{
							j--;
							System.out.print("Slot avalible no "+(i+1)+": of dimensions "+obj2.dim[i][j]+", "+ obj2.dim[i][++j] );
							System.out.println("\nThe driver parked in..");
							System.out.println("Number of Vehicle Now "+t.getTotalVehicls());
							obj2.stat[i] = true;
//							System.out.println(stat[i]+" h");
							captureArrivalTime(v);
							status =false;
//							return 0;
						}
						
					}
					
				}
				if(status==false)
				{
					break;
				}
				
				System.out.println();
			}
		}
	}
	public boolean checkAvailableSlots(Slots obj2)
	{
//		System.out.println(obj2.index);
		if(obj2.index > 0)
		{
//			displaySlots(obj,obj2);
			return true;
			
		}else
		{
			System.out.println("Not Available Slots");
			return false;
		}
	}
//	public void displaySlots(Garage obj,Slots obj2)
//	{
//		for(int i=0;i<obj.getmaxNumberOfSlots();i++)
//		{
//			System.out.println("Dimensions for slot "+ (i+1)+": ");
//			for(int j=0;j<2;j++)
//			{
//				System.out.println(obj2.dim[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
}