package com.oliveyoung.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 타입 변환 (promotion) <타입 변환>
		// 작은 형이 큰 형으로 변환은 문제가 발생안함
		// 큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실 발생
		// byte  < short < int < long < float < double
		
		// byte byteValue = 10;
		// System.out.println("byteValue: " +  byteValue);
	
		// short shortValue = byteValue;
		// System.out.println("shortValue: " + shortValue);
		
		
		// int에 short 대입 후 출력
		short shortValue = 3;
		System.out.println("shortValue= " + shortValue);
		
		int intValue = shortValue;
		System.out.println("intValue= " + intValue);
		 
		 
		// long에 int 대입 후 출력
		int intValue2 = 3;
		System.out.println("intValue= " + intValue2);
		
		long longValue2 = intValue2;
		System.out.println("longValue2= " + longValue2);
		
		// float에 long 대입 후 출력
		long longValue3 = 3;
		System.out.println("longValue= " + longValue3);
		
		float floatValue = longValue3;
		System.out.println("floatValue= " + floatValue);
		
		// double에 float 대입 후 출력
		float floatValue2 = 3;
		System.out.println("floatValue= " + floatValue2);
		
		double doubleValue2 = floatValue2;
		System.out.println("doubleValue= " + doubleValue2);
	}

}
