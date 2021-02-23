package com.srm.Exercise2;

import java.util.Calendar;

public class ShippingBaseModel {
private String ProdId,OrderId;
String CustName,ProdName,FromCoun,ToCoun,VType,Email,OrdDate,ExpDate,PkgType,Payment;
Long PhoneNo;
Double Quan,Wgt; 
public ShippingBaseModel(String pid,String oid,String uname,String pname,String Email,String odate,String edate,
		Long phn,Double wgt,Double qty) {
	this.ProdId=pid;
	this.OrderId=oid;
    this.CustName=uname;
    this.ProdName=pname;
    this.Email=Email;
    this.OrdDate=odate;
    this.ExpDate=edate;
    
    this.PhoneNo=phn;
    this.Wgt=wgt;
    this.Quan=qty;
}
void timeCalc() {
	Calendar cal=Calendar.getInstance();
	for(int i=0;i<24;i++)
	{
		cal.getTime();
	}
}
public void vechType(int op) {
	
	switch(op)
	{
	   case 1:VType="Bike";
	          break;
	   case 2:VType="Car";
              break;
	   case 3:VType="Mini-Van";
              break;
	   case 4:VType="Cargo-Van";
       		  break;
	   case 5:VType="Ft24 Strt Truck";
       		  break;
       default:System.out.println("Invalid Operation");
	}
}
public void fromCountry(int op) {
  switch(op)
  {
    case 1:FromCoun="USA";
           break;
    case 2:FromCoun="CHINA";
    	   break;
    case 3:FromCoun="GERMANY";
	       break;
    case 4:FromCoun="JAPAN";
	   	   break;
    case 5:FromCoun="INDIA";
	   break;
	default:System.out.println("Invalid Operation");
  }
}
public void toCountry(int op) {
	  switch(op)
	  {
	    case 1:ToCoun="USA";
	           break;
	    case 2:ToCoun="CHINA";
	    	   break;
	    case 3:ToCoun="GERMANY";
		       break;
	    case 4:ToCoun="JAPAN";
		   	   break;
	    case 5:ToCoun="INDIA";
		   break;
		default:System.out.println("Invalid Operation");
	  }
	}
public void packType(int op)
{
	switch(op)
	{
		case 1:PkgType="Envelope";
		       break;
		case 2:PkgType="Garment Bags";
	       break;
		case 3:PkgType="Standard Document Box";
	       break;
		case 4:PkgType="Pallets";
	       break;
		case 5:PkgType="Specimen";
	       break;
		default:System.out.println("Invalid Operation");
	}
}
public void payMode(int op)
{
	switch(op)
	{
	case 1:Payment="Visa";
			break;
	case 2:Payment="MasterCard";
			break;
	case 3:Payment="American Express";
			break;
	case 4:Payment="Discover";
			break;
	default:System.out.println("Invalid Operation");
	}
}
}