package ch08.sec11.exam02;

public class DriverEx {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현객체 대입.
		//자동 타입 변환-> 오버라이딩메소드 호출 -> 다형성.
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
