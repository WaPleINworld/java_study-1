package study.practice;

import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {

		//prac1();
		prac2();


	}
	public static void prac1() {
		//우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		//반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,	
		//각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		//(*가능한 효율적인 구조를 생각해보세요)


		//ex)
		//1반 : 10 10 10 10 10
		//2반 : 20 20 20 20 20
		//3반 : 30 30 30 30 30

		//1반 평균 : 10
		//2반 평균 : 20
		//3반 평균 : 30
		//전체 평균 : 20
		Scanner scanner = new Scanner(System.in);

		int[][] scores = new int[3][5];



		//		int cls1stu1 = scanner.nextInt();
		//		int cls1stu2 = scanner.nextInt();
		//		int cls1stu3 = scanner.nextInt();
		//		int cls1stu4 = scanner.nextInt();
		//		int cls1stu5 = scanner.nextInt();
		//
		//		int cls2stu1 = scanner.nextInt();
		//		int cls2stu2 = scanner.nextInt();
		//		int cls2stu3 = scanner.nextInt();
		//		int cls2stu4 = scanner.nextInt();
		//		int cls2stu5 = scanner.nextInt();

		int[] scores1 = new int[5];
		int[] scores2 = new int[5];
		int[] scores3 = new int[5];

		System.out.print("1반 : ");

		for(int i=0; i<scores1.length; i++) {
			scores1[i] = scanner.nextInt();
		}


		for(int i=0; i<scores2.length; i++) {
			scores2[i] = scanner.nextInt();
		}


		for(int i=0; i<scores3.length; i++) {
			scores3[i] = scanner.nextInt();
		}

		//1평 5명점수합/5
		//2평 5명점수합/5
		//3평 5명점수합/5
		//전평 3반점수합/5

		int[] totalAvg = new int[3];
		for(int i=0; i<scores1.length; i++) {
			totalAvg[0] = totalAvg[0] + scores1[i];
		}
		for(int i=0; i<scores1.length; i++) {
			totalAvg[1] = totalAvg[1] + scores2[i];
		}
		for(int i=0; i<scores1.length; i++) {
			totalAvg[2] = totalAvg[2] + scores3[i];
		}

		//			for(int i=0; i<scores1.length; i++) {
		//				totalAvg[0] = totalAvg[0] + scores1[i];
		//				totalAvg[1] = totalAvg[1] + scores1[i];
		//				totalAvg[2] = totalAvg[2] + scores1[i];
		//			}

		System.out.printf("1반 평균 : %.2f\n", totalAvg[0] / 5.0);
		System.out.printf("2반 평균 : %.2f\n", totalAvg[1] / 5.0);
		System.out.printf("3반 평균 : %.2f\n", totalAvg[2]/ 5.0);
		System.out.printf("전체 평균 : %.2f\n", (totalAvg[0]+totalAvg[1]+totalAvg[2]) / 15.0);

		//			int total1 = 
		//			int total2 =
		//			int total3 =
	}
	public static void prac2() {
		//우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		//반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,	
		//각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		//(*가능한 효율적인 구조를 생각해보세요)
		Scanner scanner = new Scanner(System.in);
		
		int[][] scores = new int[3][5];
		for(int i=0; i<scores.length;i++) {
			
			System.out.println((i+1) + "반 : ");
			
			for(int j=0;j<scores[i].length; j++) {
				scores[i][j] = scanner.nextInt();
			}
		}

		//ex)
		//1반 : 10 10 10 10 10
		//2반 : 20 20 20 20 20
		//3반 : 30 30 30 30 30
		//1반 평균 : 10
		//2반 평균 : 20
		//3반 평균 : 30
		//전체 평균 : 20


		int total = 0; //전체총합
		int classTotal = 0; // 한 반의 총합
		for(int i=0; i<scores.length;i++) {
			
			classTotal = 0;
			
			for(int j=0;j<scores[i].length; j++) {
				classTotal = classTotal + scores[i][j];
			}
			
			System.out.printf("%d 반 평균 : %.2f\n", (i+1), classTotal / 5.0);
			total += classTotal;
		}

		System.out.printf("전체 평균 : %.2f\n", total/15.0);

	}
}
































