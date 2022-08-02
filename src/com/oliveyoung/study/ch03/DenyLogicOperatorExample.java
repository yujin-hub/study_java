package com.oliveyoung.study.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		boolean play = true;
		System.out.println("play :" + play);

		// 논리부정연산자 !
		
		play = !play;
		System.out.println("play :" + play);
		
		play = !play;
		System.out.println("play :" + play);

		
		int j = 4;
		
		if (!(j==2)) {
			System.out.println("2가 아님");
		} else
			System.out.println("2");
		}
	

}
