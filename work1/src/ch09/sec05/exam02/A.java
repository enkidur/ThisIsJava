package ch09.sec05.exam02;

/*
 * this는 인스턴스 자기 자신을 가리키는 키워드
 * 메소드 내에서만 사용이 가능
 * 객체 자신을 메소드에 전달 하거나 리턴 하기위하여 사용
 * 객체 생성자 내에서 사용할 경우, 다른 생성자를 호출.
 * 매개 변수와 객체 자신이 가지고 있는 변수의 이름이 같을 경우 이를 구분하기 위해 자신의 변수에
 * this를 사용한다.
 * static메소드를 사용 할 수 없음.
 * 요약 : this -> 객체 자기 자신을 나타냄.
 */

public class A {

	String field = "A-field";
	void method() {
		System.out.println("A-method");
	}
	
	class B{
		String field = "B-method";
		
		void method() {
			System.out.println("B-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	void usbB() {
		B b = new B();
		b.print();
	}
}
