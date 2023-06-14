package ch09.sec02.exam01;

public class A {
	
	//인스턴스 멤버 클래스
	class B{
		B(){
			System.out.println("B 생성자 호출");
		}
	}
	
	//인스턴스 필드값으로 B 객체 대입
	B field = new B();
	
	//생성자
	A(){
		B b = new B(); // 바깥 클래스 A의 생성자에서
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B(); // 바깥 클래스A의 인스턴스 메소드.
	}
}
