package ch08.sec08;

public class SmartTV implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색 합니다");
	
	}

	@Override
	public void turnOn() {
		System.out.println("tv on");
	}
		

	@Override
	public void turnOff() {
		System.out.println("tv off");
	}

}
