package com.oliveyoung.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		double result6 = v1 / v2;
		System.out.println(result6);
		
		double result7 = (double) v1 / v2;
		System.out.println(result7);

		
		
		
		
		double a = (double)(3*1+2)/3;
		double b = (double)5/8;
		double c = (double)(5*9+4)/5;
		
		double answer1 = (a-b)*c;       
		
		System.out.println(answer1);
		
		
		
		int d = 5;
		double e = 3.25;
		double f = (double)(6*1+5)/6;
		double g = (double)12/17;
		
		double answer2 = d - (e-f)*g;

		System.out.println(answer2);
		
		
		
		
		
		int num = 8;
		int num2 = 7;
		int num3 = 5;
		int num4 = 1;
		int num5 = 9;
		int num6 = 6;
		int num7 = 4;
		
		int sum = num + num2 + num3;
		int sum2 = num4 + num5 + num3;
		int sum3 = num3 + num6 + num6;
		int sum4 = num7 + num2 + num4;
		int sum5 = num2 + num3 + num3;
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		avg("홍길동", 60, 70, 85, 90, 45);
		avg("박말순", 50, 75, 70, 60, 70);
		avg("고장난", 55, 60, 64, 58, 90);
		avg("도롱뇽", 80, 70, 63, 88, 78);
	}
		
	public static void sum(int a, int b, int c) {
		
		System.out.println(a + " + " + b + " + " + c + " + " + " = " + (a+b+c));
	}
	
	public static void avg(String name, int english, int math, int physics, int music, int athletic) {
		
		System.out.println(name + "의 평균: " + (double)(english + math + physics + music + athletic)/5);
	}
}




