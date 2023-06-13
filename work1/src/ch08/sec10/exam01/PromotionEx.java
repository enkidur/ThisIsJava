package ch08.sec10.exam01;

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언
		A a;
		
		//변수에 구현 객체 대입
		a = b;  // a <- b 자동 타입 변환
		a = c;  // a <- c 자동 타입 변환 
		a = d;  // a <- d 자동 타입 변환
		a = e;  // a <- e 자동 타입 변환
		
	}

}
