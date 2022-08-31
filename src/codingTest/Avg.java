package codingTest;

public class Avg {

	public static void main(String[] args) {
		// scoreChemisty 의 평균을 구해서 출력하시오.
		
		int[] scoreChemistry = {88,99,45,86,34}; 
		double sum = 0.0;
		
		for(int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		System.out.println("scoreChemistry Avg: " + (sum/5) +"점");
	}

}
