package study.cls.cls03.pack3;

public class PointMain {

	public static void main(String[] args) {
		
		//점수 -> 국어 영어 수학
		
		//특정 1명의 점수
		int lang = 50;
		int eng = 30;
		int math = 60;
		
		int[] langArr = new int[5];
		int[] engArr = new int[5];
		int[] mathArr = new int[5];
				//index	1;
		
		Point p1 = new Point();
		
//		p1.eng = 500;
//		p1.math = 500;
//		p1.lang = -30;
		p1.setEng(-30);
		p1.setLang(500);
		p1.setMath(95);
		
//		System.out.println(p1.lang);
		System.out.println(p1.getLang());
		System.out.println(p1.getMath());
		System.out.println(p1.getEng());
		
		//Account
		//Person
		//point
	}

}
