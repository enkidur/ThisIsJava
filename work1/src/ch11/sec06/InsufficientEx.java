package ch11.sec06;

//사용자 정의 예외 처리
public class InsufficientEx extends Exception{

	public InsufficientEx() {
	}
	
	//예외 메세지를 입력 받는 생성자.
	public InsufficientEx(String message) {
		super(message);		
	}

}
