package com.srm.Exercise2;

public class CarModel {
	String Color,Model,Brand,FuelType,VechNo;
    float Weight,Price;
    int MileAge;     
    public CarModel(String clr,String m,String brd,String ft,String VechNo,float w,float p,int ma)
    {
   	 this.Color=clr;
   	 this.Model=m;
   	 this.Brand=brd;
   	 this.FuelType=ft;
   	 this.VechNo=VechNo;
   	 this.Weight=w;
   	 this.Price=p;
   	 this.MileAge=ma;
    }
    public Boolean isBrakeApplied(boolean flag)
    {
   	 if(!flag)
   	 {
   		System.out.println("Steer the Car till you reach the destination"); 
   	 }
   	 else
   	 {
   		System.out.println("Stop the Car from Running");
   	 }
   	 return flag;
    }
    public String isCheckFuel(String Val)
    {
    	String Res="";
    	if(Val.equals("full"))
    	{
    		Res="No need to fill the tank";
    	}
    	else if(Val.equals("empty"))
    	{
    		Res="fill the fuel tank";
    	}
    	else
    	{
    		Res="Drive the car until fuel is over";
    	}
    	return Res;
    }
    public Boolean isAudioOn(boolean flag)
    {
    	if(flag)
    	{
    		System.out.println("Play the Music");
    	}
    	else
    	{
    		System.out.println("On the Audio and Start to Play Music");
    	}
    	return flag;
    }
    public void checkEngineCondition(String Str)
    {
    	if(Str.equals("OverHeat"))
    	{
    		System.out.println("Car doesn't Start!!Failure in Engine");
    	}
    	else
    	{
    		System.out.println("Enjoy Safe Driving");
    	}
    }
    public void seatBeatAvailable(boolean flag)
    {
    	if(flag)
    	{
    		System.out.println("Wear the Seat Belt and Drive Safely!!");
    	}
    	else
    	{
    		System.out.println("You are at Risk any time!!");
    	}
    }
    
}
