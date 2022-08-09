package com.oliveyoung.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		int price = 10000;
		
		switch(num) {
		case 1:
			System.out.println("일반 등급 할인율은 5%, 정가: " + price + " 할인가 : " + (int)(price * 0.95));
			break;
		case 2:
			System.out.println("브론즈 등급 할인율은 10%, 정가: " + price + " 할인가 : " + (int)(price * 0.9));
			break;
		case 3:
			System.out.println("실버 등급 할인율은 15%, 정가: " + price + " 할인가 : " + (int)(price * 0.85));
			break;
		case 4:
			System.out.println("골드 등급 할인율은 20%, 정가: " + price + " 할인가 : " + (int)(price * 0.8));
			break;
		case 5:
			System.out.println("플래티넘 등급 할인율은 2.7%, 정가: " + price + " 할인가 : " + (int)(price * 0.973));
			break;
		default:
			System.out.println("할인 적용 대상이 아닙니다.");
			break;
	}
	}

}
