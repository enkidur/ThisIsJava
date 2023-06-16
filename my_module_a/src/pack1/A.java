package pack1;

import pack2.B;
import pack3.C;

public class A {
	public void method() {
		System.out.println("A method 실행");
		B b = new B();
		b.method();
		}
	
	/*
	 * my_module_b 모듈의 pack3.C 타입 리턴.
	 */
	public C getC() {
		C c = new C();
		return c;
	}
}
