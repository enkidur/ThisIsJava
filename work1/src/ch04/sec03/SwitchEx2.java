package ch04.sec03;

//java12 버전 switch 가독성 표현식
public class SwitchEx2 {
	public static void main(String[] args) {
		char gr ='B';
		
		switch(gr) {
		case 'A', 'a'-> System.out.println("우수회원 입니다.");
		case 'B', 'b'-> System.out.println("일반회원 입니다.");
		default -> System.out.println("손님입니다.");
		}
	}
}
