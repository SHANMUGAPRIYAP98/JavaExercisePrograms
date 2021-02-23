package com.srm.Exercise2;

import java.util.Scanner;

public class CarModelDemo2 {

	public static void main(String[] args) {
		String Color,Model,Brand,FuelType,VechNo;
	    float Weight,Price;
	    int MileAge;    
	    System.out.println("Enter the Color : ");
	    Scanner sc=new Scanner(System.in);
	    Color=sc.next();
	    System.out.println("Enter the Model : ");
	    Model=sc.next();
	    System.out.println("Enter the Brand : ");
	    Brand=sc.next();
	    System.out.println("Enter the FuelType : ");
	    FuelType=sc.next();
	    System.out.println("Enter the Vechile No : ");
	    VechNo=sc.next();
	    System.out.println("Enter the Weight : ");
	    Weight=sc.nextFloat();
	    System.out.println("Enter the Price : ");
	    Price=sc.nextFloat();
	    System.out.println("Enter the MileAge : ");
	    MileAge=sc.nextInt();
		CarModel cm=new CarModel(Color, Model, Brand, FuelType,VechNo,Weight, Price, MileAge);
		cm.isBrakeApplied(true);
		System.out.println("Enter the Value to Check Full :"+"\n"+"\n1.full"+"\n2.empty"+"\n3.not required ");
		Scanner input=new Scanner(System.in);
		String Str=input.next();
		System.out.println(cm.isCheckFuel(Str));
		cm.isAudioOn(false);
		
	

	}

}
