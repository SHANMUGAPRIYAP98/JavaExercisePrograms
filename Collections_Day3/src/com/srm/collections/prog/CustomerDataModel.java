package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CustomerModel  {
String FirstName,LastName,Email;
int Age;
CustomerModel(String FirstName,String LastName,String Email,int Age)
{
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Email=Email;
	this.Age=Age;
}
public String toString()
{
	return FirstName+"\t"+LastName+"\t"+Email+"\t"+Age+"\t"+"\n";
}
}
public class CustomerDataModel
{
    static void sortData(List ls)
    {
    	Collections.sort(ls,new SortByFirstName().thenComparing(new SortByAge()).reversed());
		Iterator iter=ls.iterator();
		System.out.println("FirstName"+" "+"LastName"+" "+"Email-Id"+" "+"Age");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
    }
	public static void main(String args[])
	{
        String Fname="",Lname="",Email="";
		int Age=0,n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the No.of.Times to Loop : ");
	    n=sc.nextInt();
	    List ls=new ArrayList<CustomerModel>();
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
	    	ls.add(new CustomerModel(Fname, Lname, Email, Age));	
	    }
	    
	    sortData(ls);
	    
	    
	}
}