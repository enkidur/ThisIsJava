package ch13.sec04;

public class GenericEx {

	public GenericEx() {
	}

	public static void main(String[] args) {
		boolean Result1 = compare(10,20);
		System.out.println(Result1);
		System.out.println();
		
		boolean Result2 = compare(4.5,4.5);
		System.out.println(Result2);
	}

	//제한된 타입 파라미터를 갖는 제네릭 메소드
	private static <T extends Number> boolean compare(T t1,T t2) {
		System.out.println("compare("+t1.getClass().getSimpleName()+","+
										t2.getClass().getSimpleName()+")");
		
		return false;
	}

}
