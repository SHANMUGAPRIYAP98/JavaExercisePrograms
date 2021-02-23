package com.srm.collections.prog;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	static void reverse(int[] arrelem,int n)
	{
		System.out.print("Sorted Order : "+"\n");
		Arrays.sort(arrelem);
		for(int i=0;i<n;i++)
		{
			System.out.print(arrelem[i]+"\t");
		}
		System.out.println();
		System.out.println("Reversed Order : ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arrelem[i]+"\t");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Array Elements : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	   reverse(arr,n);
		

	}

}
