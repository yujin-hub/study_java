package test;

public class RemoteControlExample {

	public static void main(String[] args) {


		RemoteControl remoteControl = new Television();
		
		remoteControl.turnON();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(10);
		RemoteControl.changeBattery();
		remoteControl.turnOFF();
		
		System.out.println("-------------------");
		
		remoteControl.turnON();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
		remoteControl.turnOFF();
		
	}

}
