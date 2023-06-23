package ch15.sec03.exam01;

import java.util.*;
public class HashSetEx {

	public HashSetEx() {
	}

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		set.add("java");
		set.add("Spring");
		
		int size = set.size();
		
		System.out.println(size);
	}

}
