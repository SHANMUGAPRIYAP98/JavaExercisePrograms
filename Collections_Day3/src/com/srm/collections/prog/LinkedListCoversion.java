package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class LinkedListDemo
{
	public void  convertList(LinkedList ls)
	{
		
		ArrayList ls1=new ArrayList();
		ls1.add(ls);
		
		System.out.println("Country Values : ");
		for(int i=0;i<ls1.size();i++)
		{
			System.out.println(ls1.get(i));
		}
     
	}
}
public class LinkedListCoversion {

	public static void main(String[] args) {
	System.out.println("Enter the No.of.Elements : ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	LinkedList ls=new LinkedList();
	for(int i=1;i<=num;i++)
	{
		
		System.out.println("Country Name "+i);
		ls.add(sc.next());
	}
	LinkedListDemo lsd=new LinkedListDemo();
	lsd.convertList(ls);
	}

}
