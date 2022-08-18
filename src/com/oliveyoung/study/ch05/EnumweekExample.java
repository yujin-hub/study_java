package com.oliveyoung.study.ch05;

public class EnumweekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week abc;
		Week xyz;
		
	//	abc = 1;
	//	abc = "안녕";
	//	abc = 1.1;
		abc = Week.MONDAY;
		
		
		System.out.println(abc);
		System.out.println(Week.FRIDAY);
		
		System.out.println("------------------");
		
	
//		String name = abc; // 오류!
		String name = abc.name();  // name 함수를 사용해야 오류 x
		System.out.println("name : " + name);
	
		System.out.println("------------------");
		
		
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		System.out.println("------------------");
		
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		System.out.println("------------------");
		
		
	
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + " : day: " + day);
			index ++;
		}
	}

}
