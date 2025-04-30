package study.practice.Practice29;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Monitor samsung = new Monitor("삼성", 27, 150000);
		samsung.color = "검은색";
		
		Monitor LG = new Monitor("LG", 32, 330000);
		
		samsung.info();
		LG.info();
		
		Monitor m1 = new Monitor("ASUS", 43, 400000);
		Monitor m2 = new Monitor("comawang", 32, 200000);
		
		m1.setXY();
		m2.setColor();
		m2.setXY();
		
		m1.totalInfo();
		m2.totalInfo();
		
		m2.plusPrice();
		m2.totalInfo();
	}
	
}
