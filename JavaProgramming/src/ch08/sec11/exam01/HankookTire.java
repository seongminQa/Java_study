package ch08.sec11.exam01;

public class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
		System.out.println("제동력이 좋습니다.");
	}
}
