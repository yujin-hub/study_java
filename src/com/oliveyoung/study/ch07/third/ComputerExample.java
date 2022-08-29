package com.oliveyoung.study.ch07.third;

public class ComputerExample {

	public static void main(String[] args) {
		// 오버라이드          ※ 오버로드랑 헷갈리지 마셈
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.areaCircle(2));

		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(2));
		
	}

}