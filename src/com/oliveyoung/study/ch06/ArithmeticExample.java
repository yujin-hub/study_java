package com.oliveyoung.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic arithmetic = new Arithmetic();
		
		int resultSum = arithmetic.sum(4,8);
		int resultMinus = arithmetic.minus(86, 45);
		int resultTimes = arithmetic.times(4, 51);
		int resultDiv = arithmetic.div(90, 5);
		int resultRemind = arithmetic.remind(42, 5);
	
	
		arithmetic.say(resultSum);
		arithmetic.say(resultMinus);
		arithmetic.say(resultTimes);
		arithmetic.say(resultDiv);
		arithmetic.say(resultRemind);
		
		
		
		
		// int aaa;   -> 선언
		// aaa = add(4, 7);   -> 사용
	}
}
