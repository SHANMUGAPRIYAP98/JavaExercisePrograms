package com.srm.generics.prog;

public class Student {
String StuName,Email;
Long Rollno,PhoneNo;
Student(String StuName,String Email,Long Rollno,Long PhoneNo)
{
	this.StuName=StuName;
	this.Email=Email;
	this.Rollno=Rollno;
	this.PhoneNo=PhoneNo;
}
public String getStuName() {
	return StuName;
}
public void setStuName(String stuName) {
	StuName = stuName;
}
public Long getRollno() {
	return Rollno;
}
public void setRollno(Long rollno) {
	Rollno = rollno;
}
}
