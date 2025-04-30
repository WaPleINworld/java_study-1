package study.practice.Practice29;

import java.util.Scanner;

public class Monitor {

	/*
	 2.
//개념을 클래스로 옮겨 작성해보기

8. 모니터의 색상과 해상도가 결정되었습니다. -> 해상도값 저장 4번 생성한 set메소드 활용
1) 1080 * 780
2) 흰색, 4096 * 2048
9. 모니터 클래스에는 자신의 정보를 정렬하여 출력해주는 기능이 있습니다. -> 출력기능 메소드
10. 1), 2) 모니터의 정보를 출력합니다. -> 9번활용 출력
11. 2) 의 가격이 7만원 인상시키고, 그 결과 총금액을 받아서 출력합니다.-> 6번,9번 메소드활용 (9번은...밑에 12번에서 출력을 다시 하니까...6번만해도..되겠군요)
12. 1), 2)에 해당하는 정보를 다시 출력합니다. -> 9번활용 출력
	 */

	String brand;
	int inch;
	int price;
	String color;
	int maxX;
	int maxY;
	int addPrice;

	Monitor(String brand, int inch, int price) {
		this.brand = brand;
		this.inch = inch;
		this.price = price;
	}

	Scanner scanner = new Scanner(System.in);

	void setXY() {
		System.out.print("가로 해상도 : ");
		maxX = scanner.nextInt();
		
		System.out.print("세로 해상도 : ");
		maxY = scanner.nextInt();
		
		if(color == null) {
		} else {
			System.out.print(color+", ");
		}
		System.out.printf("%d * %d",maxX, maxY);
		System.out.println();
	}

	void setColor() {
		System.out.print("색을 설정해주세요 : ");
		color = scanner.next();
	}

	void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}

	void plusPrice() {
		System.out.printf("가격을 얼마만큼 올리시겠습니까? (현재가격 : %d) : ",price);
		addPrice = scanner.nextInt();
		price += addPrice;
		System.out.println("");
		System.out.printf("%d 만큼 인상시키셨습니다. (현재가격 : %d)",price);
	}
	
	void info() {
		System.out.printf("%s %d인치 %d ",brand,inch,price);
		if(color == null) {
			System.out.print("(색 지정이 안되었습니다.)");
		} else {
			System.out.print(color);
		}
		System.out.println("");
	}
	
	void totalInfo() {
		System.out.printf("%s %d인치 %d ",brand,inch,price);
		if(color == null) {
			System.out.print("(색 지정이 안되었습니다.)");
		} else {
			System.out.print(color + " ");
		}
		System.out.print(maxX + "*" + maxY);
		System.out.println("");
		
	}
}

