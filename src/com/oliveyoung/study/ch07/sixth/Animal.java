package com.oliveyoung.study.ch07.sixth;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
//	public abstract void sound(String m);
}
