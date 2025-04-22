package study.practice;

import java.util.Scanner;
import java.util.Arrays;
public class Practice15 {

	public static void main(String[] args) {


		//	prac1();
		//	prac2();
		//	prac3();

	}

	public static void prac1() {
		/*
		 1.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90
		 */
		/*	Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		int[] arr = {a,b,c,d,e};
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		arr[3] = scanner.nextInt();
		arr[4] = scanner.nextInt();

		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("몇번째수?");
		int k = scanner.nextInt();
		System.out.println("결과 : " + arr[k-1]); */ //내 답안

		//배열
		int[] arr = {10,20,30,50,90};

		// index : 0 1 2 3 4
		// 사용자	 : 1 2 3 4 5

		// 사용자가 선택한 번째 수 - 1 인덱스 위치

		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[5];
		System.out.println("5개 수 입력 : ");

		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}

		//		numArr[0] = scanner.nextInt();
		//		numArr[1] = scanner.nextInt();
		//		numArr[2] = scanner.nextInt();
		//		numArr[3] = scanner.nextInt();
		//		numArr[4] = scanner.nextInt();

		//		int n1 = scanner.nextInt();
		//		int n2 = scanner.nextInt();
		//		int n3 = scanner.nextInt();
		//		int n4 = scanner.nextInt();
		//		int n5 = scanner.nextInt();

		System.out.println("몇번째? 입력 : ");
		int index = scanner.nextInt();

		System.out.println(numArr[index-1]);

		//		if(index == 1)
		//			System.out.println(n1);
		//		else if(index == 2)
		//			System.out.println(n2);
		//...


	}
	public static void prac2() {
		/*
		 2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1
		 */
		/*		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		int[] arr = {a,b,c,d,e};
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		arr[3] = scanner.nextInt();
		arr[4] = scanner.nextInt();

		for(int i=4; i>-1; i--) {
			System.out.print(arr[i] + " ");
		} */ //내 답안

		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[5];

		System.out.println("5개 수 입력 : ");

		//		for(int i=0; i<numArr.length; i++) {
		//			numArr[i] = scanner.nextInt();
		//		}
		//		
		//		for(int i=numArr.length-1; i>=0; i--) {
		//			System.out.print(numArr[i] + " ");
		//		}

		for(int i=numArr.length-1; i>=0; i--) {
			numArr[i] = scanner.nextInt();
		}

		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}


	}
	public static void prac3() {
		/*
		 3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16
		 */
		//		int[][] arr1 = new int[4][4];
		//		int k = 1;
		//		for(int i = 0;i<4;i++) {
		//			for(int j=0; j<4; j++) {
		//				arr1[i][j] =k++;
		//			}
		//
		//		}
		//
		//
		//		for (int i = 0; i < 4; i++) { 
		//			for (int j = 0; j < 4; j++) {
		//				System.out.print(arr1[i][j] + "\t"); 
		//			}
		//			System.out.println(); 
		//		}         내 답안

		//		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int[][] arr = new int[4][4];

		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				//arr[i][j] = num;
				//num++;
				//i:0		1		  3	
				//j:0 1 2 3 0 1 2 3 4 0 1 2 3 4
				//n:1 2 3 4 5 6 7 8 9 10 11 12 13
				arr[i][j] = (4*i) + (j+1); // 배열 공식
			}
		}



		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				//				System.out.print(arr[i][j] + " ");
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}
}
