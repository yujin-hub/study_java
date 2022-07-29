package com.oliveyoung.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <타입 변환>
		// 작은 형이 큰 형으로 변환은 문제가 발생안함
		// 큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실 발생
		// byte  < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue: " +  byteValue);
	
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue: " +  intValue2);
	
//		byte byteValue2 = intValue2;
//		System.out.println("byteValue: " + byteValue2);
	}

}
