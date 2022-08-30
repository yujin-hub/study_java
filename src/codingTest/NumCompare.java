package codingTest;

public class NumCompare {

	public static void main(String[] args) {
		// int 타입의 변수를 2개 선언하고 두 정수가 주어졌을 때 두 정수를 비교하고 크기 비교, 결과 출력

		int a = 20; 
		int b = 41;
		
		if(a > b) {
			System.out.println("a:" + a + " b:" + b + " a값이 b값보다 큽니다.");
		}else if(a < b) {
			System.out.println("a:" + a + " b:" + b + " a값이 b값보다 작습니다.");
		}else{
			System.out.println("a:" + a + " b:" + b + " a와 b의 값이 동일합니다.");
		}
	}

}
