package ch08.sec09;

public class InterfaceCimpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl - nethodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl - nethodB() 실행");

	}
	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl - nethodC() 실행");

	}

}
