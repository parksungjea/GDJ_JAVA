package com.google.study3.ex;

import java.util.Scanner;

public class Menu {
Scanner sc = new Scanner(System.in);
boolean b = true;
Ex [] exs = null;
public void Start(){
		while(b){
		System.out.println("1 : 명함목록");
		System.out.println("2 : 명함추가");
		System.out.println("3 : 명함삭제");
		System.out.println("4 : 명함수정");
		System.out.println("5 : 명함디테일");
		System.out.println("6 : 프로그램종료");
		int a = sc.nextInt();
		if(a==1) {
			List list = new List();
			list.ExList(exs);
		}
		if(a==2) {
			Plus plus = new Plus();
		exs = plus.start(exs);
		}
		if(a==3) {
			Plus plus = new Plus();
			exs=plus.Delete(exs);
		}
		if(a==4) {
			System.out.println("4");
		}
		if(a==5) {
			System.out.println("5");
		}
		if(a==6) {
			System.out.println("프로그램을 종료합니다");
			b = false;
		}
		if(a>6) {
			System.out.println("1~6까지의 메뉴를 선택하세요");
		}
		}
	}
	
	
	
}
