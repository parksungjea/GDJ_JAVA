package com.google.study1;

import java.util.Scanner;

public class study4 {
	public static void main(String [] args) {
		
		System.out.println("Master");
		Scanner sc = new Scanner(System.in);
		//서든 FPS
		//총알 : 30발 탕창 *3
		
		//1. 단발모드
		//2. 점사모드
		int a=0;
		for(int i=1;i<=3;i++) {
			System.out.println("모드를선택하세요");
			a = sc.nextInt();
			if(a==1) {
				for(int j=0;j<30;j++) {
					System.out.println("탕");
				}
			}else if(a==2) {
				for(int n=0;n<10;n++) {
					System.out.println("탕탕탕");
				}
			}else {
				System.out.println("1,2모드중 선택하세요");
				i--;
			}
			if(i==3) {
			System.out.println("탄창이 없습니다");
			}
		}
	}

}
