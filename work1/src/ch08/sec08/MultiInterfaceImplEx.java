package ch08.sec08;

public class MultiInterfaceImplEx {
	public static void  main(String[] args) {
		RemoteControl rc = new SmartTV();
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTV();
		searchable.search("https://www.youtube.com");
	}

}
