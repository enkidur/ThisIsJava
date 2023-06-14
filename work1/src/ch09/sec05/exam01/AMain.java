package ch09.sec05.exam01;

public class AMain {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.method();
		
		A.C c = a.new C();
		c.method();

	}

}
