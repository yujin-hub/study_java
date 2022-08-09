package com.oliveyoung.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 5;
		int price = 10000;
		
		
		if(grade == 1) {
			int sale = (int) (price * 0.95);
			System.out.println("일반 등급 할인율은 5%, 정가: " + price + " 할인가 : " + sale);
		}
		else if(grade == 2) {
			int sale2 = (int) (price * 0.9);
			System.out.println("브론즈 등급 할인율은 10%, 정가: " + price + " 할인가 : " + sale2);
		}
		else if(grade == 3) {
			int sale3 = (int) (price * 0.85);
			System.out.println("실버 등급 할인율은 15%, 정가: " + price + " 할인가 : " + sale3);
		}
		else if(grade == 4) {
			int sale4 = (int) (price * 0.8);
			System.out.println("골드 등급 할인율은 20%, 정가: " + price + " 할인가 : " + sale4);
		}
		else{
			int sale5 = (int) (price * 0.973);
			System.out.println("플래티넘 등급 할인율은 2.7%, 정가: " + price + " 할인가 : " + sale5);
		}
	}

}
