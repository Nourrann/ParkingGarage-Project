package garageApp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Slots {
	

	protected static int index;
	public double[][] dim;
	public boolean stat[];

	
	Scanner input = new Scanner(System.in);
	public Slots(Garage obj)
	{
		stat = new boolean[obj.getmaxNumberOfSlots()];
		for(int i=0;i<obj.getmaxNumberOfSlots();i++)
		{
			stat[i]=false;
		}
		
	}
	
	
	public void enterSlotDimensions(Garage obj)
	{
		dim =new double[obj.getmaxNumberOfSlots()][2];
		for(int i=0;i<obj.getmaxNumberOfSlots();i++)
		{
			for(int j=0;j<2;j++)
			{
				dim[i][j]=0;
			}
		}
		

		System.out.println("Dear Admin Enter dimensions: ");

		for(int i=0;i<obj.getmaxNumberOfSlots();i++)
		{
			System.out.print("Enter dimensions for slot "+ (i+1)+": ");
			for(int j=0;j<2;j++)
			{
				dim[i][j] = input.nextDouble();
			}
		}
	}	
}