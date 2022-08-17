package com.oliveyoung.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88, 99, 45, 86, 34};
		
		String[] name = {"장동건", "고소영", "최유진"};
		
		System.out.println(name[2]);
		
		System.out.println(scoreChemistry[0]);
		
		
		System.out.println("---------------------");
		
		
		double sum = 0.0;
		
		for(int i=0; i<=4; i++) {
			sum += scoreChemistry[i];
		}
		
		double avg = sum/5;
		
		System.out.println("화학 평균 성적 : " + avg + "점");
	
		
	//	for(int i=0; i<scoreChemistry.length; i++) {
	//		sum += scoreChemistry[i];
	//	}
		
	//	double avg = sum/scoreChemistry.length;
		
	//	System.out.println("화학 평균 성적 : " + avg + "점");
		
	}

}
