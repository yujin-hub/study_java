package com.oliveyoung.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		// 명시적 생성자를 사용하여 객체를 생성하고 
		// 모든 필드 출력
		
		Student student = new Student("유진", "12345-67890", 54);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		
		System.out.println("------------------");
		
		Student student2 = new Student("윤아","78942-45721", 9);
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
	}

}
