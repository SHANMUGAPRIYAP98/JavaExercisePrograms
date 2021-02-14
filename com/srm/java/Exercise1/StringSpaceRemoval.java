package com.srm.java.Exercise1;

import java.util.Scanner;

public class StringSpaceRemoval {
public static void main(String args[])
{
	System.out.println("Enter the String : ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str.trim();
	String str1=null;
	if(str.isEmpty())
	{
		System.out.println("Enter the Value Again : ");
		str=sc.nextLine();
	}
	System.out.println("Actual String : "+str);
    str1=str.replaceAll("\\s","");
    System.out.println("String without Spacing : "+str1);

}
}
