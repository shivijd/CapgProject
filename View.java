package com.capgemini.j;

import java.util.Scanner;

import com.capgemini.i.StudentSc;

public class View {
	private static Scanner sc=new Scanner(System.in);
    private	static  StudentSc stuent=new StudentSc();
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();		  
	}
	public static void showMenu()
	{
		int ch;
		while(true)
		{
			System.out.println("1.add student");
			System.out.println("2.show students");
			System.out.println("3.show student by rollnumber");
			System.out.println("4.exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:addStudent();
			break;
			case 2:showAllStudents();
			break;
			case 3:showStudentByRollNumber();
			break;
			default:System.out.println("wrong choice");
			System.exit(0);
			
		}
	}
	}
	private static void showStudentByRollNumber() {
		// TODO Auto-generated method stub
		int rollNumber = sc.nextInt();
		stuent.showStudentByRollNumber(rollNumber);
		
		
	}
	private static void addStudent() {
		// TODO Auto-generated method stub
		String temp;
		boolean p;
		System.out.println("enter rollno.");
		int rollNumber=sc.nextInt();
		p=stuent.checkRollNumber(rollNumber);
		while(!p)
		{
			System.out.println("Already exist");
			rollNumber=sc.nextInt();
			p=stuent.checkRollNumber(rollNumber);
		}
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter number of course");
		int n=sc.nextInt();
		String c[]=new String[n];
		int id[]=new int[n];
		int temp1; 
		
		for(int i=0;i<n;i++)
		{
			temp1=sc.nextInt();
			temp=sc.next();
			id[i]=temp1;
			c[i]=temp;
			
		}
		System.out.println(stuent.addStudent(rollNumber,name,id,c));
	}
	private static void showAllStudents() {
		// TODO Auto-generated method stub
		stuent.showAllStudents();		
	}

}
