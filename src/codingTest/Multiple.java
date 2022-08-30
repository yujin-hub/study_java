package codingTest;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(j == 1) {
					System.out.println("--------------");
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
