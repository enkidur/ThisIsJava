package ch03.sec09;

public class BitShiftEx {

	public static void main(String[] args) {
		int num1 = 1;
		int re1 = num1 <<3; //right Shift
		int re2 = num1 * (int)Math.pow(2,3);//Math함수 2^3

		System.out.println("re1 : " + re1);
		System.out.println("re2 : " + re2);

		int num2 = -8;
		int re3 = num2 >>3; //left shift
		int re4 = num2 /(int)Math.pow(2,3);//Math함수 2^3

		System.out.println("re3 : " + re3);
		System.out.println("re4 : " + re4);
	}

}
