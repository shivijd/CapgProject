package com.capgemini.g;
public class Student{
private int rollNumber;
private String name;
public Student(int rollNumber, String name) {
	// TODO Auto-generated constructor stub
	this.rollNumber=rollNumber;
	this.name=name;
}
public int getRollNumber() 
{
	return rollNumber;
}
public void setRollNumber(int rollNumber)
{
	this.rollNumber = rollNumber;
}
public String getName()
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
}




