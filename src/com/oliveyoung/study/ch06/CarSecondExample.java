package com.oliveyoung.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarSecond carSecond = new CarSecond();
		String color;
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("green", 4000);
		String color2 = "Red";
		
		
		System.out.println("carSecond.color: " + carSecond.color);
		System.out.println("carSecond2.color: " + carSecond2.color);
		System.out.println("carSecond2.cc: " + carSecond2.cc);
		
		System.out.println("-----------------------");
		
		System.out.println("carSecond3.color: " + carSecond3.color);
		System.out.println("carSecond3.cc: " + carSecond3.cc);
		
	}

}
