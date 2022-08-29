package com.oliveyoung.study.ch07.fourth;


public class NumCalculator {
	
	// field
	int sum = 0;
	int[] arr = new int[3];
	
	
	// method
	public void sort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length - 1; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public int getSum(int arr[]) {
		sum = (arr[0] * arr[1]) + arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
	


// 부모 클래스 
// 필드 : 합계
// 메소드 : 정수 3개를 오름차순 정렬 (직접 구현) void
// 메소드2 : (순서1 * 순서2) + 순서3 -> return 합

// 자식 클래스
// 필드 : 합
// 메서드(오버라이드) : (순서1 * 순서2) + 순서3 + 10  -> return 합

// 실행 클래스
// 필드 : 적절히
// 부모 클래스 생성
// 부모 클래스 메소드2 값 출력
// 자식 클래스 생성 
// 자식 메소드 값 출력
// 부모 클래스 메소드2와 자식 메소드 값 차이 출력