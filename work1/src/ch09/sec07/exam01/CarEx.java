package ch09.sec07.exam01;

/*
 * 익명 자식객체
 * 부모 클래스를 상속 해서 만들 경우.
 * 부모타입의 필드, 로컬변수, 매개변수의 값으로 대입 가능.
 * 
 */
public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire() {

			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
			}
		});
	}

}
