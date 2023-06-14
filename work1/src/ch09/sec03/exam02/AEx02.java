package ch09.sec03.exam02;

import ch08.sec10.exam01.A;

public class AEx02 {
	public static void main(String[] args) {
		A02.B b=  new A02.B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(b.field2);
		b.method2();
	}
}
