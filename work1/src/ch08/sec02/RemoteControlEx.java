package ch08.sec02;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.TurnOn();
		
		rc = new Audio();
		rc.TurnOn();
		
	}

}
