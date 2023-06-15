package ch09.sec06.exam01;

public class Button {
	public static interface ClickListener {
		void onClick();
	}

	private ClickListener clickListener;

	public void setClickLestener(ClickListener clickListener) {
		this.clickListener = clickListener;

	}

	public void click() {
		this.clickListener.onClick();
	}
}