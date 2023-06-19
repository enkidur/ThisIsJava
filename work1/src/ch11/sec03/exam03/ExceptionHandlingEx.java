package ch11.sec03.exam03;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		String[] array = {"100","1ㅇㅇ",null,"200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨:"+e.getMessage());
				
				//2가지 예외를 동시 처리할때 ' | '를 사용한다.
			}catch (NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
			
		}
	}

};