package com.google.study1;

import java.util.Scanner;

public class study4 {
	public static void main(String [] args) {
		
		System.out.println("Master");
		Scanner sc = new Scanner(System.in);
		
		//1. 로그인 처리
		//1.로그인 2.종료
		// -id, pw
		
		
		//2. MMORPG
			//레벨 1부터 시작
			//골드 0
			// 1 ㅡ> 2	3마리
			// 2 ㅡ>3	6마리
			// 3 ㅡ>4	9마리
			//14 ㅡ>15	최대레벨
			
		//레벨이 5렙 달성시 1000G 지급
		//레벨이 10렙 달성시 2000G 지급
		//레벨이 15렙 달성시 3000G 지급
		
		//최종 레벨과 골드를 출력하고 게임종료
		int n = 0;
		int level = 1;
		int level2 = 3;
		int gold = 0;
		for(int i=0; i<2;i++) {
			System.out.println("아이디를 입력하세요(id = 123)");
			int a = sc.nextInt();
			System.out.println("비밀번호를 입력하세요(pw = 123)");
			int b = sc.nextInt();
				if(a == 123 && b == 123) {
				System.out.println("로그인이 되었습니다");
				n = 1;
				i = 200;
				break;
			}else {
				System.out.println("로그인 실패");
				n=0;
				i = 0;
			}
				System.out.println("종료하시겠습니까?(1 : 계속 , 2 : 종료 ");
				
				int c = sc.nextInt();
				if(c == 2) {
					System.out.println("다음에 또 이용해주세요");
					i=100;
				}else {
					i=0;
				}
	}
		if(n==1) {
		System.out.println("(세리아 키르민) 어서오세요 모험가님  ");
		for(int j=1;j<=15;j++) {
			System.out.println("현재 레벨" + j+"사냥을 시작하세요");
			System.out.println("사냥을하시려면 1을 입력하시면 됩니다");
			for(int l=0; l<level2;l++) {
				System.out.println("고블린이 나타났다!!");
				int e = sc.nextInt();
				if(e==1) {
					System.out.println("고블린 : 아파 ㅠㅠ");
					System.out.println("System : 고블린이 사망하였습니다");
				}else {
					System.out.println("1만 입력하세요");
					l--;
				}

			}
			level = level+1;
			System.out.println("레벨업! 축하드립니다~~");
			level2= level2+3;
			if( level == 5 || level == 10 || level == 15) {
				gold = level*200;
				System.out.println("레벨이"+level+"가 되셔서 gold"+gold+"를 드립니다!");
			}
			System.out.println("게임을 계속 진행 하시겠습니까? (진행 : 1 , 종료 : 2)");
			int t = sc.nextInt();
			if(t == 2) {
				System.out.println(" 재밌으셨나요? 다음에 또 이용해주세요");
				System.out.println("최종레벨"+level+"최종골드"+gold);
				j =100;
				break;
			}
			if(level == 15) {
				System.out.println("축하드립니다 만렙 찍으셨습니다!! /n 최종레벨 : 15\n 최종골드 : 3000");
			}
		}
		
		
		
	}
	}

}
