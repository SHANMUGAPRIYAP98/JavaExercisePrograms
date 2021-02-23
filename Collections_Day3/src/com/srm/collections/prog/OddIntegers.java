package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ListIntegers
{
	public void checkOddIntegers(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++)
		{
			list.get(i);  
		}
		System.out.println("Odd Elements : ");
		int count=0;
		for(Integer i:list)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t");
				count++;
			}
		}
		System.out.println();
		if(count>=1)
		{
			System.out.println("List Contains  "+count+" Odd Elements");
		}
		
	}
}
public class OddIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList<Integer>();
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Elements : ");
			ls.add(sc.nextInt());
		}
		ListIntegers li=new ListIntegers();
		li.checkOddIntegers(ls);

	}

}
