package ch08.sec13;

public class SealeddEx {

	//무분 별한 자식 인터페이스 생성을 방지 하기 위해 sealed 인터페이스를 사용하는 예제.
	public static void main(String[] args) {
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
