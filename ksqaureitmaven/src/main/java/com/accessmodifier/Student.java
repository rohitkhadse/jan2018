package com.accessmodifier;

public class Student {
	private String name;
	private String studentID;
	private final int ssn=7898;
	private double gpa;
	static String university="UTD";
	
	public Student(String name, String studentID, double gpa) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.gpa = gpa;
	}

	void display(){
		System.out.println(name+" "+studentID+" "+ssn+" "+gpa+" "+university);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getSsn() {
		return ssn;
	}
	
	
}
