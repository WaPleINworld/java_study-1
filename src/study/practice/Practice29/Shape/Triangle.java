package study.practice.Practice29.Shape;

public class Triangle {

	int width;
	int heith;
	
	void setSize(int i, int j) {
		width = i;
		heith = j;

	}
	
	double getArea() {
		double area = width * heith / 2;
		return area;
	}
	
}
