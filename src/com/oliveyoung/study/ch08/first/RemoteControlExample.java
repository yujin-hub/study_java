package com.oliveyoung.study.ch08.first;

public class RemoteControlExample {

	public static void main(String[] args) {
		
//		RemoteControl television = new Television();
		
		// 인터페이스 변수 = 구현객체;(얘가 훨씬 우세)   or  인터페이스 변수;  변수 = 구현객체;
		
		// RemoteControl remoteControl = new Television();
		// Television television2 = new Television();    // 이거 쓰면 안됨!  인터페이스 ㅁ = new 클래스(); 형태여야함
	
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		
//		Audio audio = new Audio();
//		Television television = new Television();
//		
////		audio.turnOn();
////		audio.turnOff();
//		television.turnOn();
//		television.setMute(true);
//		television.setMute(false);
//		television.setVolume(-10);
//		RemoteControl.changeBattery();
//		television.turnOff();
//		
//		System.out.println();
////		인터페이스를 구현한 클래스는 위에 처럼 일반클래스 객체 만들듯이 하면 않된다.
//		
////		인터페이스를 구현한 클래스를 사용해야 된다. 할때는
////		RemoteControl remoteControl;	// 인터페이스 변수 선언
////		remoteControl = new Audio();	// 구현객체로  초기화
//		
//		RemoteControl remoteControl = new Audio();
////		RemoteControl remoteControl = new Television();
//		
//		remoteControl.turnOn();
//		remoteControl.turnOff();
//		remoteControl.setMute(false);
	}

}
