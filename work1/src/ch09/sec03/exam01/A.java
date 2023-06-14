package ch09.sec03.exam01;

public class A {
	
	//인스턴스 멤버 클래스
	static class B{
		B(){
			System.out.println("B 생성자 호출");
		}
	}
	
	//인스턴스 필드값으로 B 객체 대입
	B field1 = new B();
	
	static B field2 = new B();
	
	
	//생성자
	A(){
		B b = new B(); // 바깥 클래스 A의 생성자에서
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B(); // 바깥 클래스A의 인스턴스 메소드.
	}
	
	void method2()
	{
		B b = new B();
	}
	
}