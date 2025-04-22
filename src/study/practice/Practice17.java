package study.practice;

import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		//	prac1();
		//	prac2();
		//	prac3();
		//	prac4();
		//	prac5();
		prac6();

	}

	public static void prac1() {

//		System.out.println(" 1. 입력 \n 2. 수정 \n 3. 조회 \n 4. 삭제 \n 5. 종료" );
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("메뉴 번호를 입력하세요:");
//		int a = scanner.nextInt();
//		if(a>=1 && a<=5) {
//			if(a==1) {
//				System.out.println("입력 메뉴입니다.");
//			}
//			if(a==2) {
//				System.out.println("수정 메뉴입니다.");
//			}
//			if(a==3) {
//				System.out.println("조회 메뉴입니다.");
//			}
//			if(a==4) {
//				System.out.println("삭제 메뉴입니다.");
//			}
//			if(a==5) {
//				System.out.println("프로그램이 종료됩니다.");
//			} 
//		} else {
//			System.out.println("잘못 입력하셨습니다");
//		}
		
		String[] menuArr = {"입력","수정","조회","삭제","종료"};
		
		for(int i=0; i<menuArr.length; i++) {
			System.out.println((i+1)+". "+menuArr[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = scanner.nextInt()
;
		
		if(menu >= 1 && menu<=4) {
			System.out.println(menuArr[menu-1]+" 메뉴입니다.");
		} else if(menu==5) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
//		switch(a) {
//		case 1: System.out.println("입력 메뉴입니다");
//		break;
//		case 2: System.out.println("수정 메뉴입니다");
//		break;
//		case 3: System.out.println("조회 메뉴입니다");
//		break;
//		case 4: System.out.println("삭제 메뉴입니다");
//		break;
//		case 5: System.out.println("프로그램이 종료됩니다.");
//		break;
//		default: System.out.println("오류");
//		}
		

	}
	public static void prac2() {
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i>j) {
					arr[i][j] = 3;
				}
				if(i==j) {
					arr[i][j] = 1;
				}
				if(i<j) {
					arr[i][j] = 2;
				}
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void prac3() {

		//		1.
		//		2x + 4y = 10 이 만족하는
		//		모든 x, y 쌍을 구하시오.
		//		(x와 y는 자연수 1~10)

		int x = 1;
		int y = 1;

		while(x<=10) {
			while(y<=10) {
				if(2*x+4*y==10) {
					System.out.println("x : " + x + " y : " + y);
				}
				y++;
			}
			y=1;

			x++;
		}


	}
	public static void prac4() {
		//	2.
		//	정수 2개를 입력 받아서,
		//	아래 계산 결과를 출력하시오.
		//	큰수 - 작은수
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(a>b) {
			System.out.println(a-b);
		} else if(a<b) {
			System.out.println(b-a);
		} else
			System.out.println(0);
	}
	public static void prac5() {
		//	3.
		//	윷놀이 게임
		//	4개의 윷을 입력받고 결과를 출력하시오.
		//	(뒷도는 없습니다!)
		//	0 : 안 뒤집어진 상태
		//	1 : 뒤집어진 상태
		//	ex) 입력 0 0 1 0
		//	결과 도
		//	입력 0 1 0 1
		//	결과 개		
		Scanner scanner = new Scanner(System.in);
		System.out.println("윷 입력(0:안 뒤집어진 상태, 1:뒤집어진 상태):");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int total=a+b+c+d;
		if((a==0 || a==1)&&(b==0 || b==1)&&(c==0 || c==1)&&(d==0 || d==1)) {
			if(total==0) {
				System.out.println("모");
			} else if(total==1) {
				System.out.println("도");
			} else if(total==2) {
				System.out.println("개");
			} else if(total==3) {
				System.out.println("걸");
			} else {
				System.out.println("윷");
			}
		} else {
			System.out.println("오류");
		}
	}
	public static void prac6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별의 갯수:");
		int num = scanner.nextInt();

		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
	}

}
