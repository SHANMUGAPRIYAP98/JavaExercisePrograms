package com.srm.files.prog;

import java.io.File;
import java.util.Scanner;

public class HashCodeFile {

	public static void main(String[] args) {
		System.out.println("Enter the Path of the File : ");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		File file=new File(path);
		if(file.exists())
		{
			System.out.println("The HashCode of the File is :  "+file.hashCode());
		}
		else
		{
			System.out.println("Such File doesn't Exists");

		}

	}

}
