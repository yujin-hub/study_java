package com.oliveyoung.study.ch06;

public class Board {

	// field
	String name = "최유진";
	int views = 1052;
	boolean use = true;
	
	
	Board(String name){
		this.name = name;
	}
	
	Board(String name, int views){
		this.name = name;
		this.views = views;
	} 
	
	Board(String name, boolean use){
		this.name = name;
		this.use = use;
	}
	
	Board(String name, int views, boolean use){
		this.name = name;
		this.views = views;
		this.use = use;
	}
	
	Board(){

	}
	
	
	//method
	public void print() {
		System.out.println("이름: " + name + " 조회수: " + views + "회 " + "사용여부: " + use);
	}
	
}
