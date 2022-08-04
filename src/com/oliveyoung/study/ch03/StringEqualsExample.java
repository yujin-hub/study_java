package com.oliveyoung.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string을 비교할 때 메모리 주소를 비교, 내용(문자열)을 비교하고 싶다면 equals 함수 사용
		
		String str1 = "최유진";
		String str2 = "최유진";
		String str3 = new String("최유진");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1= " + result1);	
		
		boolean result2 = (str1 == str3);
		System.out.println("result2= " + result2);     // false
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));

	}

}
