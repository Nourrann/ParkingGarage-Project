
package GarageApplication;

import java.util.Scanner;



public class Main {

//	private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		System.out.print("Enter max no of slots: ");
		x = input.nextInt();
		
		Slots v = new Slots();
		v.setMaxofSlots(x);
		
		v.enterSlotDimensions();
		
		
		
		
		for(int i=0;i<2;i++)
		{
			

			v.EnterVehicleData();
			v.chooseSlot();
		}
	}
}