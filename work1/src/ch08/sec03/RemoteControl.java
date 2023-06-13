package ch08.sec03;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	//public abstract void xxxxxx -> 인터페이스시 이렇게 씀.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	/*디폴트 이스턴스 메소드. -> 인터페이스에서는 public 가 없어도 됨.
	//EX)public default void setMute(boolean mute)-> default void setMute(boolean mute)*/
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음해제");
		}
	}
	
	/*정적 메소드
	   - public을 생략 하더라도 자동으로 컴파일 과정에서 붙는 것이 차이점임.
	   - 구현 객체가 없어도 인터페이스 만으로 호출이 가능.
	  ※주의할점
	   - 이 메소드드는 인스턴스메소드이기 때문에 상수 필드를 제외한
	     추상 메소드, 디폴트메소드, private메소드 등을 호출 할 수가 없음.
	*/
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교체합니다.");
	}
	
	/* private 메소드
	 * 상수,추상,디폴트, 정적메소드는 모두 public 접근 제한을 가지고 있어 선언시 public를 생략하더라도
	 * 항상 외부에서 접근이 가능.
	 * private 메소드의 사용 목적
	 *  - 중복 코드를 줄이기 위함.
	 */
	
}
