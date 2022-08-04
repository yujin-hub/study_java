package com.oliveyoung.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// && = & : and : 논리곱 : 연산이 모두 true여야 true
		// || = | : or : 논리합 : 연산이 하나라도 true면 true
		// ^ : 배타적 논리합 : 연산이 true true -> false, false false -> false, true false -> true, false true -> true 
	
		
		int a = 65;
		
		boolean result = (a >= 65);
		System.out.println("result: " + result);
		
		boolean result2 = (a <= 90);
		System.out.println("result2: " + result2);
		
		
		// &&
		if (a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if (a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("-----------------------------");

		
		// ||
		if (a >= 65 | a <= 90) {
			System.out.println("둘 다 참");
		}
		
		if (a >= 66 | a <= 90) {
			System.out.println("한개만 참");
		}
		
		if (a >= 66 || a <= 50) {
			System.out.println("둘 다 false이기 때문에 보이지 않음");
		}
		
		System.out.println("-----------------------------");

		
		// ^
		if (a >= 65 ^ a <= 50) {
			System.out.println("이렇게 해야 보여짐");
		}
		
		if (a >= 70 ^ a <= 67) {
			System.out.println("이렇게 해야 보여짐");
		}
		
		if (a >= 60 ^ a <= 90) {
			System.out.println("둘 다 true라 안보임");
		}
		
		if (a >= 70 ^ a <= 20) {
			System.out.println("둘 다 false라 안보임");
		}
	}

}
