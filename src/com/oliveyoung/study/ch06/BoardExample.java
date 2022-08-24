package com.oliveyoung.study.ch06;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Board board = new Board();
		Board board2 = new Board("김재이");
		Board board3 = new Board("김제니", 55467);
		Board board4 = new Board("박채영", false);
		Board board5 = new Board("김지수", 78935, false);

		board.print();
		board2.print();
		board3.print(); 
		board4.print();
		board5.print();
	}

}
