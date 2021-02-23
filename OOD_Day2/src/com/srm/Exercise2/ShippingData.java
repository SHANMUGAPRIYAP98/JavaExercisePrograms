package com.srm.Exercise2;

public class ShippingData extends ShippingBaseModel implements ShippingCalc  {

	Double price,rate,travCharge;
	int miles;
	public ShippingData(String pid, String oid, String uname, String pname, String Email, String odate, String edate,
			Long phn, Double wgt, Double qty,int miles) {
		super(pid, oid, uname, pname, Email, odate, edate,phn, wgt, qty);
		this.miles=miles;
	}

	@Override
	public void priceCalc() {
	
		if(super.Wgt>=50)
		{
			price=9500.0;
		}
		else if(super.Wgt>=40 && super.Wgt<50)
		{
			price=8500.0;
		}
		else if(super.Wgt>=30 && super.Wgt<40)
		{
			price=7500.0;
		}
		else if(super.Wgt>=20 && super.Wgt<30)
		{
			price=6500.0;
		}
		else if(super.Wgt>=20 && super.Wgt<10)
		{
			price=5500.0;
		}
		else
		{
			price=4000.0;
		}
		if(miles>=10000)
		{
			travCharge=5000.0;
		}
		else if(miles>=5000&&miles<10000)
		{
			travCharge=4000.0;
		}
		else
		{
			travCharge=2500.0;
		}
		rate=price*super.Quan+travCharge;
		System.out.print(rate);
		
	}



}
