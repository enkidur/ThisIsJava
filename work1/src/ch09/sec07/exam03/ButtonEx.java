package ch09.sec07.exam03;

/*9.6 중첩 인터페이스 예제를 수정한 내용.
 * 
*/
public class ButtonEx {

	public static void main(String[] args) {
		Button Ok_B = new Button();
		
		/*ok 버튼 객체에 clicklistener 구현 객체 주입
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭됨");
			}
		}
				
		OkListener ok = new OkListener();
		Ok_B.setClickLestener(ok);
		*/
		
		Ok_B.setClickLestener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭됨");
				}
		});
		
		Ok_B.click();
		

		// Cancel 버튼 객체 생성.
		Button Can_B = new Button();
		/*
		class CaneclListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("cancel 버튼을 클릭했습니다.");
			}
		}
		Can_B.setClickLestener(new CaneclListener());
		*/
		
		Can_B.setClickLestener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("cancel 버튼을 클릭했습니다.");
			}
		});
		Can_B.click();

	}

}
