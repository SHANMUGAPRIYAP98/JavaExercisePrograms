package com.srm.java.Exercise1;

import java.util.Scanner;

class Fact {
	public int factorial(int n) {
		int fact;
		int count;
		for (fact = 1, count = 1; count <= n; count++) {
			fact = fact * count;
		}
		return fact;
	}
}
public class FactorialDemo {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Fact f = new Fact();
			int result = f.factorial(n);
			System.out.println("Factorial of " + n + " : " + result);
		}

	}

}
