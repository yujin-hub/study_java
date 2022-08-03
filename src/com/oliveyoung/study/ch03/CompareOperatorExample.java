package com.oliveyoung.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {

		// 비교 연산자
		int num = 5;
		int num2 = 20;
		
		boolean result = (num == num2);
		
		System.out.println(result);
		
		
		// !
		boolean result2 = (num != num2);
		System.out.println(result2);
		
		
		// <
		boolean result3 = (num < num2);
		System.out.println(result3);
		
		
		// >
		boolean result4 = (num > num2);
		System.out.println(result4);
		
		
		// >=
		boolean result5 = (num >= num2);
		System.out.println(result5);
		
		
		// <=
		boolean result6 = (num <= num2);
		System.out.println(result6);
		
	}

}
