package week3.day2.student;

import week3.day2.department.Department;

public class Student extends Department{
	
	public void student()
	{
		System.out.println("Student name:Parkavi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.deptName();
		st.student();

	}

}
