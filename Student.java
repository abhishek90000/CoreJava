package com.basicprgms;

class Student
{
	private int rollno;
	private String name;
	private double percent;
	private static int cntr;
	public Student(int r,String n,double p)
	{
		name=n;
		rollno=r;
		percent=p;
		cntr++;
		display();
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Percentage :"+percent);
	}
	public static int getCntr()
	{
		return cntr;
	}
}
class student_record
{
	public static void main(String[] args)
	{
		Student s1 = new Student(17,"abhishek",55.346);
		Student s2 = new Student(55,"abhay",69.49);
		Student s3 = new Student(22,"aakash",88.4);
		
		System.out.println("Number of students are :"+Student.getCntr());
	}
}