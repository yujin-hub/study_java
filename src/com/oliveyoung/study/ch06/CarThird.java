package com.oliveyoung.study.ch06;

public class CarThird {

	String name = "아방이";
	int cc;
	String color;
	
	
	
	// 다형성 : 이름은 똑같지만 여러 기능을 할 수 있음, 오버로드  꼭 기억하기!!!!!!
	
	CarThird (String name) {
		this.name = name;
	}
	
	CarThird (String  name, int cc) {
		this.name =  name;
		this.cc = cc;
	}
	
	CarThird (String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
	
	CarThird(){

	}
	
}
