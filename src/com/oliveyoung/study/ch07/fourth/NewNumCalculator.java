package com.oliveyoung.study.ch07.fourth;


public class NewNumCalculator extends NumCalculator {

	// method

	@Override
	public int getSum(int[] arr) {
		sum = (arr[0] * arr[1]) + arr[2] + 10;
		
		return sum;
	}

	
		
}
