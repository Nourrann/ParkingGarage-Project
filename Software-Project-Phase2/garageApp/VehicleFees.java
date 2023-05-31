package garageApp;

public class VehicleFees {
	
	int vFs;
	VehicleFees()
	{
		vFs=0;
	}
	public int getTotalIncome()
	{
		return vFs;
	}
	
	public int calculate(int a,int d){
		
//		System.out.println(a+" : "+d);
		int x=(d-a)*5;
		vFs+=x;
		return x;
	}
}
