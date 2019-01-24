package com.capgemini.i;

import com.capgemini.g.Course;
import com.capgemini.g.Student;

public class StudentSc {
	private Student[] students=new Student[5];
	private Course[] courses=new Course[10];
	private int count;
	private int count1;
	public String addStudent(int rollNumber, String name,int courseId[], String [] courseName)
	{
	   students[count++]=new Student(rollNumber,name);
	   courses[count1++]=new Course(courseId,courseName);
	   return "gadded";
	}


public String showAllStudents()
{
	for(int i=0;i<count;i++)
	{
		System.out.println("rollnumber"+" - "+students[i].getRollNumber());
		System.out.println("name"+" - "+students[i].getName());
		Course obj = courses[i];
		int courseId[] = obj.getCourseId();
		String courseName[] = obj.getCourseName();
		for(int j=0;j<courseId.length;j++) {
			System.out.println(courseId[j]+" "+courseName[j]);
		}
		//System.out.println(courses[i].getCourseId() +" "+courses[i].getCourseName());
		//System.out.println(courses[i].getCourseName());	
	}
	return "sadded";
}

public boolean checkRollNumber(int rollNumber)
{
	int flag=1;
	for(int i=0;i<count;i++)
	{
		if(students[i].getRollNumber()==rollNumber)
		{
			flag=0;
			return false;
		}
			
		else
			flag=1;
			}
	if(flag==1)
		return true;

	return true;
	}

public String showStudentByRollNumber(int rollNumber)
{
	int i = 0;
	
	{
		for( i=0;i<count;i++)
		{
			if(students[i].getRollNumber()==rollNumber)
			{
			System.out.println("rollnumber"+" - "+students[i].getRollNumber());
			System.out.println("name"+" - "+students[i].getName());
			Course obj = courses[i];
			int courseId[] = obj.getCourseId();
			String courseName[] = obj.getCourseName();
			for(int j=0;j<courseId.length;j++)
			{
				System.out.println(courseId[j]+" "+courseName[j]);
			}
		}
		}
	}
	return "added";
}
}