package Controller;

import java.sql.SQLException;
import java.util.Scanner;
import Service.*;

public class mainBaord {
	public mainBaord() {
	}

	public void Menu() {
		int choice = 1;
		Db db = new Db();
		Scanner sc = new Scanner(System.in);
		
		while(choice != 0) {
			
			System.out.print("1.리스트보기, 2.글등록, 3.글보기, 4.글삭제 5.글수정 0.종료 : ");
		
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				boardService.allData(db);
				break;
			case 2:
				boardService.createData(db);
				break;
			case 3:
				boardService.readData(db);
				break;
			case 4:
				boardService.deleteData(db);
				break;
			case 5:
				boardService.updateData(db);
				break;
			case 0:
				try {
					db.getConn().close();
					System.out.println("프로그램 종료.");
					break;
					} catch (SQLException e) {
						e.printStackTrace();
						}
			}
		}
	}
}
