package ch03.sec11;

public class ConditionalOperationEx {
	public static void main(String[] args) {
	int score = 85;
	int score2 = (score + 1);
	
	System.out.println(score2);
	
	char grade = (score > 90) ? 'A' : ((score > 80) ? 'B':'C');
	System.out.println(score + "점은" + grade +"등급입니다.");
	}
}
