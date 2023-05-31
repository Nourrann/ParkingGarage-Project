package garageApp;

import java.util.Scanner;

public class VehicleData extends Vehicle {
	
	
	void EnterVehicleData(){
        Scanner input = new Scanner(System.in);
        double w,d;
        String n;
        int My;
        System.out.print("Enter vehicle's width: ");
        w = input.nextDouble();
        setWidth(w);


        System.out.print("Enter vehicle's depth: ");
        d = input.nextDouble();
        setDepth(d);
//        System.out.println(v.getdipth());

        System.out.print("Enter model name: ");
        n = input.next();
        setModelName(n);

        System.out.print("Enter model year: ");
        My = input.nextInt();
        setModelYear(My);
        
        System.out.println("Your vehicle identification number is " + getID());
        ID++;
            //Vehicle Identification Number, increments
        Slots.index++;
        
        
        
    }
	
}