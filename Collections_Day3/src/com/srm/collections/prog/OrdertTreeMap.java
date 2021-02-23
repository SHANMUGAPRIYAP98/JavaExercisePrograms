package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OrdertTreeMap 
{
	
	static void orderByTreeMap(Map m)
	{
		TreeMap tm=new TreeMap();
		tm.putAll(m);
		System.out.println(m);
	}
	public static void main(String[] args) {
		String Fname="",Lname="",Email="";
		int Age=0,n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the No.of.Times to Loop : ");
	    n=sc.nextInt();
	    Map m=new TreeMap();
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter the FirstName : ");
			Fname=sc.next();
			System.out.println("Enter the LastName : ");
			Lname=sc.next();
			System.out.println("Enter the Email-Id : ");
			Email=sc.next();
			System.out.println("Enter the Age : ");
			Age=sc.nextInt();
	    	m.put(i,new CustomerModel(Fname, Lname, Email, Age));	
	    }
	    orderByTreeMap(m);

		
		
		
		
		
		
		
		
		
		
	}

}
