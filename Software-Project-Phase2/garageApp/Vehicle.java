package garageApp;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public abstract class Vehicle {
	 	private String ModelName;
	    private int ModelYear;
	    public static int ID =1; //instead of string
	    private double width;
	    private double depth;
	    private int  arrivalHour;
		private int departureHour;

	   
	    
	    

	    
	    public Vehicle() {
	    	
//			obj =new Garage;
		}
	    public void setarrivalHour(int AH)
	    {
			arrivalHour = AH;
	    }
	    public void setdepartureHour(int DH)
	    {
	    	departureHour = DH;
	    }
	    public int getarrivalHour()
	    {
	    	return arrivalHour;
	    }
	    public int getdepartureHour()
	    {
	    	return departureHour;
	    }
	    public void setWidth(double w)
	    {
	    	width = w;
	    }
	    public void setDepth(double d)
	    {
	    	depth = d;
	    }
	    public void setModelYear(int Y)
	    {
	    	ModelYear = Y;
	    }
	    public void setModelName(String N)
	    {
	    	ModelName = N;
	    }
	    public double getWidth()
	    {
	    	return width;
	    }
	    public double getdipth()
	    {
	    	return depth;
	    }

	    public String getModelName()
	    {
	    	return ModelName;
	    }
	    public int getModelyear()
	    {
	    	return ModelYear;
	    }
	    public int getID()
	    {
	    	return ID;
	    }
	    

		
}