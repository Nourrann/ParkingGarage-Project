package GarageApplication;
import java.util.Scanner;
public class vehicle {
	 	private String ModelName;
	    private int ModelYear;
	    private static int ID =1; //instead of string
	    private double width;
	    private double depth;
	    App s; 
	    
	    

	    
	    public vehicle() {
			// TODO Auto-generated constructor stub
//	    	ID++;
	    	s =new App();
		}

		public double getWidth()
	    {
	    	return width;
	    }
	    public double getdipth()
	    {
	    	return depth;
	    }
	    void EnterVehicleData(){
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter vehicle's width: ");
	        width = input.nextDouble();

	        System.out.print("Enter vehicle's depth: ");
	        depth = input.nextDouble();

	        System.out.print("Enter model name: ");
	        ModelName = input.next();

	        System.out.print("Enter model year: ");
	        ModelYear = input.nextInt();
	        
	        System.out.println("Your vehicle identification number is " + ID);
	        ID++;
	            //Vehicle Identification Number, increments
	        Slots.index--;
	    }

		
}
