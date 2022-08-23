package com.oliveyoung.study.ch06;

public class CarThirdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarThird carthird = new CarThird();
		CarThird carthird2 = new CarThird("그랜져");
		CarThird carthird3 = new CarThird("그랜져", 4000);
		CarThird carthird4 = new CarThird("그랜져", 4000, "white");
		
		
		
		System.out.println("carThird.name: " + carthird.name);
		
		System.out.println("--------------------------");
		
		System.out.println("carThird2.name: " + carthird2.name);
		System.out.println("carThird3.cc: " + carthird3.cc);
		System.out.println("carThird4.color: " + carthird4.color);
		
		
	}

}
