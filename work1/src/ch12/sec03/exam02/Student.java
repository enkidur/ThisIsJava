package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	/*
	 * object의 hashcode() 메소드를 재정의 하여 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴 하도록함.
	 * 재정의 하지 않을시 객체 번지로 해시코드를 생성, 객체가 다를경우 해시코드도 달라짐. 하여 s1, s2 가 동등 객체가아니게 된다.
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	 */
	
	/*
	 * object의 equals()메소드를 재정의 하여 student 객체인지를 확인하고, 학생번호와 이름이 같으면 true를 리턴 하도록함.
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())){
				return true;
			}
		}
		return false;
	}

}
