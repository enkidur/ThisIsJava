package report.ch08.ex05;

public class Tv implements Remocon {
	
	@Override
	public void powerOn() {
		System.out.println("리모콘 on");
	}
	
	public static void main(String[] args) {
		Remocon remocon = new Tv();
		remocon.powerOn();
		
	}


}
