package my_app2;

import pack1.A;
//import pack2.B;
import pack3.C;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		//페키지 은닉.
		/*		
		B b = new B();
		b.method();
		 */	
		
		//my_app2패키지에 포함된 c클래스 내용
		C c = new C();
		c.method();
		
		//추가된 내용.(직접 의존성을 배재)
		C result = a.getC();
		result.method();
		
	}

}
