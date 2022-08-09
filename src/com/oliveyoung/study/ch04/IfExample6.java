package com.oliveyoung.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 45;
		int b = 18; 
		int c = 16;
	
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 a: " + a);
			} else if(b > a && b > c) {
				System.out.println("최대값은 b: " + b);
			} else {
				System.out.println("최대값은 c: " + c);
			}
			
			if(a < b && a < c) {
				System.out.println("최소값은 a: " + a);
			} else if( b < a && b < c) {
				System.out.println("최소값은 b: " + b);
			} else {
				System.out.println("최소값은 c: " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재합니다. 수정해주세요.");
		}
	}
}
