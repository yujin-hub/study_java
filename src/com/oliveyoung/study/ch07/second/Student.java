package com.oliveyoung.study.ch07.second;

public class Student extends People{

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		// super : 부모 객체     this : 내 객체
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
		super();	
	}
	
}
