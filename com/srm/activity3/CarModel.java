package com.srm.activity3;

public class CarModel {
     String Color,Model,Brand,FuelType;
     float Weight,Price;
     int MileAge;     public CarModel(String clr,String m,String brd,String ft,float w,float p,int ma)
     {
    	 this.Color=clr;
    	 this.Model=m;
    	 this.Brand=brd;
    	 this.FuelType=ft;
    	 this.Weight=w;
    	 this.Price=p;
    	 this.MileAge=ma;
     }
     public Boolean isBrakeApplied(boolean flag)
     {
    	 if(!flag)
    	 {
    		 System.out.println("Stop the Car from Running");
    	 }
    	 else
    	 {
    		 System.out.println("Steer the Car to move to reach the destination");
    	 }
    	 return flag;
     }
   
}
