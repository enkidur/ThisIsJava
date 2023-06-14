package ch09.sec02.exam01;

public class AEx {

	public static void main(String[] args) {
		/*
		 * 인스턴스 맴버 크래스 b 내부에는 일반 클래스와 같이
		 * 필드, 생성자, 메소드 선언이 올 수 있다.
		 * 정적 필드와 정적 메소드는 java 17부터 선언이 가능.
		 */
		
		//A 객체 생성.
		A a = new A();
		
		//B 객체 생성.
		A.B b = a.new B();
	}

}
