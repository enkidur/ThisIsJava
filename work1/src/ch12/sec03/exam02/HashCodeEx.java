package ch12.sec03.exam02;

import java.util.HashSet;

//매모리 번지를 이용한 객체를 식별하는 object의 hashcode메소드 재정의 예제
public class HashCodeEx {

	public HashCodeEx() {
	}

	public static void main(String[] args) {
/*		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체 입니다.");
			}else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		}else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
	}
*/
		
		
		//HASHSET을 이용한 예제
		//HashSet : 동등 객체를 중복 저장 하지 않는다는 특징이 있는 클래스.
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수:"+hashSet.size());
		
		Student s2 = new Student(1,"홍길동");	
		hashSet.add(s2);
		System.out.println("저장된 객체 수:"+hashSet.size());
		
		Student s3 = new Student(2,"홍길동");	
		hashSet.add(s3);
		System.out.println("저장된 객체 수:"+hashSet.size());
	}
}
