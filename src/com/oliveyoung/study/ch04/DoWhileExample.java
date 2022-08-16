package com.oliveyoung.study.ch04;

public class DoWhileExample {

public static void main(String[] args) {

	int i = 1;
	int sum = 0;
	
	do {
			sum += 1;
			System.out.println(i + " : " + sum);
			i++;
		} while(i <= 10);
			
	}
}
