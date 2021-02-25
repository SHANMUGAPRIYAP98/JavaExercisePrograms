package com.srm.generics.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Course extends Student
{
	String CouName,Dept;
	String StuName,Email;
	long Rollno,PhoneNo;
	Course(String StuName,String Email,long Rollno,long PhoneNo,String CouName,String Dept)
	{
		super(StuName,Email,Rollno,PhoneNo);
		this.CouName=CouName;
		this.Dept=Dept;
	}
	public String getStuName() {
		return super.StuName;
	}
	public void setStuName(String stuName) {
		super.StuName = stuName;
	}
	public Long getRollno() {
		return super.Rollno;
	}
	public void setRollno(Long rollno) {
		super.Rollno = rollno;
	}
	public String toString()
	{
		return super.Rollno+" "+super.StuName+" "+super.Email+" "+super.PhoneNo+" "+CouName+" "+Dept;
	}
}
public class CourseData {
    static void sortByField(ArrayList al)
    {
        Collections.sort(al,new sortByRollNo());
    	Iterator iter=al.iterator();
    	System.out.println("Student Data : ");
    	while(iter.hasNext())
    	{
    		System.out.println(iter.next()+"\n");
    	}
    }
	public static void main(String[] args) {
		String CouName,Dept;
		String StuName,Email;
		Long Rollno,PhoneNo;
		System.out.println("Enter the No.of.Student Object : ");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		ArrayList<Course> lcour=new ArrayList<Course>();
		for(int i=0;i<Num;i++)
		{
			System.out.println("Enter the Student Name : ");
			StuName=sc.next();
			System.out.println("Enter the Email : ");
			Email=sc.next();
			System.out.println("Enter the Rollno : ");
			Rollno=sc.nextLong();
			System.out.println("Enter the Phone No : ");
			PhoneNo=sc.nextLong();
			System.out.println("Enter the Course Name : ");
			CouName=sc.next();
			System.out.println("Enter the Department : ");
			Dept=sc.next();
			lcour.add(new Course(StuName, Email, Rollno, PhoneNo, CouName, Dept));
		}
		sortByField(lcour);
		
	}

}
