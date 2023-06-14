package report.ch07.ex07;

public class Child extends Parent {
	public String name;

	public Child() {
		this("홍길동");
		System.out.println("child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Chlid(String name) call");
	}
}
