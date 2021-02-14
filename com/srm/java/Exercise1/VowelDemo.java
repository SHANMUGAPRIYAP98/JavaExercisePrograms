package com.srm.java.Exercise1;

import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		try (Scanner sc = new Scanner(System.in)) {
			String str;
			str=sc.nextLine();
			if(str.isEmpty())
			{
				  System.out.println("Enter the String again : ");
				  str=sc.nextLine();
			}
			str.toLowerCase();
			char ch;
			int count=0;
			System.out.println("Vowels Found are : ");
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
				{
					System.out.print(ch+"\t");
					count++;
				}
			}
			System.out.println();
			if(count>=1)
			{
				System.out.println("Vowels Found.....");
			}
			else
			{
				System.out.println("Contains Only Consonants.....");
			}
		}
	}

}
