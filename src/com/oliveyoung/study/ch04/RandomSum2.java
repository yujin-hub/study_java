package com.oliveyoung.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		double start = 1.0;
		double end = 100.0;
		int sum = 0, min = 0, max = 0;
		
		int num1 = (int)((Math.random() * (end-start)) + start);
		int num2 = (int)((Math.random() * (end-start)) + start);
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		System.out.println("min: " + (int)(min) + " max: " + (int)(max));
		
		for(int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		System.out.println("total : " + sum);
	}
}
