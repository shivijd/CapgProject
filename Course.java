package com.capgemini.g;

public class Course {
	private int[] courseId;
	private String[] courseName;
	public Course(int[] courseId, String[] courseName) {
		// TODO Auto-generated constructor stub
		this.courseId=courseId;
		this.courseName=courseName;
	}
	
	public int []getCourseId() {
		return courseId;
	}
	public void setCourseId(int []courseId) {
		this.courseId = courseId;
	}
	public String[] getCourseName() {
		return courseName;
	}
	public void setCourseName(String []courseName) {
		this.courseName = courseName;
	}

}
