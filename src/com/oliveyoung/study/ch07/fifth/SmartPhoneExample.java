package com.oliveyoung.study.ch07.fifth;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
//		Phone phone = new Phone();     abstract의 경우 new 연산자로 객체 생성 불가! 오로지 상속
		
		SmartPhone smartPhone = new SmartPhone("YJ");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
		
	}

}
