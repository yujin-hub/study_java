package com.oliveyoung.study.ch07.fourth;

public class SupersonicAirplane extends Airplane {

		public static final int NORMAL = 1;
		public static final int SUPERSONIC = 2;
		
		public int flyMode = NORMAL;
		
		@Override 
		public void fly() {
			if(flyMode == SUPERSONIC) {
				System.out.println("초음속비행합니다.");
			} else {
				super.fly();
			}
		}
		
		
		
		//상수 파일 생성 후 코드
//		public int flyMode = Constants.NORMAL;
}