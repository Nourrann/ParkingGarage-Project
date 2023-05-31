package GarageApplication;
import java.util.Scanner;

public class Slots extends vehicle{
	
	private int maxNumberSlots;
	protected static int index;
	double[][] dim;
//	vehicle v ;
	Scanner input = new Scanner(System.in);
	public Slots()
	{
//		maxNumberSlots =m;
		
//		v = new vehicle();
	}
	public void setMaxofSlots(int s)
	{
		maxNumberSlots = s;
		index = maxNumberSlots;
		dim=new double[maxNumberSlots][2];
		
	}
	public int getMax()
	{
		return maxNumberSlots;
	}
	public void enterSlotDimensions()
	{
		System.out.println("Dear Admin Enter dimensions: ");
		for(int i=0;i<maxNumberSlots;i++)
		{
			System.out.print("Enter dimensions for slot "+ (i+1)+": ");
			for(int j=0;j<2;j++)
			{
				dim[i][j] = input.nextDouble();
			}
			
		}
	}
	
	public void parkingIn()
	{
		System.out.println("\nThe driver parked in..");
	}
	
	
	public void chooseSlot()
	{
		boolean stat =true;
		if(checkAvailableSlots())
		{
			for(int i=0;i<maxNumberSlots;i++)
			{
				
				for(int j=0;j<2;j++)
				{
//					System.out.println(getWidth());
//					System.out.println(dim[i][j]);
					if(getWidth()<=dim[i][j])
					{
						j++;
						if(getdipth()<=dim[i][j])
						{
							j--;
							System.out.print("Slot avalible no "+(i+1)+": of dimensions "+dim[i][j]+", "+ dim[i][++j] );
							parkingIn();
							stat =false;
//							return 0;
						}
						
					}
					
				}
				if(stat==false)
				{
					break;
				}
				
				System.out.println();
			}
		}
	}
	public boolean checkAvailableSlots()
	{
		
		if(index > 0)
		{
			displaySlots();
			return true;
			
		}else
		{
			System.out.println("Not Available Slots");
			return false;
		}
	}
	
	public void displaySlots()
	{
		for(int i=0;i<maxNumberSlots;i++)
		{
			System.out.println("Dimensions for slot "+ (i+1)+": ");
			for(int j=0;j<2;j++)
			{
				System.out.println(dim[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
