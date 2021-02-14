package com.srm.java.Exercise1;

import java.util.Scanner;

public class SwappingDemo {
	public static void swap(int Num1, int Num2) {
		System.out.println("Before Swapping : "+Num1+" "+Num2);
		Num1=Num1+Num2;
		Num2=Num1-Num2;
		Num1=Num1-Num2;
		System.out.println("After Swapping : "+Num1+" "+Num2);
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number1 : ");
        try (Scanner sc = new Scanner(System.in)) {
			String S1=sc.next();
			System.out.println("Enter the Number2 : ");
			String S2=sc.next();
			int N1;
			int N2;
			if(S1.matches("^[0-9]*$")&&S2.matches("^[0-9]*$"))
			{
				N1=Integer.parseInt(S1);
				N2=Integer.parseInt(S2);
				swap(N1,N2);
			}
			else
			{
				System.out.println("Enter the Number1 Again : ");
				S1=sc.next();
				System.out.println("Enter the Number2 Again : ");
			    S2=sc.next();
				N1=Integer.parseInt(S1);
				N2=Integer.parseInt(S2);
				swap(N1,N2);
			}
		}
        
        	

        }
        
                
	}


