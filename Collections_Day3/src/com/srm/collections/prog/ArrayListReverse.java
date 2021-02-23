package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ReverseList
{
	public void rev(List ls)
	{
		System.out.println("Reversed Order : ");
	    Collections.reverse(ls);
	    Iterator iter=ls.iterator();
	    while(iter.hasNext())
	    {
	    	System.out.print(iter.next()+"\t");
	    }
	}
}



public class ArrayListReverse {

	public static void main(String[] args) {
	System.out.println("Enter the No.of.Elements : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	List list=new ArrayList();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the Array Elements :  ");
		list.add(sc.nextInt());
	}
	System.out.println("Array Elements : ");
	for(int i=0;i<list.size();i++)
	{
		System.out.print(list.get(i)+"\t");
	}
	System.out.println();
	ReverseList rl=new ReverseList();
	rl.rev(list);
	}

}
