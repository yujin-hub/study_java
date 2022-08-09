package com.oliveyoung.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 76;
		int num2 = 18;

		if(num > num2) {
			System.out.println("num: " + num + " num2: " + num2 + " num이 num2보다 큽니다.");
		} else if(num < num2) {
			System.out.println("num: " + num + " num2: " + num2 + " num2가 num보다 큽니다.");
		} else {
			System.out.println("num: " + num + " num2: " + num2 + " num과 num2의 값이 같다.");
		}
	}

}

