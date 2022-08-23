package com.oliveyoung.study.ch06;

public class HyundaiCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HyundaiCar hyundaicar = new HyundaiCar();
		
		for(int i=0; i<hyundaicar.name.length; i++) {
			System.out.println((i+1) + "번째 : " + hyundaicar.name[i]);
		}
	}

}
