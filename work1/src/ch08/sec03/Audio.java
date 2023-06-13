package ch08.sec03;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현 Audio 볼륨:" + this.volume);
	}
	private int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음해제");
			setVolume(this.memoryVolume);
		}	}

	
	
}
