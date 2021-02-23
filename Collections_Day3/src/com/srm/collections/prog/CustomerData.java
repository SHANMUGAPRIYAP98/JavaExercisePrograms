package com.srm.collections.prog;

public class CustomerData {
String FirstName,LastName,Email;
int Age;
CustomerData(String FirstName,String LastName,String Email,int Age)
{
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Email=Email;
	this.Age=Age;
}
public String toString()
{
	return FirstName+" "+LastName+" "+Email+" "+Age;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
}
