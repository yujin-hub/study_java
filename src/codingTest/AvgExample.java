package codingTest;

public class AvgExample {

	public static void main(String[] args) {
		// 개인평균
		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		String[] name = {"최유진", "홍길동", "김ㅇㅇ", "이ㅇㅇ", "박ㅇㅇ"};
		
		for(int i=0; i<scores.length; i++) {
			double sum = 0.0;
			for(int j=0; j<3; j++) {
				sum += scores[i][j];
			}
			System.out.println(name[i] + "님의 평균: " + sum/scores[i].length+ "점");
		}
		
		System.out.println("------------------------------------");
		
		
		//과목별 평균
		String[] subject = {"국어", "영어", "수학"};
		int sum2[] = new int[3];
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum2[j] += scores[i][j];
			}
		}
		
		for(int i=0; i<sum2.length; i++) {
			System.out.println(subject[i] + " 평균 점수 " + ((double)sum2[i]/scores.length) + "점");;
		}
	}

}
