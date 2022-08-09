package com.oliveyoung.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = -1;
		
		if(x > 0 && y > 0) {
			System.out.println("제 1사분면에 위치합니다.");
		} else if (x < 0 && y > 0) {
			System.out.println("제 2사분면에 위치합니다.");
		} else if(x < 0 && y < 0) {
			System.out.println("제 3사분면에 위치합니다.");
		} else if(x > 0 && y < 0) {
			System.out.println("제 4사분면에 위치합니다.");
		} else {
			System.out.println("(0,0) 입니다.");
		}
	}

}
