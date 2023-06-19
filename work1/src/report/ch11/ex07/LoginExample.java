package report.ch11.ex07;

import java.io.FileWriter;
import java.io.IOException;

public class LoginExample {
	public static void login(String id, String password) throws NotExistIDException,WrongPasswordExecption {
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordExecption("패스워드가 틀립니다");
		}
	}
	
	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try(FileWriter fw = new FileWriter("file.txt")){
			fw.write("Java");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

