package Service;

import java.util.Scanner;

import Model.board;

public class boardService {
	public boardService() {
	}
	
	public static void createData(Db db) {
		board board = new board();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[새 개시물 입력]");
		System.out.printf("제목: ");
		board.setTitle(sc.nextLine());
		
		System.out.printf("내용: ");
		board.setContent(sc.nextLine());
		
		System.out.printf("작성자: ");
		board.setBname(sc.nextLine()); 
		
		db.crate(board);
	}

	public static void readData(Db db) {
		board board = new board();
		Scanner sc = new Scanner(System.in);
		System.out.println("[개시물 읽기]");
		System.out.printf("읽을 no: ");
		board.setNumber(sc.nextInt());
		
		db.read(board);
	}

	public static void updateData(Db db) {
		board board = new board();
		Scanner sc = new Scanner(System.in);
		System.out.println("[수정 내용 입력]");
		
		System.out.print("수정 할 no: ");
		board.setNumber(sc.nextInt());
		sc.nextLine();
		
		
		System.out.print("제목: ");
		board.setTitle(sc.nextLine());
		
		System.out.print("내용: ");
		board.setContent(sc.nextLine());
		
		System.out.print("작성자: ");
		board.setBname(sc.nextLine()); 
		
		db.update(board);
	}

	public static void deleteData(Db db) {
		board board = new board();
		Scanner sc = new Scanner(System.in);
		System.out.println("[개시물 삭제]");
		System.out.printf("삭제 할 no: ");
		board.setNumber(sc.nextInt());
		db.delete(board);
	}

	public static void allData(Db db) {
		board board = new board();
		db.allRead(board);
	}

}
