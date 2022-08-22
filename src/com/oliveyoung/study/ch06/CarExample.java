package com.oliveyoung.study.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Car hi = new Car();
			
			System.out.println("hi.name: " + hi.name);
			System.out.println("hi.name2[1]: " + hi.name2[1]);
		
		
			Car car = new Car();
			
			System.out.println("car.name: " + car.name);
			System.out.println("car.name2[1]: " + car.name2[1]);
			
			
			car.name = "소나타";
			
			System.out.println("car.name: " + car.name);
		}

}
