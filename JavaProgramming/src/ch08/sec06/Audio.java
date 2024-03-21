package ch08.sec06;

public class Audio implements RemoteControl {

	public int volume;

	// 무음처리 전 볼륨 저장할 필드
	public int memoryVolume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			memoryVolume = volume;
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(memoryVolume);
		}
	}

}
