package report.ch08.ex06;

public record Cat() implements Soundable {

	@Override
	public String sound() {
		return "야옹";
	}
}
