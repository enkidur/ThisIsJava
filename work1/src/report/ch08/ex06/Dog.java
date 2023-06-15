package report.ch08.ex06;

public record Dog() implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}
