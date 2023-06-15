package ch09.sec07.exam02;

public class Home {
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOff() {
			System.out.println("TV 0FF");
		}

		@Override
		public void turnOn() {
			System.out.println("TV ON");
		}
	};

	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}

	// 메소드 (로컬 변수 이용)
	public void use2() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("air conditioner on.");
			}

			@Override
			public void turnOff() {
				System.out.println("air conditioner off.");
			}
		};

		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드 (매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
