package com.oliveyoung.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수입니다.");
				break;
		}
		
		String position = "사장";
		
		switch (position) {
		case "사원":
			System.out.println("연봉은 5,000 입니다.");
			break;
		case "대리":
			System.out.println("연봉은 6,000 입니다.");
			break;
		case "과장":
			System.out.println("연봉은 6,500 입니다.");
			break;
		case "부장":
			System.out.println("연봉은 7,000 입니다.");
			break;
		case "사장":
			System.out.println("연봉은 9,000 입니다.");
			break;
		default:
			System.out.println("이외는 최저시급입니다.");
		break;
		}
	}

}
