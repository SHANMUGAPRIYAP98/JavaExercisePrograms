package com.srm.java.Exercise1;

import java.util.Scanner;
public class FiboRecursionDemo {
	public static int fibo(int n)
	{
			if(n==0)
			{
				return 0;
			}
			else if(n==1||n==2)
			{
				return 1;
			}
		
			return fibo(n-2)+fibo(n-1);
	}
	public static void main(String[] args) {
	System.out.println("Enter the No.of.times to Loop : ");
	try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(fibo(i));
		}
		
	}
	}

}
