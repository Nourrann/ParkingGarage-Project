package garageApp;

import java.util.Scanner;
public class Display {

	public static void displaySlots(Garage obj,Slots obj2)
	{
		for(int i=0;i<obj.getmaxNumberOfSlots();i++)
		{
			System.out.println("Dimensions for slot "+ (i+1)+": ");
			for(int j=0;j<2;j++)
			{
				System.out.println(obj2.dim[i][j]+" ");
			}
			System.out.println();
		}
	}
//	public void displayNotAvaliable();
}