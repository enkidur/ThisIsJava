package ch04.sec02;

import java.net.Socket;

public class IfEx3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		
		System.out.println("점수"+score);
		String grade;
		if(score >=90)
		{
			grade = "A+";
		}else
		{
			grade ="A";
		}
		
		if(score >=85) {
			grade = "B+";
		}else{
			grade ="B";
		}
	System.out.println("학점:" + grade);
	}
}
