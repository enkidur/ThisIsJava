package ch13.sec02.exam01;

public class GenericEx {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("삼성 스마트 TV");
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("현대 소나타");
		
		Product<Tv, Integer> product3 = new Product<>();
		product3.setKind(new Tv());
		product3.setModel(123);
	}

}
