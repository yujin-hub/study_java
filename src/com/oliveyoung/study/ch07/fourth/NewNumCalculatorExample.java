package com.oliveyoung.study.ch07.fourth;


public class NewNumCalculatorExample {

	
	public static void main(String[] args) {
		
		// 부모 클래스 
		NumCalculator numCalculator = new NumCalculator();

		// 자식 클래스
		NewNumCalculator newNumCalculator = new NewNumCalculator();
		
		int[] arr = {25, 17, 4};
		
		
		// 부모 클래스 method2 출력
		System.out.println("정렬 전");
		numCalculator.printArr(arr);
		
		System.out.println("----------------");
		
		System.out.println("정렬 후");
		numCalculator.sort(arr);
		numCalculator.printArr(arr);
		
		System.out.println("----------------");
			
		
		System.out.println("부모 method2");
		System.out.println(numCalculator.getSum(arr));
		System.out.println("----------------");

		
		// 자식 클래스 method 출력
		System.out.println("자식 method");
		System.out.println(newNumCalculator.getSum(arr));
		System.out.println("----------------");
		
		
		// 부모 클래스 method2, 자식 클래스 method 값 차이 출력
		System.out.print("두 값의 차이: " );
		System.out.println(numCalculator.getSum(arr) - newNumCalculator.getSum(arr));
	}

}
