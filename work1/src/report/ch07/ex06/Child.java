package report.ch07.ex06;

public class Child extends Parent {
	public int studentNo;

	public Child (String name, int studenNo) {
		super(name);
		this.name = name;
		this.studentNo = studenNo;
	}
}
