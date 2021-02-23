package com.srm.Exercise2;

import java.util.Scanner;

public class ShippingModule {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Id : ");
		String pid=sc.next();
		System.out.println("Enter the Product Name : ");
		String pname=sc.next();
		System.out.println("Enter the Customer Name : ");
		String cname=sc.next();
		System.out.println("Enter the Email-Id : ");
		String mail=sc.next();
		System.out.println("Enter the Phone Number : ");
		Long phn=sc.nextLong();
		System.out.println("Enter the Order Id : ");
		String oid=sc.next();
		System.out.println("Enter the Ordered Date : ");
		String odate=sc.next();
		System.out.println("Enter the Expected Date : ");
		String edate=sc.next();
		System.out.println("Enter the Weight in Kgs : ");
		Double wgt=sc.nextDouble();
		System.out.println("Enter the Quantity : ");
		Double qty=sc.nextDouble();
		System.out.println("Enter the Miles : ");
		int mile=sc.nextInt();
		ShippingBaseModel sbm=new ShippingData(pid,oid,pname,cname,odate,edate,mail,phn,wgt,qty,mile);
		System.out.println("Enter the Vechile Mode "+"\n1.Bike"+"\n2.Car"+"\n3.Mini-Van"+"\n4.Cargo-Van"+"\n5.Ft24 Strt Truck");
		int op1=sc.nextInt();
		sbm.vechType(op1);
		System.out.println("Enter the From Country "+"\n1.USA"+"\n2.CHINA"+"\n3.GERMANY"+"\n4.JAPAN"+"\n5.INDIA");
		int op2=sc.nextInt();
		sbm.fromCountry(op2);
		System.out.println("Enter the To Country "+"\n1.USA"+"\n2.CHINA"+"\n3.GERMANY"+"\n4.JAPAN"+"\n5.INDIA");
		int op3=sc.nextInt();
		sbm.toCountry(op3);
		System.out.println("Enter the Package Type  "+"\n1.Envelope"+"\n2.Garment Bags"+"\n3.Standard Document Box"+"\n4.Pallets"+"\n5.Specimen");
		int op4=sc.nextInt();
		sbm.packType(op4);
		System.out.println("Enter the Payment Mode"+"\n1.Visa"+"\n2.MasterCard"+"\n3.American Express"+"\n4.Discover");
		int op5=sc.nextInt();
		sbm.payMode(op5);
		ShippingData sd=(ShippingData)sbm;
		sd.priceCalc();
		
	} 

}
