package ch09.sec04.exam03;

public class A {
	public void method1(int arg) {
		
		int var =1; //java8 이후 로컬 변수 앞에 final 키워드를 안붙여도 된다.
		
		class B{
			void method2() {
				//로컬 변수 읽기.
				System.out.println("arg:"+arg);
				System.out.println("var:"+var);
				
				//로컬 변수 수정 할 수 없음
				//arg = 2;
				//var = 2;
				
			}
		}
		
		B b = new B();
		b.method2();
		
		//로컬 변수 수정 할 수 없음
		//arg = 3;
		//var = 3;
		
	}
}
