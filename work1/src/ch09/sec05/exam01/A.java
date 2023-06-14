package ch09.sec05.exam01;

/*정적 멤버 클래스는 바깥 클래스의 인스턴스 필드와 인스턴스메소드는 사용하지 못함.
 * 이유 : 바깥 객체가 없어도 사용 가능 해야되므로.
 */
public class A {
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
	}
	
	class B{
		void method() {
			
			//A의 인스턴스 필드와 메소드 사용.
			field1 = 10;
			method1();
			System.out.println(field1);
			
			//A의 정적 필드와 메소드 사용.
			field2 =10;
			method2();
			System.out.println(field2);
			
		}
		
	}
	class C{
		void method() {
			/*A의 인스턴스 필드와 메소드 사용.
			 * field1 = 10;	//-> 사용 안됨
			 * method1();	//-> 사용 안됨
			 */
			
			//A의 정적 필드와 메소드 사용.
			field2 =10;
			method2();
			System.out.println(field2);
		}
	}
	
}
