package study.practice.Practice29;

public class TV {

	String brand;
	int year;
	int inch;

	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.inch = inch;
		this.year = year;
	}
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV", brand, year, inch);
	}
}