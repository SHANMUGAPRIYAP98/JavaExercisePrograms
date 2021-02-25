package com.srm.generics.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class CustomerData
{
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
public int getAge() {
return Age;
}
public void setAge(int age) {
Age = age;
}
public void setName(String FirstName)
{
this.FirstName=FirstName;
}
public String getName()
{
return FirstName;
}

}
public class CustomerDataModel {
static void sortData(ArrayList al)
{
Collections.sort(al,new sortByFirstName());
System.out.println("Customer Data : "+"\n");
Iterator iter=al.iterator();
while(iter.hasNext())
{
	System.out.println(iter.next()+"\n");
}
}
public static void main(String[] args) {
String FirstName,LastName,Email;
int Age;
ArrayList<CustomerData> ls=new ArrayList<CustomerData>();
System.out.println("Enter the No.of.Customer Object : ");
Scanner sc=new Scanner(System.in);
int Num=sc.nextInt();
for(int i=0;i<Num;i++)
{

System.out.println("Enter the FirstName : ");
FirstName=sc.next();
System.out.println("Enter the LastName : ");
LastName=sc.next();
System.out.println("Enter the Email : ");
Email=sc.next();
System.out.println("Enter the Age : ");
Age=sc.nextInt();
ls.add(new CustomerData(FirstName, LastName, Email, Age));
}
sortData(ls);
}
}