package ch12.sec03.exam03;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자","안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);	
		
		//매개값이 객체가 되면 객체의 tostring()메소드를 호출하여 리턴값을 출력함.
		System.out.println(myPhone);
	}

}
