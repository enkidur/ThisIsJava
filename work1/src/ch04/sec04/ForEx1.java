package ch04.sec04;

public class ForEx1 {

	public static void main(String[] args) {
		String[]arr = {"1-1","1-2","1-3","1-4","1-5"};
		int i=0;
		//이전 for문
		for(i =0; i<5; i++)
		{
			System.out.println("arr" + i +":"+arr[i]);
		}
		System.out.println("--------------------------------");
		i=0;
		//향상된 for문
		//jdk 1.5 이상만
		//대상 배열 또는 여러가지 원소들을 포함한 자료형이어야됨.
		for(String s : arr)
		{
			System.out.println("arr" + i +":"+ s);
			i++;
		}
	}

}
