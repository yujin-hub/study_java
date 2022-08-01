package com.oliveyoung.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 강제 형번환  casting : (원하는 형) 변수명
	
		double doubleValue = 1234567;
		System.out.println("doubleValue= " + doubleValue);
		
		double doubleValue2 = 1234567891;     // 7자리 이상인 경우 e로 표현
		System.out.println("doubleValue2= " + doubleValue2);
		
		// float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		
		
		// long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		// int <- long
		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		// short <- int
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue);
		
		// byte <- short
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		
		
		
		// String을 int로
			String str = "1234563";
			int intValue2 = Integer.parseInt(str);
			
			System.out.println(intValue2);
			
		// int를 String으로
			String str1 = String.valueOf(intValue);

			System.out.println(str1);
	}

}
