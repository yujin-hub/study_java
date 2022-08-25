package com.oliveyoung.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// 부모 클래스 생성 함수 호출
		CellPhone cellphone = new CellPhone();
		
		cellphone.powerOn();
		cellphone.poweroff();
		cellphone.bell();
		cellphone.sendVoice("집에!!");
		cellphone.receiveVoice("가자!!!");
		cellphone.hangUp();
		
		System.out.println("------------------------");

		// 자식 클래스 생성 함수 호출
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(6);
		dmbcellphone.turnOffDmb();
		
		System.out.println("------------------------");
		
		// 자식 클래스 생성 부모 함수 호출
		DmbCellPhone dmbcellphone2 = new DmbCellPhone("LG", "Blue", 8);
		
		dmbcellphone2.turnOnDmb();
		dmbcellphone2.changeChannelDmb(75);
		dmbcellphone2.turnOffDmb();
		
		dmbcellphone2.powerOn();
		dmbcellphone2.poweroff();
		dmbcellphone2.bell();
		dmbcellphone2.sendVoice("집에 좀!!");
		dmbcellphone2.receiveVoice("가보자고!!!");
		dmbcellphone2.hangUp();
	}

}
