package ch09.sec02.exam02;

public class A13 {
	class B{
		int field1 =1;
		
		static int field2 = 2;
		
		B(){
			System.out.println("B생성자 start");
		}
		
		void method1() {
			System.out.println("B-method1 start");
			
		}
		static void method2() {
			System.out.println("B-method2 start");
		}
	
	}
	void useB() {
		B b = new B(); // 로컬 변수.
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(b.field2);
		b.method2();
	}
}
