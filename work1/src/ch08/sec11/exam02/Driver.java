package ch08.sec11.exam02;

public class Driver {
	//구현 겍체가대입 될수 있도록 매개 변수를 인터페이스 타입으로 선언.
	void drive(Vehicle vehicle)
	{
		//인터페이스 호출.
		vehicle.run();
	}
}
