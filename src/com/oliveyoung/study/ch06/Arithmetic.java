package com.oliveyoung.study.ch06;

public class Arithmetic {
	
	public int sum (int a, int b) {
		int sum = 0;
		sum = a + b;
		
		return sum;
	}
	
	public int minus (int a, int b) {
		int minus = 0;
		minus = a - b;
		
		return minus;
	}

	public int times (int a, int b) {
		int times = 0;
		times = a * b;
		
		return times;
	}
	
	public int div (int a, int b) {
		int div = 0;
		div = a / b;
		
		return div;
	}
	
	public int remind (int a, int b) {
		int remind = 0;
		remind = a % b;
		
		return remind;
	}
	
	
	
	// method
	public void say(int result) {
		System.out.println("결과: " + result);	
	}
	
	
	
	
	public int abc(int a){
		return 1;
	}
	
	public String aaa (int a) {
		return "";
	}
	
	public boolean bbb (int a) {
		return true;
	}
	
	public double ccc (int a) {
		return 1.1;
	}
	
	public void ddd (int a) {
		
	}
	
	static void staticTest() {
		System.out.println("유진초이");
	}
}
