package ch08.sec12;

public class InstanceofEx {

	public static void main(String[] args) {
		
		//구현객체 생성
		Taxi taxi =  new Taxi();
		Bus bus = new Bus();
		
		//버스가 아니기 때문에 버스가 달리지 않음.
		ride(taxi);
		
		ride(bus);
		
	}
	public static void ride(Vehicle vehicle) {
		
		//방법1 : 매개값이 bus인 경우에만 강제 타입 변환하여 checkfare 메소드 호출

		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.CheckFare();
		}
		
		//방법2 : java12 부터 사용 가능.
		 if(vehicle instanceof Bus bus) {
			 bus.CheckFare();
		 }
		 
		 vehicle.run();
	}
}
