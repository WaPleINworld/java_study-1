package study.practice.Practice29.Shape;

public class Rectangle {

	int width;
	int heith;
	
	Rectangle(int i, int j) {
		width = i;
		heith = j;
	}

	int getArea() {
		int area = width * heith;
		return area;
	}

}
