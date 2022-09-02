package test;

public class ComputerExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원면적: " + calculator.Area(7)); 
		System.out.println("원면적: " + computer.Area(7));
	}

}