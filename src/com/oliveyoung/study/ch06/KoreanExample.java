package com.oliveyoung.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("장원영", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println("k1.nationality: " + k1.nationality);
		
		
		System.out.println("-------------------------------");
		System.out.println("Korean.nationality: " + Korean.nationality);  // static 사용시 객체 사용 없이도 사용 가능!!!!!
		
		
		
		System.out.println("-------------------------------");
		int result = Korean.staticTest(10);
		System.out.println("result: " + result);
		
//		int result2 = Korean.staticTest2(20);
//		System.out.println("result2: " + result2);
		
		
		System.out.println("-------------------------------");
		Korean k2 = new Korean("장원영", 45);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.age : " + k2.age);
	}

}


