package com.src.java.Exercise1;

import java.util.Scanner;

public class ReverseDemo {
	public static void reverse(String str)
	{
		//logical construction of reverse string
		/*	String str1="";
		char ch;
	    for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			str1=str1+ch;
		}*/
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Original String : "+str);
		System.out.println("Reversed String : "+sb.reverse());
	}
	public static void main(String[] args) {
		System.out.println("Enter the Value : ");
		try (Scanner sc = new Scanner(System.in)) {
			String str=sc.nextLine();
			if(str.isEmpty())
			{
				System.out.println("Enter the Value Again : ");
				str=sc.nextLine();
			}
			reverse(str);
		}
		
		
		
		
	}

}

