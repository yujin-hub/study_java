package com.oliveyoung.study.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {

		// byte 변수 byteValue 선언하고 12로 초기화
		byte byteValue = 12;
		
		// byte 변수 byteValue2 선언하고 12로 초기화
		byte byteValue2 = 12;
		
		// byte 변수 byteValue3 선언하고 위의 두 변수를 합 연산
//		byte byteValue3 = byteValue + byteValue2;
		int intValue = byteValue + byteValue2;
		
		// byteValue3 출력
		System.out.println(intValue);
		
		
		short shortValue = 12;
		short shortValue2 = 12;
		int shortValue3 = shortValue + shortValue2;
		System.out.println(shortValue3);
		
		// int intValue3 = 12;
		// int intValue4 = 12;
		// int intValue5 = intValue3 + intValue4;
		// System.out.println(intValue5);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		
		// int byteValue4 = byteValue + intValue;
		int intValue4 = byteValue + intValue;
		System.out.println(intValue4);
		
		
		double intValue5 = intValue + doubleValue;
		double doubleValue4 = intValue + doubleValue;
		
		System.out.println(doubleValue4);
	}

}
