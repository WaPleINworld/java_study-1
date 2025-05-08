package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		
		Mike m1 = new Mike();
		m1.volumeUp();
		
		Wireless wm1 = new Wireless();
		wm1.volumeUp();
		
		BluethoothMike bm1 = new BluethoothMike();
		bm1.volumeUp();
		
		Mike m2 = new Wireless();
		Mike m3 = new BluethoothMike();
		
		m2.volumeUp();
		m3.volumeUp();
		
//		BluethoothMike bm2 = new Wireless();
//		BluethoothMike bm2 = new Mike();
		

	}

}
