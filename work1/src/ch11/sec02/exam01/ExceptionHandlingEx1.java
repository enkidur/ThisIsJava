package ch11.sec02.exam01;

//예외 처리에 관한 내용.
public class ExceptionHandlingEx1 {

	//try - catch
	public static void printLength(String string) {
		try {
			int result = string.length();
			System.out.println("문자수:"+result);
		}catch (NullPointerException e) {
			
			System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//e.printStackTrace();
		}
		finally {
			System.out.println("마무리 실행.\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("THISISJAVA/n");
		printLength(null);
		System.out.println("프로그램 종료\n");
	}

}
