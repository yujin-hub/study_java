package com.oliveyoung.study.ch04;

public class RandomSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double min = 1;
//		double max = 100;
//		int random = (int)((Math.random() * (max-min)) + min);
//		System.out.println(random);

		double min = 1.0;
		double max = 100.0;
		int sum = 0;
		
		int random = (int)((Math.random() * (max-min)) + min);
		int random2 = (int)((Math.random() * (max-min)) + min);
			if (random > random2){
				for(int i=random2+1; i<=random-1; i++) {
					sum += i; 
				}
				System.out.println("random:" + random + " random2: " + random2 + " sum:" + sum);
			} else if(random < random2) {
				for(int i=random+1; i<=random2-1; i++) {
					sum += i;
				} 
				System.out.println("random:" + random + " random2: " + random2 + " sum:" + sum);
			} else{
				System.out.println("두 수 사이의 숫자 합이 0입니다.");
			}
		}	
}
