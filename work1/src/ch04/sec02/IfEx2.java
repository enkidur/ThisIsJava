package ch04.sec02;

public class IfEx2 {
	public static void main(String[] args) {
	int count = 0;
	int num = (int)(Math.random()*6)+1;
	
	while(count < 7){
		num = (int)(Math.random()*6)+1;
	
		if(num == 1)
			System.out.println("1번 in");
		else if(num == 2)
			System.out.println("2번 in");
		else if(num == 3)
			System.out.println("3번 in");
		else if(num == 4)
			System.out.println("4번 in");
		else if(num == 5)
			System.out.println("5번 in");
		else
			System.out.println("6번 in");
		count++;
		}
	}
}
