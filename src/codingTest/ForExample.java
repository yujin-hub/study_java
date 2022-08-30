package codingTest;

public class ForExample {

	public static void main(String[] args) {
		// 1~10까지 for문을 이용해서 더하는 프로그램 작성하시오.
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(i + "까지의 합계 = " + sum);
		}
	}

}
