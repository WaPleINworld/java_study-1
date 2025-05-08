package study.inherit.inherit03;

public class BluethoothMike extends Mike{
	boolean isConnect;
	
	public void connect() {
		System.out.println("블루투스 연결");
	}
	
	//메소드 재정의 (오버라이딩)
	public void volumeUp() {
		System.out.println("Bluethooth volumeUp");
	}
	
	//메소드 추가로 정의 (오버로딩)
	public void volumeUp(int rate) {
		System.out.println(rate + "up");
	}
}
