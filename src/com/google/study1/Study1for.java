package com.google.study1;

import java.util.Scanner;

public class Study1for {
	public static void main(String [] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정숭 하나를 입력하세욧");
		
		int  num = sc.nextInt();
		int num1 = 0;
		//입력받은 정수의 약수를 출력하세요
		//약수의 갯수를 출력하세요
		for(int i = 1; i<num;i++) {
			if(num%i == 0) {
				System.out.println(i);
				num1++;
			}
			
		}
		System.out.println("약수의 갯수는 :" + num1);
	}

}
