package ch09.sec06.exam01;


public class ButtonEx {

	public static void main(String[] args) {
		Button Ok_B = new Button();
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭됨");
			}
		}
		
		OkListener ok = new OkListener();
		Ok_B.setClickLestener(ok);
		Ok_B.click();

		// Cancel 버튼 객체 생성.
		Button Can_B = new Button();
		class CaneclListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("cancel 버튼을 클릭했습니다.");
			}
		}
		Can_B.setClickLestener(new CaneclListener());

		Can_B.click();

	}

}
