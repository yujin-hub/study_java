package com.oliveyoung.study.ch07.fourth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane supersonicairplane = new SupersonicAirplane();
		
		supersonicairplane.takeoff();
		supersonicairplane.fly();
		supersonicairplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicairplane.fly();
		supersonicairplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicairplane.fly();
		supersonicairplane.land();
		
		
		
		
		//상수 파일 생성 후 코드
//		supersonicairplane.flyMode = Constants.SUPERSONIC;
//		supersonicairplane.flyMode = Constants.NORMAL;
	}
}