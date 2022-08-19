package com.oliveyoung.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44},{55,55,77}};
		
		System.out.println("scores[0][1]: " + scores[0][1]);
		System.out.println("scores[3][2]: " + scores[3][2]);
		System.out.println("scores[2][0]: " + scores[2][0]);
		System.out.println("scores[4][2]: " + scores[4][2]);
		
		
		System.out.println("----------------------------------------");
		
		
		
		//개인 평균 
		
		String[] name = {"최유진", "장동건", "고소영", "홍길동", "유재석"};
		
		for(int i=0; i<5; i++){
			double sum = 0;
			for(int j=0; j<3; j++) {
				sum += scores[i][j];
			}	
			System.out.println(name[i]+ "의 국영수 평균 : " + sum/3 + "점");
		}
		
		System.out.println("----------------------------------------");
		
		
		
		//과목별 평균
		
		String[] subject = {"국어", "영어", "수학"};
		
		for(int j=0; j<3; j++) {
			double sum = 0;
			for(int i=0; i<5; i++) {
				sum += scores[i][j];
			}
			System.out.println(subject[j]+ " 평균 점수: " + sum/5 + "점");
		}
		
		System.out.println("----------------------------------------");
		

				// 과목별 평균 다른 방법
				int[] sum2 = new int[3];
				
				for(int i=0; i<scores.length; i++) {
					for(int j=0; j<scores[i].length; j++) {
						sum2[j] += scores[i][j];
					}
				}
				
				for(int i=0; i<sum2.length; i++) {
					System.out.println(subject[i] + " 평균 점수 " + ((double)sum2[i]/scores.length));;
				}
		
		//점수 트레이드 
		
	}

}
