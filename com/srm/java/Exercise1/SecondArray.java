package com.srm.java.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondArray {	
	public static void main(String[] args) {
		System.out.println("Enter the no.of.array Elements : ");
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.print("Array Elements are...."+"\n");
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]+"\t");
			}
			System.out.println();
			System.out.println("Second Largest Value : "+arr[arr.length-2]);
		}
	}

}
