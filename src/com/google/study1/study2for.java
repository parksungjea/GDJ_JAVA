package com.google.study1;

import java.util.Scanner;

public class study2for {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int id = 1234;
	int pw = 5678;
	int num = sc.nextInt();
	
	//아이디와 패스워드를 입력받습니다.
	//로그인 성공 유무를 판단
	boolean check = false;
	for(int i=0; i<5;i++) {
		System.out.println("아이디를 입력하세요");
		int yourid = sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		 int yourpw = sc.nextInt();
		 if(yourid == id && yourpw == pw) {
			 System.out.println("로그인 성공");
			 check=true;
			 break;
		 }
	}
	System.out.println();
//	if(check) {
//		System.out.println("로그인성공");
//	}else {
//		System.out.println("로그인실패");
//	}
}
}
