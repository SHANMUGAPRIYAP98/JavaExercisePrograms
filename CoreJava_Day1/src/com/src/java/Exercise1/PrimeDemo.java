package com.src.java.Exercise1;

import java.util.Scanner;

class Prime
{
	public Boolean findPrime(int n)
	{
		Boolean flag=Boolean.FALSE;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				flag=true;
				break;
			}
		}
		if(!flag && n!=1)
		{
			System.out.println(n+" is a prime number");
		}
		
		return true;
	}
}

public class PrimeDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			Prime p = new Prime();
			p.findPrime(num);
		}
	}

}

