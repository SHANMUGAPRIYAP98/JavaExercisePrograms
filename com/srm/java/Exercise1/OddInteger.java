package com.srm.java.Exercise1;

import java.util.Scanner;

public class OddInteger {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Elements :  ");
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int count=0;
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the Array Elements : ");
				arr[i]=sc.nextInt();
			}
			System.out.println("Integers are : ");
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2!=0)
				{
					count++;
					System.out.print(arr[i]+"\t");
				}
				else
				{
					System.out.print(arr[i]+"\t");
				}
				
			}
			System.out.println();
			if(count>=1)
			{
				System.out.println("Contains Odd Integers");
			}
			else
			{
				System.out.println("Contains only Even Integers");
			}
		}
	}
}

