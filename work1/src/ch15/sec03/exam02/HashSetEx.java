package ch15.sec03.exam02;

import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		System.out.println(set.size());
		System.out.println("-----------------------");
		for(Member member : set) {
			System.out.println(member.name+ " " + member.age);
		}
		System.out.println("-----------------------");
		
		//객체를 하나씩 가져와서 처리.
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			System.out.println(member.name+ " " + member.age);
			
		}
	}

}
