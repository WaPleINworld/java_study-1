package study.practice.Practice29.Shape;

public class Circle {

	int Radius;
	
	void setRadius(int i) {
		System.out.println("반지름 : " + i);
		Radius = i;
	}

	double getArea() {
		double area = Radius * Radius * 3.14;
		return area;
		
	}

}
