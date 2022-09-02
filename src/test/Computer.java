package test;

public class Computer extends Calculator{
	
	@Override
	public double Area (int param) {
		System.out.println(" ");
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		
		return param * param * Constants.PAI2;
	}
	
}
