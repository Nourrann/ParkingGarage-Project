package garageApp;

import java.util.Scanner;



public class main {

//	private static Scanner input;
	
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int vehicleOut=0;
		int x;
		System.out.print("Enter max no of slots: ");
		x = input.nextInt();
		Garage g = new Garage();
		g.setmaxNumberOfSlots(x);
//		Garage.setmaxNumberOfSlots(x);
		
		Slots s = new Slots(g);
		s.enterSlotDimensions(g);
		
		int n;
		System.out.println("Enter Config(1 or 2): ");
		System.out.print("(1 refer to First come ,2 refer to BistFit) :");
		n = input.nextInt();
		g.setConfig(n);
		
		Display.displaySlots(g, s);
		
		
		while (true)
		{
			
//			System.out.print("Do you want to Parkin or Park out(in/out):");
			
				totalVehicls t =new totalVehicls(); 
				VehicleData [] v =new VehicleData [x];
				VehicleFees e =new VehicleFees();
				for(int i=0;i<x;i++)
				{
					
					if(g.getConfig()==1){
						FirstCome f =new FirstCome();

						v[i].EnterVehicleData();
					
						f.park(g,s,v[i]);
						System.out.print("Do you want to Parkin or Park out(in/out):");
						String p = input.next();

						if(p.contains("out")){
							int slot;
							System.out.print("Enter no slot: ");
							slot = input.nextInt();
							ParkOut o = new ParkOut();
							o.Parkingout(slot,s,v[slot-1]);
							int A = v[slot-1].getarrivalHour();
							int d = v[slot-1].getdepartureHour();
							
							System.out.println("Fees: "+e.calculate(A, d));
							i--;
							vehicleOut++;
							System.out.println("To exit and show total income enter -1: ");
							int exit = input.nextInt();
							if(exit==-1)
							{
								System.out.println("Tota income For "+vehicleOut+"Vehicles = "+e.getTotalIncome());
								System.exit(0);
							}
						}

					}else if(g.getConfig()==2){
						BestFit b =new BestFit();
						
						v[i] = new VehicleData();
						v[i].EnterVehicleData();
						b.park(g, s, v[i]);
						
						System.out.print("Do you want to Parkin or Park out(in/out):");
						String p = input.next();
						if(p.contains("out")){
							int slot;
							System.out.print("Enter no slot: ");
							slot = input.nextInt();
							ParkOut o = new ParkOut();
							o.Parkingout(slot,s,v[slot-1]);
							int A = v[slot-1].getarrivalHour();
							int d = v[slot-1].getdepartureHour();
							
							System.out.println("Fees: "+e.calculate(A, d));
							i--;
							vehicleOut++;
							
							System.out.print("To exit and show total income enter -1: ");
							int exit = input.nextInt();
							if(exit==-1)
							{
								System.out.println("Tota income For "+vehicleOut+" Vehicles = "+e.getTotalIncome());
								System.exit(0);
							}
							
						}
					}
					
//					v.park(g);
				}
				System.out.println("Garage is Full");
			
		}
		
	}

}