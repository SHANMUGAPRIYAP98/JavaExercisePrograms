package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerFilteringData {
	
    static void filterData(ArrayList al,String Fname,int Age,List<CustomerData> obj)
    {
        for(CustomerData cd:obj)
        {
        	if(cd.getFirstName().equals(Fname)&&cd.getAge()==Age)
        	{
        		System.out.println("Available Records : "+"\n");
        		System.out.println("FirstName"+" "+"LastName"+" "+"Email"+" "+"Age");
        		System.out.println(cd);
        	}
        }
    }
    
	public static void main(String[] args) {
    String Fname,Lname,Email;
    int Age;
    System.out.println("Enter the No.of.times to Fill the Customer Data : ");
    Scanner sc=new Scanner(System.in);
    int Num=sc.nextInt();
    ArrayList ls=new ArrayList();
    var obj=List.of();
    CustomerData[] cd=new CustomerData[Num];
    for(int i=0;i<Num;i++)
    {
    	System.out.println("Enter the FirstName : ");
    	Fname=sc.next();
    	System.out.println("Enter the LastName : ");
    	Lname=sc.next();
    	System.out.println("Enter the Email : ");
    	Email=sc.next();
    	System.out.println("Enter the Age : ");
    	Age=sc.nextInt();
    	cd[i]=new CustomerData(Fname, Lname, Email, Age);
    	ls.add(cd[i]);
    	
    }
    List<CustomerData> ls1=new ArrayList<CustomerData>();
    ls1.addAll(ls);
    System.out.println("Enter the FirstName : ");
    Fname=sc.next();
    System.out.println("Enter the Age : ");
    Age=sc.nextInt();
    filterData(ls,Fname,Age,ls1);
	}

	
}
