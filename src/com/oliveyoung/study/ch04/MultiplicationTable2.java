package com.oliveyoung.study.ch04;

public class MultiplicationTable2 {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
				if( j == 9) {
					System.out.println("------------");
				}
			}
		}
	}
}
