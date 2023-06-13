package ch08.sec09;

public class ExtendsEx {

	/*
	 * 인터페이스 상속일시 자식은 부모 인터페이스를 다 불러올 수 있으나
	 * 부모 인터페이스 변수에 대입되면 부모 인터페이스에 선언된
	 * 추상 메소드만 호출 가능.
	 */
	public static void main(String[] args) {
		InterfaceCimpl impl = new InterfaceCimpl();
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
	

}
