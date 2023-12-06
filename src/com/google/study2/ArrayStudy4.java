package com.google.study2;

import java.util.Scanner;

public class ArrayStudy4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 
	
	System.out.println("학생의 수를 입력하세요");
	int num1 = sc.nextInt();
	//학생의 정보들
	int [] people = new int[num1]; 
	int [] int1 = new int[num1];
	String [] str1 = new String[num1];
	double [] db1 = new double[num1];
	//시작메뉴
	int menu = 0;
	//종료메뉴
	int menu2 = 0;
	//몇번학생인지
	int addr = 0;
	//학생의 정보를 입력받는곳
	String name = "";
	int number = 0;
	double hakjum = 0;
	//프로그램시작
	for(int i=0;i<2;i++) {
		System.out.println("1: 학생정보입력\n 2: 학생정보보기\n 3: 학생정보검색 \n 4: 프로그램 종료");
		menu = sc.nextInt();
		if(menu == 1) {
		System.out.println("몇번학생의 정보를 입력할거야?");
		addr = sc.nextInt();
		people[addr] = addr; 
		System.out.println("학생의 이름을 입력해");
		name = sc.next();
		str1[addr] = name;
		System.out.println("학생의 핸드폰번호를 입력해");
		 number = sc.nextInt();
		 int1[addr] = number; 
		 System.out.println("학생의 학점을 입력해");
		 hakjum = sc.nextDouble();
		 db1[addr] = hakjum;
		 i=0;
		}
		if(menu == 2) {
			for(int j=0; j<people.length;j++) {
				if(people[j] != 0) {
				System.out.println(people[j]+"번학생의정보"+"이름: "+str1[j]+" ,번호 :"+int1[j]+" ,학점"+db1[j]);
				}
				i=0;
				}
		}
		if(menu == 3) {
			System.out.println("몇번학생의 정보를 볼꺼야>");
			addr = sc.nextInt();
			if(people[addr] != addr) {
				System.out.println("아직 학생의 정보가 없어.");
				i=0;
			}else {
			System.out.println("이름 :"+str1[addr]+"학생의 번호 :"+int1[addr]+"학생의 학점 :"+db1[addr]);			
			i=0;
			}
		}


		if(menu == 4) {
			System.out.println("프로그램을 종료합니다.");
			i=people.length;
		}
		 
		
	}
}
}
