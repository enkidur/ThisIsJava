package ch04.sec03;

public class SwitchValueEx {
	public static void main(String[] args) {
		String grade = "D";
		int result =0;
		//java 12버전
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			result = 100 - 20;
			
			//yield :키워드가 아닌 제한된 식별자임.
			//case의 결과로 반환하고 싶은 값이 있을 경우. yield를 사용한다.
			yield result;
		}
		//java 14 버전사용시 ,로 case 대체 가능.
		case "C","D","E"->{
			result = 60;
			yield result;
		}
		default -> 60;
		};
		
		System.out.println("score2 : "+score2);
	}
}
