package report.ch11.ex07;

public class WrongPasswordExecption extends Exception {

	public WrongPasswordExecption() {
	}

	public WrongPasswordExecption(String message) {
		super(message);
	}
}
