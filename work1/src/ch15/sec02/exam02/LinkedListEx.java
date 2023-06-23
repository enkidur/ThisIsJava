package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.List;

public class LinkedListEx {

	public LinkedListEx() {
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<1000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","Arraylist 걸린시간: ",(endTime-startTime));

		startTime = System.nanoTime();
		for(int i=0; i<1000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","Linkedlist 걸린시간: ",(endTime-startTime));
	
	}
	

}
