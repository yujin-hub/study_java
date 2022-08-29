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
// 메소드2 : 순서 1 * 순서 2 + 순서 3  -> return 합
 