package codingTest;

public class StarExample {

	public static void main(String[] args) {
		//		**********
		//		**********
		//		**********
		//		**********
		//		**********
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
		
		System.out.println("--------------");
		
		
		//		**********
		//		*        *
		//		*        *
		//		*        *
		//		**********
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4 && j>=2 && j<= 9) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("--------------");
		
		
		
		//		1
		//		12
		//		123
		//		1234
		//		12345
		//		123456
		//		1234567
		//		12345678
		//		123456789
		//		1 3 5 7 90
		
		
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				if(i == 10 && j%2 == 0) {
					if(j == 10) {
						System.out.print(0);
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print(j);
				}
			}System.out.println(" ");
		}
	}

}
