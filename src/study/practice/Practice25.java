package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {

		//prac01();
		//prac02();
		prac03();
		//prac04();

	}

	public static void prac01() {
		//랜덤값 생성

		Random random = new Random();
		//System.out.println(random.nextInt(5));	//0 1 2 3 4
		//System.out.println(random.nextInt(1, 5));	//1 2 3 4 		1<=랜덤값<5 jdk17~

		System.out.println( Math.random());

		// 1 ~ 6	(int)(Math.random() * 6) + 1
		// 40 ~ 60	(int)(Math.random() * 21) + 40


		//	(int)(Math.random() * 숫자의 갯수) + 시작숫자

	}
	public static void prac02() {

		//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		//		모든 경우의 수를 출력하는 프로그램을 작성하시오.

		for(int i=1; i<6; i++) {

			for(int j=1; j<6; j++) {
				if(j+i==6) {
					System.out.print("1번 주사위 : " + i + " ");
					System.out.print("2번 주사위 : " + j + " ");
					System.out.println("");
				}


			}	
		}
	}
	public static void prac03() {

		//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		//		1) Math.random() 활용
		//		2) int[] lotto = new int[6]; 활용


		Random random = new Random();
		//		int[] lotto = new int[6];
		//
		//		for(int i=0; i<lotto.length; i++) {
		//			lotto[i] = (int)(Math.random() * 45) + 1;
		//
		//			for(int j=1; j<6; j++) {
		//				if(lotto[j] == lotto[i]) {
		//					lotto[i] = (int)(Math.random() * 45) + 1;
		//				}
		//			}
		//
		//		}
		//		for(int i=0; i<lotto.length; i++) {
		//			System.out.print(lotto[i] + " ");
		//		}


//		int[] lotto = new int[6];
//
//		//6 개의 로또번호 뽑는 과정
//		for(int i=0; i<6; i++) {
//			//	lotto[i] = random.nextInt(45)+1; //1~45
//			lotto[i] = (int)(Math.random()*45) + 1;
//			for(int j=0; j<i; j++) {
//				if(lotto[i]==lotto[j]) {
//					lotto[i] = (int)(Math.random()*45) + 1;
//				}
//			}
//		}
//
//		//6개의 뽑힌 번호 출력
//		for(int i=0; i<6; i++) {
//
//			System.out.print(lotto[i] + " ");
//		}
		
		
		int[] lotto = new int[6];	//로또 6개 값 저장용 배열변수
		
		int num; //뽑은 숫자 임시 저장
		int index = 0; //배열의 위치를 나타내는 인덱스
		
		
		while(true) {
			
			//랜덤값 뽑기
			num = (int)(Math.random()*45) + 1;
			
			boolean isDuplicated = false;	//중복이냐? true -> ㅇㅇ false -> ㄴㄴ
			
			for(int i=0; i<index; i++) {
				if(lotto[i] == num) {	//내가 뽑은 값이랑 중복된 값이 있는가
					
					//true 실행 -> 중복된 값이 있다
					//중복이다!! 기록!!
					isDuplicated = true;
					break;
					
				}
			}
			
			
//			if(isDuplicated) { //중복이면 pass
//				
//			} else { //중복 아니면? lotto 배열에 저장하면서 계속 진행
//				
//			}
			
			if(isDuplicated)
				continue;
			
			//중복아닐때 수행할 코드
			lotto[index] = num;
			index++; //다음칸으로 이동
				
			
			//6개 다 채웠으면? 끝!
			if(index >= lotto.length)
				break;
		}
		//6개 뽑힌 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
	public static void prac04() {
		//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
		//
		//		ex)
		//		int[][] arr =
		//		{
		//		{10, 20, 30},
		//		{20, 30, 40},
		//		{30, 40, 50}
		//		};
		//		이 주어지는 경우 최종 결과는
		//		10 20 30 60
		//		20 30 40 90
		//		30 40 50 120
		//		60 90 120 270

		int[][] arr =
			{
					{10, 20, 30},
					{20, 30, 40},
					{30, 40, 50}
			};

		int[] arr1 = new int[4];

		int total = 0;
		for(int i=0; i<arr.length;i++) {

			total=0;

			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				total += arr[i][j];
			}
			System.out.print(total);
			System.out.println("");
		}
		for(int i=0; i<arr.length;i++) {

			total=0;

			for(int j=0; j<arr[i].length; j++) {
				total += arr[j][i];
			}
			System.out.print(total + " ");
		}

		total=0;
		for(int i=0; i<arr.length;i++) {


			for(int j=0; j<arr[i].length; j++) {
				total += arr[j][i];
			}
		}
		System.out.print(total + " ");


	}
}

























