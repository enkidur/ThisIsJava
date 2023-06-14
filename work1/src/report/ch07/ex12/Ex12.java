package report.ch07.ex12;

public class Ex12 {
	public static void action(AA a) {
		a.method1();
		
		if(a instanceof CC cc) {
			cc.method2();
		}
	}
	public static void main(String[] args) {
		action(new AA());
		action(new BB());
		action(new CC());
	}

}
