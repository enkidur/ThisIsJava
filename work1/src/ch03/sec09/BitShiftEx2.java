package ch03.sec09;

public class BitShiftEx2 {
	public static void main(String[] args) {
	int value = 772;

	byte by1 = (byte)(value >>>24);
	int int1 = by1 & 255;
	System.out.println("첫번째 바이트 부호 없는 값 " + int1);

	byte by2 = (byte)(value >>>16);
	int int2 = Byte.toUnsignedInt(by2);
	System.out.println("첫번째 바이트 부호 없는 값 " + int2);

	byte by3 = (byte)(value >>>8);
	int int3 = by3 & 255;
	System.out.println("첫번째 바이트 부호 없는 값 " + int3);

	byte by4 = (byte) value;
	int int4 = Byte.toUnsignedInt(by4);
	System.out.println("첫번째 바이트 부호 없는 값 " + int4);
	}
}
